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
@Table (name="Book")
public class Book implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int idBook;
	@Column (name="nameBook", nullable=false, length=45)
	private String nameBook;
	
	
	@Column (name="dateOfAdmissionBook", nullable=false)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date dateOfAdmissionBook;
	@Column (name="editionBook", nullable=false, length=2)
	private int editionBook;
	@Column (name="serieBook", nullable=false, length=2)
	private int serieBook;
	@Column (name="languageBook", nullable=false, length=45)
	private String languageBook;
	@ManyToOne
	@JoinColumn(name = "idAuthor", nullable = false)
	private Author authorBook;
	
	
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(int idBook, String nameBook, Date dateOfAdmissionBook, int editionBook, int serieBook,
			String languageBook, Author author) {
		super();
		this.idBook = idBook;
		this.nameBook = nameBook;
		this.dateOfAdmissionBook = dateOfAdmissionBook;
		this.editionBook = editionBook;
		this.serieBook = serieBook;
		this.languageBook = languageBook;
		this.authorBook = author;
	}
	public int getIdBook() {
		return idBook;
	}
	public void setIdBook(int idBook) {
		this.idBook = idBook;
	}
	public String getNameBook() {
		return nameBook;
	}
	public void setNameBook(String nameBook) {
		this.nameBook = nameBook;
	}
	public Date getDateOfAdmissionBook() {
		return dateOfAdmissionBook;
	}
	public void setDateOfAdmissionBook(Date dateOfAdmissionBook) {
		this.dateOfAdmissionBook = dateOfAdmissionBook;
	}
	public int getEditionBook() {
		return editionBook;
	}
	public void setEditionBook(int editionBook) {
		this.editionBook = editionBook;
	}
	public int getSerieBook() {
		return serieBook;
	}
	public void setSerieBook(int serieBook) {
		this.serieBook = serieBook;
	}
	public String getLanguageBook() {
		return languageBook;
	}
	public void setLanguageBook(String languageBook) {
		this.languageBook = languageBook;
	}
	public Author getAuthor() {
		return authorBook;
	}
	public void setAuthor(Author author) {
		this.authorBook = author;
	}
	
	
	
	
	
}
