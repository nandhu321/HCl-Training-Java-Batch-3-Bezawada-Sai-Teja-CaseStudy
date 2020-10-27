package com.hcl.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotBlank;

@Entity
public class Admin {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int aid;
	@NotBlank(message = "Please enter the  name")
	private String name;
	@NotBlank(message = "Please enter the username")
	private String username;
	@NotBlank(message = "Please enter the username")
	private String password;
	public Admin() {
		
	}
	public Admin(int aid, String name, String username, String password) {
		super();
		this.aid = aid;
		this.name = name;
		this.username = username;
		this.password = password;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Admin [aid=" + aid + ", name=" + name + ", username=" + username + ", password=" + password + "]";
	}
	
	
}
