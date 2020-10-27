package com.hcl.Dao;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hcl.entity.Diagnosis;
@Repository
public class DiagnosisDaoImpl implements DiagnosisDao{
	@Autowired
    private SessionFactory sessionFactory;
	  @Override
	    public String saveDiagnosis(Diagnosis theDiagnosis) {
		 try {
			 String msg="Diagnosis Details Saved Successfully";
	        Session currentSession = sessionFactory.getCurrentSession();
	     
	        currentSession.saveOrUpdate(theDiagnosis);
	        
	        return msg;
		 }
		 catch (Exception e) {
			 
			 String msg="Diagnosis Details Not Saved";
			 return msg;
		 }
		 
	    }

	
	    @SuppressWarnings("unchecked")
		public List < Diagnosis > getDiagnosis() {
	        Session session = sessionFactory.getCurrentSession();
	        CriteriaBuilder cb = session.getCriteriaBuilder();
	        CriteriaQuery < Diagnosis > cq = cb.createQuery(Diagnosis.class);
	        Root < Diagnosis > root = cq.from(Diagnosis.class);
	        cq.select(root);
	        Query query = session.createQuery(cq);
	        return query.getResultList();
	    }
	    @Override
	    public void deleteDiagnosis(int id) {
	        Session session = sessionFactory.getCurrentSession();
	        Diagnosis Diagnosis = session.byId(Diagnosis.class).load(id);
	        session.delete(Diagnosis);
	    }
	    @Override
	    public Diagnosis getDiagnosis(int theId) {
	    	try {
	        Session currentSession = sessionFactory.getCurrentSession();
	        Diagnosis theDiagnosis = currentSession.get(Diagnosis.class, theId);
	        return theDiagnosis;
	    	}
	    	catch (Exception e) {
			Diagnosis	theDiagnosis=null;
			return theDiagnosis;
			}
	        
	    }
}
