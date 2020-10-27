package com.hcl.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class LoginDetails {
	@Id
	@GeneratedValue( strategy =GenerationType.IDENTITY)
	private int gd;
	private int lid;
	private String username;
	private String password;
	public LoginDetails() {
	
	}
	public LoginDetails(int gd,int lid, String username, String password) {
		super();
		this.gd=gd;
		this.lid = lid;
		this.username = username;
		this.password = password;
	}
	public int getLid() {
		return lid;
	}
	public int getGd() {
		return gd;
	}
	public void setGd(int gd) {
		this.gd = gd;
	}
	public void setLid(int lid) {
		this.lid = lid;
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
		return "LoginDetails [lid=" + lid + ", username=" + username + ", password=" + password + "]";
	}
	
}
