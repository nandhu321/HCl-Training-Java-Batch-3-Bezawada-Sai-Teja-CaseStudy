package com.hcl.Service;

import java.util.List;

import com.hcl.entity.Patient;

public interface PatientService {
	 public String savePatient(Patient thePatient);
	 public List < Patient > getPatients();
	 public void deletePatient(int theId);
	 public Patient getPatient(int theId);
}
