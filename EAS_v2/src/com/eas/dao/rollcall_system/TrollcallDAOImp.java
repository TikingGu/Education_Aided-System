package com.eas.dao.rollcall_system;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.eas.util.HibernateDAO;

@Repository("TrollcallDAO")
public class TrollcallDAOImp extends HibernateDAO implements TrollcallDAO{
	public void add(Object object){
		super.add(object);
	}
	public void update(Object object){
		super.update(object);
	}
	public List<String> ShowStudentsSign(){
		return super.ShowStudentsSign();
	}
	public List<String> DeleteStudentsSign(){
		return super.DeleteStudentsSign();
	}
}
