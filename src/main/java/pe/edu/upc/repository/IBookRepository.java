package pe.edu.upc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upc.entity.Book;

@Repository
public interface IBookRepository extends JpaRepository<Book, Integer> {
	
}
