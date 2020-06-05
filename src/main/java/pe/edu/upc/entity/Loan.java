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

import org.springframework.format.annotation.DateTimeFormat;


@Entity
@Table (name="Loan")
public class Loan implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int idLoan;
	@Column (name="loanDate", nullable=false)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date loanDate;
	
	private int quantityBooks;
	@Column (name="devLoan", nullable=false)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date devLoan;
	
	@Column (name="observation", nullable=false, length=45)
	private String observation;
	
	@ManyToOne
	@JoinColumn(name = "idExemplary", nullable = false)
	private Exemplary exemplary;
	
	@ManyToOne
	@JoinColumn(name = "idAccount", nullable = false)
	private Account account;

	public Loan() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Loan(int idLoan, Date loanDate, int quantityBooks, Date devLoan, String observation, Exemplary exemplary,
			Account account) {
		super();
		this.idLoan = idLoan;
		this.loanDate = loanDate;
		this.quantityBooks = quantityBooks;
		this.devLoan = devLoan;
		this.observation = observation;
		this.exemplary = exemplary;
		this.account = account;
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

	public int getQuantityBooks() {
		return quantityBooks;
	}

	public void setQuantityBooks(int quantityBooks) {
		this.quantityBooks = quantityBooks;
	}

	public Date getDevLoan() {
		return devLoan;
	}

	public void setDevLoan(Date devLoan) {
		this.devLoan = devLoan;
	}

	public String getObservation() {
		return observation;
	}

	public void setObservation(String observation) {
		this.observation = observation;
	}

	public Exemplary getExemplary() {
		return exemplary;
	}

	public void setExemplary(Exemplary exemplary) {
		this.exemplary = exemplary;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
	
	
	
}
