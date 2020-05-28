package pe.edu.upc.serviceinterface;

import java.util.List;

import pe.edu.upc.entity.Account;

public interface IAccountService {
	public void insert (Account _account);
	List <Account> list();
	
}
