package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upc.entity.User;
import pe.edu.upc.repository.IUserRepository;
import pe.edu.upc.serviceinterface.IUserService;

@Service
public class UserServiceImpl implements Serializable, IUserService {

	private static final long serialVersionUID=1L;
	
	@Autowired
	private IUserRepository cR;
	
	@Override
	public void insert(User _user) {
		// TODO Auto-generated method stub
		cR.save(_user);
	}

	@Override
	public List<User> list() {
		// TODO Auto-generated method stub
		return cR.findAll();
	}
}
