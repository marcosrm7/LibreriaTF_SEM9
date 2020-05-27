package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upc.entity.Role;
import pe.edu.upc.repository.IRoleRepository;
import pe.edu.upc.serviceinterface.IRoleService;

@Service
public class RoleServiceImpl implements Serializable, IRoleService{
	
	private static final long serialVersionUID=1L;
	
	@Autowired
	private IRoleRepository cR;
	
	@Override
	public void insert(Role _role) {
		// TODO Auto-generated method stub
		cR.save(_role);
	}

	@Override
	public List<Role> list() {
		// TODO Auto-generated method stub
		return cR.findAll();
	}
	
}
