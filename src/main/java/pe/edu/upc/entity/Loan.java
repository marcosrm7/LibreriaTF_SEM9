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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "Loan")
public class Loan implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idLoan;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "loanDate", nullable = false)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date loanDate;

	/*@Positive(message = "Solo numeros positivos.")
	@NotNull(message = "La cantidad es obligatoria")
	private int quantityBooks;*/

	@Column(name = "devLoan", nullable = false)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Future(message = "La fecha debe estar en el futuro")
	private Date devLoan;

	/*@Column(name = "observation", nullable = false, length = 45)
	private String observation;*/

	/*@ManyToOne
	@JoinColumn(name = "idExemplary", nullable = false)
	private Exemplary exemplary;*/

	/*@ManyToOne
	@JoinColumn(name = "idAccount", nullable = false)
	private Account account;*/

	public Loan() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Loan(int idLoan, Date loanDate, int quantityBooks, Date devLoan, String observation, Exemplary exemplary,
			Account account) {
		super();
		this.idLoan = idLoan;
		this.loanDate = loanDate;
		
		this.devLoan = devLoan;
		
	}

	public int getIdLoan() {
		return idLoan;
	}

	public void setIdLoan(int idLoan) {
		this.idLoan = idLoan;
	}

	public Date getLoanDate() {
		return loanDate;
	}

	public void setLoanDate(Date loanDate) {
		this.loanDate = loanDate;
	}

	

	public Date getDevLoan() {
		return devLoan;
	}

	public void setDevLoan(Date devLoan) {
		this.devLoan = devLoan;
	}



}
