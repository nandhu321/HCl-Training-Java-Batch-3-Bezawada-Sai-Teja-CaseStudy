package com.hcl.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hcl.Dao.DiagnosisDao;
import com.hcl.entity.Diagnosis;
@Service
public class DiagnosisServiceImpl implements DiagnosisService {
	@Autowired
    private DiagnosisDao DiagnosisDao;
	 @Transactional
	    public String saveDiagnosis(Diagnosis theDiagnosis) {
	       String msg= DiagnosisDao.saveDiagnosis(theDiagnosis);
	       return msg;
	    }
	 @Override
	    @Transactional
	    public List < Diagnosis > getDiagnosis() {
	        return DiagnosisDao.getDiagnosis();
	    }
	 @Override
	    @Transactional
	    public void deleteDiagnosis(int theId) {
	        DiagnosisDao.deleteDiagnosis(theId);
	    }
	 @Override
	    @Transactional
	    public Diagnosis getDiagnosis(int theId) {
	        return DiagnosisDao.getDiagnosis(theId);
	    }
}
