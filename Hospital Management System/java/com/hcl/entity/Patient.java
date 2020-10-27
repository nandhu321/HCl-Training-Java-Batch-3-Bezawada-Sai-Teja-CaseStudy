package com.hcl.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name="patient")
public class Patient {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pid;
	@NotBlank(message = "Please Enter the first Name")
	private String firstName;
	@NotBlank(message = "Please Enter the Last Name")
	private String lastName;
	@NotBlank(message = "password must not be empty")
	private String password;
	@Pattern(regexp = "\\d{2}-\\d{2}-\\d{4}",message = "Please enter a valid date")
	private String dob; 
	@Email(message ="Invalid email")
	private String email;
	@NotBlank(message = "Please enter the contact Number")
	@Size(max = 10,message = "Invalid Number")
	private String contactNumber;
	@NotBlank(message = "please enter the state")
	private String state;
	
	private String insurancePlan;
	@OneToOne
	@JoinColumn(name="Diagnosis ID")
	private Diagnosis diagnosis;
	  
	
	public Patient() {

	}

	public Patient(int pid, String firstName, String lastName, String password, String dob, String email,
			String contactNumber, String state, String insurancePlan) {
		super();
		this.pid = pid;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.dob = dob;
		this.email = email;
		this.contactNumber = contactNumber;
		this.state = state;
		this.insurancePlan = insurancePlan;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getInsurancePlan() {
		return insurancePlan;
	}

	public void setInsurancePlan(String insurancePlan) {
		this.insurancePlan = insurancePlan;
	}

	@Override
	public String toString() {
		return "Patient [pid=" + pid + ", firstName=" + firstName + ", lastName=" + lastName + ", password=" + password
				+ ", dob=" + dob + ", email=" + email + ", contactNumber=" + contactNumber + ", state=" + state
				+ ", insurancePlan=" + insurancePlan + "]";
	}

}
