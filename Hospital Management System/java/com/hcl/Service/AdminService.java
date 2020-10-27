package com.hcl.Service;

import com.hcl.entity.Admin;

public interface AdminService {
	 public String saveAdmin(Admin theAdmin);
	 public Admin getAdmins(String theId,String thePass) ;
}
