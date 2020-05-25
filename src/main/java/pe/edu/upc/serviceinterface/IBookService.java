package pe.edu.upc.serviceinterface;

import java.util.List;

import pe.edu.upc.entity.Book;

public interface IBookService {
	public void insert (Book _book);
	List <Book> list();
}
