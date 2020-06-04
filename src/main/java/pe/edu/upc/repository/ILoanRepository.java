package pe.edu.upc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.entity.Loan;

@Repository
public interface ILoanRepository extends JpaRepository <Loan, Integer>{
	
}

