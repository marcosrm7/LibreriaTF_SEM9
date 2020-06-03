package pe.edu.upc.serviceinterface;

import java.util.List;

import pe.edu.upc.entity.Maintenance;

public interface IMaintenanceService {
	public void insert(Maintenance _maintenance);

	List<Maintenance> list();

}
