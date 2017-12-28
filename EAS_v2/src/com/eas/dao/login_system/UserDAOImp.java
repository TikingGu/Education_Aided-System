package com.eas.dao.login_system;

import org.springframework.stereotype.Repository;

import com.eas.util.HibernateDAO;

@Repository("UserDAO")
public class UserDAOImp extends HibernateDAO implements UserDAO {
	public boolean Slogin(String id,String pw){
		return super.Slogin(id, pw);
	}
	public boolean Tlogin(String id,String pw){
		return super.Tlogin(id, pw);
	}
}
