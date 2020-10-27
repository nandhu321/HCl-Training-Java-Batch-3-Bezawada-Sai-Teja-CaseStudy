package com.hcl.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.validator.constraints.NotBlank;

@Entity
public class Physician {
	@Id
	@GenericGenerator(name = "patientId", strategy = "com.hcl.Dao.PhysicianIdGenarator")
	@GeneratedValue(generator = "patientId")
	private String eid;
	@NotBlank(message = "Please Enter the first Name")
	private String physicianFName;
	@NotBlank(message = "Please Enter the Last Name")
	private String physicianLName;
	@NotBlank(message = "Please Enter the deaprtment")
	private String department;
	@NotBlank(message = "Please Enter qualification")
	private String qualification;
	@NotBlank(message = "Please Enter the experience")
	private String yearsOfExperience;
	@NotBlank(message = "Please Enter the state")
	private String state;
	private String insurancePlan;

	 @OneToMany(mappedBy="physician")
	    private Set<Diagnosis> diagnosis;
	public Physician() {

	}
	public Physician(String eid, String physicianFName, String physicianLName, String department, String qualification,
			String yearsOfExperience, String state, String insurancePlan) {
		super();
		this.eid = eid;
		this.physicianFName = physicianFName;
		this.physicianLName = physicianLName;
		this.department = department;
		this.qualification = qualification;
		this.yearsOfExperience = yearsOfExperience;
		this.state = state;
		this.insurancePlan = insurancePlan;
	}
	public String getEid() {
		return eid;
	}
	public void setEid(String eid) {
		this.eid = eid;
	}
	public String getPhysicianFName() {
		return physicianFName;
	}
	public void setPhysicianFName(String physicianFName) {
		this.physicianFName = physicianFName;
	}
	public String getPhysicianLName() {
		return physicianLName;
	}
	public void setPhysicianLName(String physicianLName) {
		this.physicianLName = physicianLName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getYearsOfExperience() {
		return yearsOfExperience;
	}
	public void setYearsOfExperience(String yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
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
		return "Physician [eid=" + eid + ", physicianFName=" + physicianFName + ", physicianLName=" + physicianLName
				+ ", department=" + department + ", qualification=" + qualification + ", yearsOfExperience="
				+ yearsOfExperience + ", state=" + state + ", insurancePlan=" + insurancePlan + "]";
	}
	
	
	
	

}
