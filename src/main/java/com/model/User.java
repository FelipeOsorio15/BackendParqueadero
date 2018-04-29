package com.model;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name= "users")
@Access(AccessType.FIELD)
public class User extends ParentEntity{

	
	private static final long serialVersionUID = 813149513582487086L;
	
	@Column(name="first_name", nullable = false , length =250)
	private String firstName;
	
	@Column(name="addres", nullable = false , length =250)
	private String addres;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getAddres() {
		return addres;
	}
	public void setAddres(String addres) {
		this.addres = addres;
	}
	
}
