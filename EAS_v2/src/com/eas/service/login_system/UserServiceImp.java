package com.eas.service.login_system;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.eas.dao.login_system.UserDAO;
import com.eas.model.Student;
import com.eas.model.Teacher;
@Service("UserServiceI")
public class UserServiceImp implements UserServiceI {
	@Resource(name="UserDAO")
	private UserDAO userDAO;
	public int Slogin(String id,String pw){
		return userDAO.Slogin(id,pw);
	}
	public int Tlogin(String id,String pw){
		return userDAO.Tlogin(id, pw);
	}
	
	public Student get_student(String sid){
		return userDAO.get_student(sid);
	}
	public Teacher get_teacher(String tid){
		return userDAO.get_teacher(tid);
	}
}
