package com.eas.service.teach_evaluation_system;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.eas.dao.teach_evaluation_system.TeacherEvaluationDAO;

@Repository("TeacherEvaluationServiceI")
public class TeacherEvaluationServiceImp implements TeacherEvaluationServiceI {
	@Resource(name="TeacherEvaluationDAO")
	private TeacherEvaluationDAO teacherEvaluationDAO;
	public List<String> findA1by(String EClass){
	 return teacherEvaluationDAO.findA1by(EClass);
	}
	public List<String> findA2by(String EClass){
		 return teacherEvaluationDAO.findA2by(EClass);
	}
	public List<String> findA3by(String EClass){
		 return teacherEvaluationDAO.findA3by(EClass);
	}
	public List<String> findA4by(String EClass){
		 return teacherEvaluationDAO.findA4by(EClass);
	}
}
