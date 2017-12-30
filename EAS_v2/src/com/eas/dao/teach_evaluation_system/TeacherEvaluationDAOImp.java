package com.eas.dao.teach_evaluation_system;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.eas.util.HibernateDAO;

@Repository("TeacherEvaluationDAO")
public class TeacherEvaluationDAOImp extends HibernateDAO implements TeacherEvaluationDAO {
	public List<String> findA1by(String EClass){
		return super.findA1by(EClass);
	}
	public List<String> findA2by(String EClass){
		return super.findA2by(EClass);
	}
	public List<String> findA3by(String EClass){
		return super.findA3by(EClass);
	}
	public List<String> findA4by(String EClass){
		return super.findA1by(EClass);
	}
}
