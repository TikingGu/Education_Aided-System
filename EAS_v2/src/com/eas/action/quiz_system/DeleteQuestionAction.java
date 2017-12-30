package com.eas.action.quiz_system;

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
public class DeleteQuestionAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8051063902566415555L;
	@Autowired
	private QuizService quizService;
	private Integer questionid;
	public void setQuestionid(Integer q){
		this.questionid=q;
	}
	public Integer getQuestionid(){
		return questionid;
	}
	@Action(value="deleteQuestion",results={
			@Result(name="success",location="/deleteQuestionSuccess.jsp"),
			@Result(name="failure",location="/deleteQuestionFail.jsp")})
	public String execute(){
		try{
//			setQuestionid(6);
			quizService.delete_question(questionid);
			return "success";
		}catch(Exception exception){
			exception.printStackTrace();
		}
		return "failure";
	}
}

