package pe.edu.upc.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import pe.edu.upc.entity.Loan;

@Repository
public interface ILoanRepository extends JpaRepository <Loan, Integer>{
	
	@Query("select i from Loan i join fetch i.loanDetails ide join fetch ide.exemplary where i.idLoan=?1")
	Optional<Loan> fetchByImportIdWhithImportDetailsWithProduct(int id);
}

