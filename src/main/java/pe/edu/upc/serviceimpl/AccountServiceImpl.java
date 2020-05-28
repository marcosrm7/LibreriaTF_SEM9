package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upc.entity.Account;
import pe.edu.upc.repository.IAccountRepository;
import pe.edu.upc.serviceinterface.IAccountService;

@Service
public class AccountServiceImpl implements Serializable, IAccountService {

	private static final long serialVersionUID=1L;
	
	@Autowired
	private IAccountRepository cR;
	
	@Override
	public void insert(Account _user) {
		// TODO Auto-generated method stub
		cR.save(_user);
	}

	@Override
	public List<Account> list() {
		// TODO Auto-generated method stub
		return cR.findAll();
	}
}
