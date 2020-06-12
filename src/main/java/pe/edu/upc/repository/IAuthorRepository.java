package pe.edu.upc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import pe.edu.upc.entity.Author;

@Repository
public interface IAuthorRepository extends JpaRepository<Author, Integer> {
	@Query("select count(a.nameAuthor) from Author a where upper(a.nameAuthor)= upper(:nameAuthor) and upper(a.lastnameAuthor)=upper(:lastnameAuthor)")
	public int searchAuthor(@Param("nameAuthor") String nombre, @Param("lastnameAuthor") String apellido);
	
	@Query("from Author a where upper(a.nameAuthor) = upper(:parametro) or upper(a.lastnameAuthor) = upper(:parametro) or upper(a.nameAuthor) like %:parametro% or lower(a.nameAuthor) like %:parametro% or lower(a.lastnameAuthor) like %:parametro%  or upper(a.lastnameAuthor) like %:parametro%" )
	List<Author> findBynameAuthor(@Param("parametro")String nameAuthor);
}
