package com.eas.service.teach_evaluation_system;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.eas.dao.teach_evaluation_system.TeachEvaluationDAO;


@Service("TeachEvaluationServiceI")
public class TeachEvaluationImpl implements TeachEvaluationServiceI{
	@Resource(name="TeachEvaluationDAO")
	private TeachEvaluationDAO teachEvaluationDAO;
	/*public void updateA1(String a1){
		Teachingevaluation teachingevaluation=(Teachingevaluation)teachEvaluationDAO.get(Teachingevaluation.class,a1);
		 teachingevaluation.setA1(a1);
		teachEvaluationDAO.update(a1);
	}*/
	public void add(Object object){
		teachEvaluationDAO.add(object);
	}
}
