package pe.edu.upc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import pe.edu.upc.entity.Book;
import pe.edu.upc.entity.Exemplary;

@Repository
public interface IExemplaryRepository extends JpaRepository <Exemplary, Integer>{
	@Query("select count(e.exemplaryBook) from Exemplary a where upper(e.exemplaryBook)=upper(:exemplaryBook) and upper(e.countExemplary)=upper(:countExemplary)")
	public int searchExemplary(@Param("exemplaryBook") Book ejemplar, @Param("countExemplary") int conteo);
}

