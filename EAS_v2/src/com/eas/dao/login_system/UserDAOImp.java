package com.eas.dao.login_system;

import org.springframework.stereotype.Repository;

import com.eas.util.HibernateDAO;
import com.eas.model.Student;
import com.eas.model.Teacher;
@Repository("UserDAO")
public class UserDAOImp extends HibernateDAO implements UserDAO {
	public int Slogin(String id,String pw){
		return super.Slogin(id, pw);
	}
	public int Tlogin(String id,String pw){
		return super.Tlogin(id, pw);
	}
	
	public Student get_student(String sid){
		return super.get_student(sid);
	}
	public Teacher get_teacher(String tid){
		return super.get_teacher(tid);
	}
}
