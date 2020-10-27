package com.hcl.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hcl.Dao.PhysicianDao;
import com.hcl.entity.Physician;
@Service
public class PhysicianServiceImpl implements PhysicianService {
	@Autowired
	private PhysicianDao physicianDao;
	@Override
	@Transactional
	public String savePhysician(Physician thePhysician) {
		String msg=physicianDao.savePhysician(thePhysician);
		return msg;
	}
	 @Override
	    @Transactional
	    public List < Physician > getPhysicians() {
	        return physicianDao.getPhysicians();
	    }
	 @Override
	    @Transactional
	    public void deletePhysician(int theId) {
	        physicianDao.deletePhysician(theId);
	    }
	 @Override
	    @Transactional
	    public List<Physician> getPhysicians(String theId) {
	        return physicianDao.getPhysicians(theId);
	    }
	 @Override
	    @Transactional
	    public Physician getPhysician(String theId) {
	        return physicianDao.getPhysician(theId);
	    }
	 @Override
	    @Transactional
	    public Physician getPhysician(int theId) {
	        return physicianDao.getPhysician(theId);
	    }
}
