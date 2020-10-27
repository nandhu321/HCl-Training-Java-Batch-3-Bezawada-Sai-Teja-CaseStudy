package com.hcl.Dao;

import java.util.List;

//import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.hcl.entity.Physician;
@Repository
public class PhysicianDaoImpl implements PhysicianDao {
	@Autowired
    private SessionFactory sessionFactory;
	  @Override
	    public String savePhysician(Physician thePhysician) {
		  	try {
		  		String msg="Physician Added Successfully";
	        Session currentSession = sessionFactory.getCurrentSession();
	        currentSession.saveOrUpdate(thePhysician);
	        return msg;
	        
		  	}
		  	catch (Exception e) {
				String msg="Not Added";
				return msg;
			}
	    }
	    public List < Physician > getPhysicians() {
	        Session session = sessionFactory.getCurrentSession();
	        CriteriaBuilder cb = session.getCriteriaBuilder();
	        CriteriaQuery < Physician > cq = cb.createQuery(Physician.class);
	        Root < Physician > root = cq.from(Physician.class);
	        cq.select(root);
	        Query<Physician> query = session.createQuery(cq);
	        return query.getResultList();
	    }
	    @Override
	    public void deletePhysician(int id) {
	        Session session = sessionFactory.getCurrentSession();
	        Physician Physician = session.byId(Physician.class).load(id);
	        session.delete(Physician);
	    }
	    @Override
	    @Transactional
	    public List<Physician> getPhysicians(String theId) {
	        Session currentSession = sessionFactory.getCurrentSession();
	        Query<?> q1=currentSession.createQuery("from Physician where state= :i OR insurancePlan= :i OR department= :i");
			q1.setParameter("i", theId);
			try 
		    {
				List<Physician> temp= (List<Physician>) q1.getResultList();
				System.out.println(temp);
		
				
				return temp;
			}
			catch(Exception e)
			{ 
			  System.out.println("error in finding Physician records "+e);
			  return null;
			}
			
	    }
	    @Override
	    @Transactional
	    public Physician getPhysician(String theId) {
	        Session currentSession = sessionFactory.getCurrentSession();
	        Query<?> q1=currentSession.createQuery("from Physician where id= :i");
			q1.setParameter("i", theId);
			try 
		    {
				Physician temp= (Physician)q1.uniqueResult();
				System.out.println(temp);
		
				if(temp.getState()!=null)
				System.out.println("Physician found");
				return temp;
			}
			catch(Exception e)
			{ 
			  System.out.println("error in finding Physician records "+e);
			  return null;
			}
			
	    }
	    @Override
	    public Physician getPhysician(int theId) {
	    	try {
	        Session currentSession = sessionFactory.getCurrentSession();
	        Physician thePhysician = currentSession.get(Physician.class, theId);
	        return thePhysician;
	    }
	    	catch (Exception e) {
			Physician thePhysician=null;
			return thePhysician;
			}
	    }
}
