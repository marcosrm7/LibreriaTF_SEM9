package pe.edu.upc.serviceinterface;

import java.util.List;

import pe.edu.upc.entity.Author;

public interface IAuthorService {
	public void insert (Author _author);
	List <Author> list();
}
