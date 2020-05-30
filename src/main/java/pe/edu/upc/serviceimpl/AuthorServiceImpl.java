package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upc.entity.Author;
import pe.edu.upc.repository.IAuthorRepository;
import pe.edu.upc.serviceinterface.IAuthorService;

@Service
public class AuthorServiceImpl implements Serializable, IAuthorService {

	private static final long serialVersionUID = 1L;
	/* Para que traiga el metodo que se va a utilizar */

	@Autowired
	private IAuthorRepository cR;

	@Override
	public List<Author> list() {
		return cR.findAll();
	}

	@Override
	public int insert(Author author) {
		int rpta = cR.searchAuthor(author.getNameAuthor(), author.getLastnameAuthor());
		if (rpta == 0) {
			cR.save(author);
		}
		return rpta;
	}
}
