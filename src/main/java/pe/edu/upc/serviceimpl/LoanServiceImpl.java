package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upc.entity.Loan;
import pe.edu.upc.repository.ILoanRepository;
import pe.edu.upc.serviceinterface.ILoanService;

@Service
public class LoanServiceImpl implements Serializable, ILoanService{
	private static final long serialVersionUID=1L;
	
	@Autowired
	private ILoanRepository lR;

	@Override
	public void insert(Loan l) {
		// TODO Auto-generated method stub
		lR.save(l);
	}

	@Override
	public List<Loan> list() {
		// TODO Auto-generated method stub
		return lR.findAll();
	}
	
	
}