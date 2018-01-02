package com.eas.service.teach_evaluation_system;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eas.dao.after_class_communication_system.PostDAO;
import com.eas.dao.after_class_communication_system.RepliesDAO;
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
	
	@Autowired
	private PostDAO postdao;
	public void setPostdao(PostDAO p){
		this.postdao=p;
	}
	public PostDAO getPostdao(){
		return postdao;
	}
	public Student find_student(String sid){
		return postdao.find_student(sid);
	}
	@Resource(name="testdao")
	private TestDAO testdao;
	public Classinfo find_classinfo(String classid){
		return testdao.find_classinfo(classid);
	}
}
