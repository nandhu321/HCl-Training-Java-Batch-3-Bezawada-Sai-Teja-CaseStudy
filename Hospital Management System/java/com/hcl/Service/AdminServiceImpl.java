package com.hcl.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hcl.Dao.AdminDao;
import com.hcl.entity.Admin;
@Service
public class AdminServiceImpl implements AdminService {
	@Autowired
    private AdminDao adminDao;
	 @Transactional
	    public String saveAdmin(Admin theAdmin) {
	        String msg=adminDao.saveAdmin(theAdmin);
	        return msg;
	    }
	 @Override
	    @Transactional
	    public Admin getAdmins(String theId,String thePass) {
	        return adminDao.getAdmins(theId,thePass);
	    }
}
