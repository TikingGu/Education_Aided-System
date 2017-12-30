package com.eas.action.quiz_system;

import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.eas.model.Test;
import com.eas.service.quiz_system.QuizService;
import com.opensymphony.xwork2.ActionSupport;
@Component
@ParentPackage(value = "struts-default")
@Namespace("/")
public class LoadQuizAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7145350218958659519L;
	@Autowired
	private QuizService quizService;
	private String classid;
	private List<Test> quizs;
	public void setClassid(String c){
		this.classid=c;
	}
	public String getClassid(){
		return classid;
	}
	public List<Test> getQuizs(){
		return quizs;
	}
	public void setQuizs(List<Test> t){
		this.quizs=t;
	}
	@Action(value="loadQuiz",results={
			@Result(name="success",location="/loadQuizSuccess.jsp")})
	public String execute(){
		//quizs=quizService.get_quizlist(classid);
		quizs=quizService.get_quizlist(classid);
		while(!quizs.isEmpty()){
			System.out.println(quizs.get(0).getTitle());
			break;
		}
		return "success";
	}
}
