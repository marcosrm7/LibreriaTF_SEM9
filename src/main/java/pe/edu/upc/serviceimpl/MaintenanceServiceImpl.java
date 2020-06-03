package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upc.entity.Maintenance;
import pe.edu.upc.repository.IMaintenanceRepository;
import pe.edu.upc.serviceinterface.IMaintenanceService;

@Service
public class MaintenanceServiceImpl implements Serializable, IMaintenanceService {

	private static final long serialVersionUID = 1L;

	@Autowired
	private IMaintenanceRepository cR;

	@Override
	public void insert(Maintenance _maintenance) {
		// TODO Auto-generated method stub
		cR.save(_maintenance);
	}

	@Override
	public List<Maintenance> list() {
		// TODO Auto-generated method stub
		return cR.findAll();
	}

}
