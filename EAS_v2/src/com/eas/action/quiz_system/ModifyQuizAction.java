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
	@Action(value="modifyQuiz",results={
			@Result(name="success",location="/modifyQuizSuccess.jsp"),
			@Result(name="failure",location="/modifyQuizFailure.jsp")})
	public String execute(){
		try{
			quizService.modify_quiz(quizid, quizname,points);
			for(Question question:questions)
				quizService.modify_question(question);
			return "success";
		}catch(Exception exception){
			exception.printStackTrace();
		}
		return "failure";
	}
}
