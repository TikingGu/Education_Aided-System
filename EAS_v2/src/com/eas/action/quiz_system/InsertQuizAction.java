package com.eas.action.quiz_system;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

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
public class InsertQuizAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3309440067089086012L;
	@Autowired
	private QuizService quizService;
//	private Question question=new Question();
	private List<Question> questions=new ArrayList<Question>();
	private String quizname;
	private String classid="02";
	private float points;
	private Integer quizid;
	private String sid;
	private Map<String,Float> quizresult=new HashMap<String,Float>();
	public String getClassid(){
		return classid;
	}
	public void setClassid(String s){
		this.classid=s;
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
	public String getSid(){
		return sid;
	}
	public void setSid(String s){
		this.sid=s;
	}
//	public Question getQuestion(){
//		return question;
//	}
//	public void setQuestoin(Question q){
//		this.question=q;
//	}
	public List<Question> getQuestions(){
		return questions;
	}
	public void setQuestions(List<Question> q){
		this.questions=q;
	}
	public Map<String, Float> getQuizresult(){
		return quizresult;
	}
	public void setQuizresult(Map<String, Float> q){
		this.quizresult=q;
	}
	@Action(value="insertQuiz",results={
			@Result(name="success",location="/teacher_coursde_display.jsp"),
			@Result(name="failure",location="/insertQuizFailure.jsp")})
	public String execute(){
		try{
		
		int temp=quizService.read_in_quiz(classid, quizname,points);
		
		System.out.println(temp);
//		System.out.println(question.getOption1());
		
//		quizService.read_in_question(question, temp);
		for(Question q:getQuestions()){
			quizService.read_in_question(q,temp);
		}
		return "success";
		}catch(Exception exception){
			exception.printStackTrace();
		}
		return "failure";
	}
	
	@Action(value="toModifyQuiz",results={
			@Result(name="success",location="/modifyQuiz.jsp")})
	public String tomodify(){
		quizid=4;
		quizname=quizService.get_quiz(quizid).getTitle();
		points=quizService.get_quiz(quizid).getTotalPoints();
		questions=quizService.get_questionlist(quizid);
		return "success";
	}
	
	@Action(value="showQuizResult",results={
			@Result(name="success",location="/QuizResult.jsp")})
	public String quizresult(){
//		quizid=5;
		quizname=quizService.get_quiz(quizid).getTitle();
		points=quizService.get_quiz(quizid).getTotalPoints();
		quizresult=quizService.get_quiz_result(quizid);
		return "success";
	}
	
	
}
