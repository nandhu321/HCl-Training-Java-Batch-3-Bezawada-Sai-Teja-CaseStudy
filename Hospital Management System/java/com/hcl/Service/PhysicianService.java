package com.hcl.Service;

import java.util.List;

import com.hcl.entity.Physician;

public interface PhysicianService {
	 public String savePhysician(Physician thePhysician);
	 public List < Physician > getPhysicians();
	 public void deletePhysician(int theId);
	 public List<Physician> getPhysicians(String theId);
	 public Physician getPhysician(String theId);
	 public Physician getPhysician(int theId);
}
