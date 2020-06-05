package pe.edu.upc.serviceinterface;

import java.util.List;

import pe.edu.upc.entity.Book;

public interface IBookService {
	
	public void insert(Book book);

	List<Book> list();
}
