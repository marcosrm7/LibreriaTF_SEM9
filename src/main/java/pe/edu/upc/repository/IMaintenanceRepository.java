package pe.edu.upc.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.entity.Maintenance;

@Repository
public interface  IMaintenanceRepository extends JpaRepository<Maintenance, Integer> {
	@Query("select count(m.observation) from Maintenance m where upper(m.observation)=upper(:observation) and upper(m.observation)= upper('Malogrado')")
	public int searchMaintenance(@Param("observation") String nombre );

}
