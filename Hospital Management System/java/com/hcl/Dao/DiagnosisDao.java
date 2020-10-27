package com.hcl.Dao;

import java.util.List;

import com.hcl.entity.Diagnosis;

public interface DiagnosisDao {
	public String saveDiagnosis(Diagnosis theDiagnosis);
	 public List < Diagnosis > getDiagnosis();
	  public void deleteDiagnosis(int theId);
	  public Diagnosis getDiagnosis(int theId);
}
