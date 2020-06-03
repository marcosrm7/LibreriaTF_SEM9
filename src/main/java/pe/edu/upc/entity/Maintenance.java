package pe.edu.upc.entity;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name = "Mantenimiento")

public class Maintenance implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cod_maintenance;
	private Date Datemant;
	@Column(name = "observation", nullable = false, length = 45)
	private String observation;
	@ManyToOne
	@JoinColumn(name = "idBook", nullable = false)
	private Book book;
	public Maintenance() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Maintenance(int cod_maintenance, Date datemant, String observation, Book book) {
		super();
		this.cod_maintenance = cod_maintenance;
		Datemant = datemant;
		this.observation = observation;
		this.book = book;
	}
	public int getCod_maintenance() {
		return cod_maintenance;
	}
	public void setCod_maintenance(int cod_maintenance) {
		this.cod_maintenance = cod_maintenance;
	}
	public Date getDatemant() {
		return Datemant;
	}
	public void setDatemant(Date datemant) {
		Datemant = datemant;
	}
	public String getObservation() {
		return observation;
	}
	public void setObservation(String observation) {
		this.observation = observation;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
