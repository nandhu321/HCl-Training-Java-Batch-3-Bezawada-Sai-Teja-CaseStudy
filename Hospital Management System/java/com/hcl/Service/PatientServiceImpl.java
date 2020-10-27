package com.hcl.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hcl.Dao.PatientDao;
import com.hcl.entity.Patient;

@Service
public class PatientServiceImpl implements PatientService{
	@Autowired
    private PatientDao patientDao;
	 @Transactional
	    public String savePatient(Patient thePatient) {
	        String msg=patientDao.savePatient(thePatient);
	        return msg;
	    }
	 @Override
	    @Transactional
	    public List < Patient > getPatients() {
	        return patientDao.getPatients();
	    }
	 @Override
	    @Transactional
	    public void deletePatient(int theId) {
	        patientDao.deletePatient(theId);
	    }
	 @Override
	    @Transactional
	    public Patient getPatient(int theId) {
	        return patientDao.getPatient(theId);
	    }
}
