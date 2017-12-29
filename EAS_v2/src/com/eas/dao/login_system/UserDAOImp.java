package com.eas.dao.login_system;

import org.springframework.stereotype.Repository;

import com.eas.util.HibernateDAO;

@Repository("UserDAO")
public class UserDAOImp extends HibernateDAO implements UserDAO {
	public int Slogin(String id,String pw){
		return super.Slogin(id, pw);
	}
	public int Tlogin(String id,String pw){
		return super.Tlogin(id, pw);
	}
}
