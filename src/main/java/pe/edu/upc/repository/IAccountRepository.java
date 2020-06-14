package pe.edu.upc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upc.entity.Account;

@Repository
public interface IAccountRepository extends JpaRepository<Account, Integer> {//no es long en vez de Integer????
	public Account findByAccount(String account);
}