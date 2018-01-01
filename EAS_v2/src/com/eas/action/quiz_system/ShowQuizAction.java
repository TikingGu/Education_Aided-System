package com.eas.action.quiz_system;

import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.ServletActionContext;
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
public class ShowQuizAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1592070409754732965L;
	@Autowired
	private QuizService quizService;
	private Integer quizid;
	private List<Question> questions=new ArrayList<Question>();
	public Integer getQuizid(){
		return quizid;
	}
	public void setQuizid(Integer s){
		this.quizid=s;
	}
	public List<Question> getQuestions(){
		return questions;
	}
	public void setQuestoins(List<Question> q){
		this.questions=q;
	}
	@Action(value="showQuiz",results={
			@Result(name="success",location="/showQuizSuccess.jsp"),
			@Result(name="failure",location="/index.jsp")})
	public String execute(){
		try{
//			quizid=11;
			String classid=(String) ServletActionContext.getRequest().getSession().getAttribute("classId");
			System.out.println("classid "+classid);
			quizid=quizService.get_latest_quizid(classid);
			questions=quizService.get_questionlist(quizid);
            ServletActionContext.getRequest().setAttribute("questionList",questions);
			System.out.println(questions.get(0).getQuestionTitle());
			return "success";
		}catch(Exception exception){
			exception.printStackTrace();
		}
		return "failure";
	}
	
}
