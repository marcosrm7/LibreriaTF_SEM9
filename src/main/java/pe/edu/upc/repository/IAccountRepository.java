package pe.edu.upc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upc.entity.Account;

@Repository
public interface IAccountRepository extends JpaRepository <Account, Integer> {

}
