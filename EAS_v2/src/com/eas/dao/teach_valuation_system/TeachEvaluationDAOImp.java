package com.eas.dao.teach_evaluation_system;

import org.springframework.stereotype.Repository;

import com.eas.util.HibernateDAO;


@Repository("TeachEvaluationDAO")
public class TeachEvaluationDAOImp extends HibernateDAO implements TeachEvaluationDAO{
	@Override
	/*public void update(Object object){
		super.update(object);
	}
	
	public Object get(Class clas,String a1){
		return super.get(clas, a1);
	}*/
	
	public void add(Object object){
		super.add(object);
	}
	/*public String get(String e_class){
		
	}*/
}
