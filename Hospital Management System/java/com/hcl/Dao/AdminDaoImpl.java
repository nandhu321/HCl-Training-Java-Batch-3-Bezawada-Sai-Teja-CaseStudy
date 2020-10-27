package com.hcl.Dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.hcl.entity.Admin;
import com.hcl.entity.Physician;
@Repository
public class AdminDaoImpl implements AdminDao{
	@Autowired
    private SessionFactory sessionFactory;
	  @Override
	    public String saveAdmin(Admin theAdmin) {
		  try {
	        Session currentSession = sessionFactory.getCurrentSession();
	        
	        currentSession.saveOrUpdate(theAdmin);
	        String msg="Registered Succesfully";
	        return msg;
		  }
		  catch (Exception e) {
			String msg="Registration Failed";
			return msg;
		}
	    }
	  @Override
	    @Transactional
	    public Admin getAdmins(String theId,String thePass) {
	        Session currentSession = sessionFactory.getCurrentSession();
	        Query<?> q1=currentSession.createQuery("from Admin where username= :i AND password= :j");
			q1.setParameter("i", theId);
			q1.setParameter("j", thePass);
			try 
		    {
				Admin temp= (Admin) q1.uniqueResult();
				System.out.println(temp);
		
				
				return temp;
			}
			catch(Exception e)
			{ 
			  System.out.println("error in finding Physician records "+e);
			  return null;
			}
			
	    }
}
