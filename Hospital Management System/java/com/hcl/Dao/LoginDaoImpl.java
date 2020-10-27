package com.hcl.Dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class LoginDaoImpl implements LoginDao{
	@Autowired
    private SessionFactory sessionFactory;
	 @Override
	    @Transactional
	    public String validate(String username,String password) {
	        Session currentSession = sessionFactory.getCurrentSession();
	        System.out.println(currentSession.createQuery("from Logindetails "));
	        /*
			q1.setParameter("i", username);
			q1.setParameter("j", password);
			try 
		    {
				LoginDetails temp= (LoginDetails)q1.uniqueResult();
				
		
				if(temp.getUsername()!=null)
					System.out.println("Data found");
				return "success";
			}
			catch(Exception e)
			{ 
			  
			  return "failed";
			}*/
	        return "success";
			
	    }

}
