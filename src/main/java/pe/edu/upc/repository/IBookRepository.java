package pe.edu.upc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import pe.edu.upc.entity.Book;

@Repository
public interface IBookRepository extends JpaRepository<Book, Integer> {
	@Query("select count(a.nameBook) from Book a where upper(a.nameBook)=upper(:nameBook)")
	public int searchBook(@Param("nameBook") String nombre);
	
	
	@Query("from Book a where lower(a.nameBook) like lower(concat('%', :parametro,'%')) ")
	List<Book> findBynameBook(@Param("parametro")String nameBook);
}
