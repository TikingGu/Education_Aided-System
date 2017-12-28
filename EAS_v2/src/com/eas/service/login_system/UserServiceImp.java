package com.eas.service.login_system;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.eas.dao.login_system.UserDAO;

@Service("UserServiceI")
public class UserServiceImp implements UserServiceI {
	@Resource(name="UserDAO")
	private UserDAO userDAO;
	public boolean Slogin(String id,String pw){
		return userDAO.Slogin(id,pw);
	}
	public boolean Tlogin(String id,String pw){
		return userDAO.Tlogin(id, pw);
	}
}
