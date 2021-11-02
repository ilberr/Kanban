package com.TD.Kanban.Domain;

import java.time.LocalDate;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Developer {
	private @Id Long id;
	private String firstname;
	private String lastname;
	private String password;
	private String email;
	private LocalDate startContract;
	
	
	public Developer(Long id, String firstname, String lastname, String password, String email,
			LocalDate startContract) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.password = password;
		this.email = email;
		this.startContract = startContract;
	}
	
	



	public void setId(Long id) {
		this.id = id;
	}


	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public LocalDate getStartContract() {
		return startContract;
	}


	public void setStartContract(LocalDate startContract) {
		this.startContract = startContract;
	}


	@Override
	public int hashCode() {
		return Objects.hash(email, firstname, id, lastname, password, startContract);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Developer other = (Developer) obj;
		return Objects.equals(email, other.email) && Objects.equals(firstname, other.firstname)
				&& Objects.equals(id, other.id) && Objects.equals(lastname, other.lastname)
				&& Objects.equals(password, other.password) && Objects.equals(startContract, other.startContract);
	}
	
	@Override
	public String toString() {
		return "Developer [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", password=" + password
				+ ", email=" + email + ", startContract=" + startContract + "]";
	}

	
	

}

