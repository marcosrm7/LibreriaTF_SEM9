package pe.edu.upc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import pe.edu.upc.entity.Account;

@Repository
public interface IAccountRepository extends JpaRepository<Account, Integer> {//no es long en vez de Integer????
	
	@Query("from Account a where upper(a.correoAccount)=upper(:parametro)")
	public Account findByCorreoAccount(@Param("parametro")String account);
}