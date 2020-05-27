package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name="User")
public class User implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int idUser;
	@Column (name="nameUser", nullable=false, length=45)
	private String nameUser;		
	@Column (name="lastNameUser", nullable=false, length=45)	
	private String lastNameUser;
	@Column (name="passwordUser", nullable=false, length=20)
	private String passwordUser;
	@Column (name="dniUser", nullable=true, length=8)
	private int dniUser;
	@Column (name="correoUser", nullable=false, length=45)
	private String correoUser;
	@ManyToOne
	@JoinColumn(name = "roleUser", nullable = false)
	private Role roleUser;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int idUser, String nameUser, String lastNameUser, String passwordUser, int dniUser, String correoUser,
			Role roleUser) {
		super();
		this.idUser = idUser;
		this.nameUser = nameUser;
		this.lastNameUser = lastNameUser;
		this.passwordUser = passwordUser;
		this.dniUser = dniUser;
		this.correoUser = correoUser;
		this.roleUser = roleUser;
	}
	public int getIdUser() {
		return idUser;
	}
	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}
	public String getNameUser() {
		return nameUser;
	}
	public void setNameUser(String nameUser) {
		this.nameUser = nameUser;
	}
	public String getLastNameUser() {
		return lastNameUser;
	}
	public void setLastNameUser(String lastNameUser) {
		this.lastNameUser = lastNameUser;
	}
	public String getPasswordUser() {
		return passwordUser;
	}
	public void setPasswordUser(String passwordUser) {
		this.passwordUser = passwordUser;
	}
	public int getDniUser() {
		return dniUser;
	}
	public void setDniUser(int dniUser) {
		this.dniUser = dniUser;
	}
	public String getCorreoUser() {
		return correoUser;
	}
	public void setCorreoUser(String correoUser) {
		this.correoUser = correoUser;
	}
	public Role getRoleUser() {
		return roleUser;
	}
	public void setRoleUser(Role roleUser) {
		this.roleUser = roleUser;
	}
	
	
	
	
	
}
