package com.eas.service.teach_evaluation_system;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.eas.dao.after_class_communication_system.PostDAO;
import com.eas.dao.quiz_system.TestDAO;
import com.eas.dao.teach_evaluation_system.TeachEvaluationDAO;
import com.eas.model.Classinfo;
import com.eas.model.Student;



@Service("TeachEvaluationServiceI")
public class TeachEvaluationImpl implements TeachEvaluationServiceI{
	@Resource(name="TeachEvaluationDAO")
	private TeachEvaluationDAO teachEvaluationDAO;
	public void add(Object object){
		teachEvaluationDAO.add(object);
	}
        @Resource(name="PostDAO")
	private PostDAO postDAO;
	public Student find_student(String sid){
		return postDAO.find_student(sid);
	}
	@Resource(name="TestDAO")
	private TestDAO testDAO;
	public Classinfo find_classinfo(String classid){
		return testDAO.find_classinfo(classid);
	}
}
