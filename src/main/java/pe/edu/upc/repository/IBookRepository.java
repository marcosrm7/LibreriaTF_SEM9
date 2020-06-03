package pe.edu.upc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import pe.edu.upc.entity.Book;

@Repository
public interface IBookRepository extends JpaRepository<Book, Integer> {
	@Query("select count(b.nameBook) from Book b, Author a where upper(b.nameBook)=upper(:nameBook) and a.idAuthor=:idAuthor")
	public int searchBook(@Param("nameBook") String nombre, @Param("idAuthor") int autor);
}
