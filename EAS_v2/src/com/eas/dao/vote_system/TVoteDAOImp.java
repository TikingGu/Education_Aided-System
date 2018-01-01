package com.eas.dao.vote_system;

import org.springframework.stereotype.Repository;

import com.eas.util.HibernateDAO;

@Repository("TVoteDAO")
public class TVoteDAOImp extends HibernateDAO implements TVoteDAO{
	public void add(Object object){
		super.add(object);
	}
}
