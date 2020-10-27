package com.hcl.Dao;

import java.util.List;

import com.hcl.entity.Patient;

public interface PatientDao {
	 public String savePatient(Patient thePatient);
	 public List < Patient > getPatients();
	  public void deletePatient(int theId);
	  public Patient getPatient(int theId);
}
