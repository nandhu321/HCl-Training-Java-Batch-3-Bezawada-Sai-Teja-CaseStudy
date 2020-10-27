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

import com.hcl.entity.Patient;

@Repository
public class PatientDaoImpl implements PatientDao{
	@Autowired
    private SessionFactory sessionFactory;
	  @Override
	    public String savePatient(Patient thePatient) {
		  try {
	        Session currentSession = sessionFactory.getCurrentSession();
	        
	        currentSession.saveOrUpdate(thePatient);
	        String msg="Enrolled Succesfully";
	        return msg;
		  }
		  catch (Exception e) {
			String msg="Enrolled Failed";
			return msg;
		}
	    }

	
	    @SuppressWarnings("unchecked")
		public List < Patient > getPatients() {
	        Session session = sessionFactory.getCurrentSession();
	        CriteriaBuilder cb = session.getCriteriaBuilder();
	        CriteriaQuery < Patient > cq = cb.createQuery(Patient.class);
	        Root < Patient > root = cq.from(Patient.class);
	        cq.select(root);
	        Query query = session.createQuery(cq);
	        
	        return query.getResultList();
	    }
	    @Override
	    public void deletePatient(int id) {
	        Session session = sessionFactory.getCurrentSession();
	        Patient patient = session.byId(Patient.class).load(id);
	        session.delete(patient);
	    }
	    @Override
	    public Patient getPatient(int theId) {
	    	try {
	        Session currentSession = sessionFactory.getCurrentSession();
	        Patient thePatient = currentSession.get(Patient.class, theId);
	        return thePatient;
	    	}
	    	catch (Exception e) {
	    		 Patient thePatient =null;
	    		 return thePatient;
			}
	    }
}
