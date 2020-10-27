package com.hcl.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hcl.Dao.LoginDao;
@Service
public class LoginServiceImpl implements LoginService{
	@Autowired
	private LoginDao loginDao;
	@Override
    @Transactional
    public String validate(String user,String pass) {
        String msg=loginDao.validate(user,pass);
        return msg;
    }

}
