package pe.edu.upc.serviceinterface;

import java.util.List;

import pe.edu.upc.entity.Loan;

public interface ILoanService {
	public void insert (Loan l);
	List <Loan> list();
}
