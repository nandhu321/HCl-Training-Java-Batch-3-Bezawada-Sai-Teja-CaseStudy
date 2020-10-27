package com.hcl.Dao;

import com.hcl.entity.Admin;

public interface AdminDao {
	public String saveAdmin(Admin theAdmin);
	 public Admin getAdmins(String theId,String thePass) ;
}
