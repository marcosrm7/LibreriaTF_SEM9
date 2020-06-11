package pe.edu.upc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import pe.edu.upc.entity.Author;

@Repository
public interface IAuthorRepository extends JpaRepository<Author, Integer> {
	@Query("select count(a.nameAuthor) from Author a where upper(a.nameAuthor)=upper(:nameAuthor) and upper(a.lastnameAuthor)=upper(:lastnameAuthor)")
	public int searchAuthor(@Param("nameAuthor") String nombre, @Param("lastnameAuthor") String apellido);
	
	List<Author> findBynameAuthor(String nameAuthor);
}
