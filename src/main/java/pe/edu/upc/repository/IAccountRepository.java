package pe.edu.upc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import pe.edu.upc.entity.Account;

@Repository
public interface IAccountRepository extends JpaRepository<Account, Integer> {
	@Query("select count(a.nameAccount) from Account a where upper(a.nameAccount) = upper(:nameAccount)")
	public int SearchCategory(@Param("nameAccount") String nombre);
}