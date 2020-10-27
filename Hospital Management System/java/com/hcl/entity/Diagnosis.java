package com.hcl.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

@Entity
public class Diagnosis {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int did;
	@NotNull(message = "please enter the pid")
	private int pid;
	@NotBlank(message = "please enter the symptoms")
	private String symptoms;
	@NotBlank(message = "Please enter the diagnosis provided")
	private String diagnosisProvided;
	@NotBlank(message = "Please enter the doctor id")
	private String eid;
	@NotBlank(message = "Please enter the date")
	@Pattern(regexp = "\\d{2}-\\d{2}-\\d{4}",message = "Please enter a valid date")
	private String dod;
	
	private String followUpRequired;
	
	@Pattern(regexp = "\\d{2}-\\d{2}-\\d{4}",message = "Please enter a valid date")
	@NotBlank(message = "Please enter the date required")
	private String dof;
	@NotBlank(message = "Please enter the bill Amount")
	private String billAmount;
	@Size(max = 16,message = "Invalid Card Number")
	@NotBlank(message = "Please enter the card number")
	private String cardNumber;
	@NotBlank(message = "Please enter the mode of payment")
	private String modeOfPayment;
	@OneToOne(mappedBy="diagnosis")
	private Patient patient;
	@ManyToOne
    @JoinColumn(name="PhysicianId", nullable=false)
    private Physician physician;
	public Diagnosis() {

	}
	public Diagnosis(int did, int pid, String symptoms, String diagnosisProvided, String eid, String dod,
			String followUpRequired, String dof, String billAmount, String cardNumber, String modeOfPayment) {
		super();
		this.did = did;
		this.pid = pid;
		this.symptoms = symptoms;
		this.diagnosisProvided = diagnosisProvided;
		this.eid = eid;
		this.dod = dod;
		this.followUpRequired = followUpRequired;
		this.dof = dof;
		this.billAmount = billAmount;
		this.cardNumber = cardNumber;
		this.modeOfPayment = modeOfPayment;
	}
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getSymptoms() {
		return symptoms;
	}
	public void setSymptoms(String symptoms) {
		this.symptoms = symptoms;
	}
	public String getDiagnosisProvided() {
		return diagnosisProvided;
	}
	public void setDiagnosisProvided(String diagnosisProvided) {
		this.diagnosisProvided = diagnosisProvided;
	}
	
	public String getEid() {
		return eid;
	}
	public void setEid(String eid) {
		this.eid = eid;
	}
	public String getDod() {
		return dod;
	}
	public void setDod(String dod) {
		this.dod = dod;
	}
	public String getFollowUpRequired() {
		return followUpRequired;
	}
	public void setFollowUpRequired(String followUpRequired) {
		this.followUpRequired = followUpRequired;
	}
	
	public String getDof() {
		return dof;
	}
	public void setDof(String dof) {
		this.dof = dof;
	}
	public String getBillAmount() {
		return billAmount;
	}
	public void setBillAmount(String billAmount) {
		this.billAmount = billAmount;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getModeOfPayment() {
		return modeOfPayment;
	}
	public void setModeOfPayment(String modeOfPayment) {
		this.modeOfPayment = modeOfPayment;
	}
	@Override
	public String toString() {
		return "Diagnosis [did=" + did + ", pid=" + pid + ", symptoms=" + symptoms + ", diagnosisProvided="
				+ diagnosisProvided + ", adminsteredBy=" + eid + ", dod=" + dod + ", followUpRequired="
				+ followUpRequired + ", dof=" + dof + ", billAmount=" + billAmount + ", cardNumber=" + cardNumber
				+ ", modeOfPayment=" + modeOfPayment + "]";
	}
	
}
