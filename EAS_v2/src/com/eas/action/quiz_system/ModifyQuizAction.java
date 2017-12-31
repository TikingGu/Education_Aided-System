package com.eas.action.quiz_system;

import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.eas.model.Question;
import com.eas.model.Test;
import com.eas.service.quiz_system.QuizService;
import com.opensymphony.xwork2.ActionSupport;
@Component
@ParentPackage(value = "struts-default")
@Namespace("/")
public class ModifyQuizAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2118764110878128577L;
	@Autowired
	private QuizService quizService;
	private Integer quizid;
	private List<Question> questions=new ArrayList<Question>();
	private String quizname;
	private float points;
	private List<Integer> testidlist;
	public List<Question> getQuestions(){
		return questions;
	}
	public void setQuestoins(List<Question> q){
		this.questions=q;
	}
	public String getQuizname(){
		return quizname;
	}
	public void setQuizname(String s){
		this.quizname=s;
	}
	public float getPoints(){
		return points;
	}
	public void setPoints(float p){
		this.points=p;
	}
	public Integer getQuizid(){
		return quizid;
	}
	public void setQuizid(Integer s){
		this.quizid=s;
	}
	public List<Integer> getTestidlist(){
		return testidlist;
	}
	public void setTestidlist(List<Integer> a){
		this.testidlist=a;
	}
	@Action(value="modifyQuiz",results={
			@Result(name="success",location="/modifyQuizSuccess.jsp"),
			@Result(name="failure",location="/modifyQuizFailure.jsp")})
	public String execute(){
		try{
			quizService.modify_quiz(quizid, quizname,points);
			List<Question> newQuestions=new ArrayList<Question>();
			for(int i=0;i<testidlist.size();i++){
				Test test=quizService.get_quiz(testidlist.get(i));
				Question temp=questions.get(i);
				temp.setTest(test);
				newQuestions.add(temp);
			}
			for(Question question:newQuestions)
				quizService.modify_question(question);
			questions=newQuestions;
			return "success";
		}catch(Exception exception){
			exception.printStackTrace();
		}
		return "failure";
	}
}
