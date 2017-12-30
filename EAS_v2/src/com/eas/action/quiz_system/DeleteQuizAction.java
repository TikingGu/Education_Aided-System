package com.eas.action.quiz_system;

import javax.annotation.Resource;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.eas.service.quiz_system.QuizService;
import com.opensymphony.xwork2.ActionSupport;
@Component
@ParentPackage(value = "struts-default")
@Namespace("/")
public class DeleteQuizAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 8831797977942013302L;
	@Autowired
	private QuizService quizService;
	private Integer quizid;
	public Integer getQuizid(){
		return quizid;
	}
	public void setQuizid(Integer s){
		this.quizid=s;
	}
	@Action(value="deleteQuiz",results={
			@Result(name="success",location="/deleteQuizSuccess.jsp"),
			@Result(name="failure",location="/deleteQuizFailure.jsp")})
	public String execute(){
		try{
//			quizid=12;
			quizService.delete_quiz(quizid);
			return "success";
		}catch(Exception e){
			e.printStackTrace();
		}
		return "failure";
	}
}
