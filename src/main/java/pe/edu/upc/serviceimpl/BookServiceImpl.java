package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upc.entity.Book;
import pe.edu.upc.repository.IBookRepository;
import pe.edu.upc.serviceinterface.IBookService;

@Service
public class BookServiceImpl implements Serializable, IBookService{
	private static final long serialVersionUID=1L;
	/*Para que traiga el mentodo que se va a utilizar*/
	
	@Autowired
	private IBookRepository cR;
	
	@Override
	public void insert(Book _book) {
		// TODO Auto-generated method stub
		cR.save(_book);
	}

	@Override
	public List<Book> list() {
		// TODO Auto-generated method stub
		return cR.findAll();
	}
}
