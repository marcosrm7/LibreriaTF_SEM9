package pe.edu.upc.serviceinterface;

import java.util.List;

import pe.edu.upc.entity.Author;

public interface IAuthorService {

	public int insert(Author author);

	List<Author> list();

	public void delete(int idAuthor);
}
