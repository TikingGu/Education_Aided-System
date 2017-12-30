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
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
@Component
@ParentPackage(value = "struts-default")
@Namespace("/")
public class AnswerToQuizAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1937724143796242402L;
	@Autowired
	private QuizService quizService;
	private Integer quizid;
	private float points;
	private String quizname;
	private List<String> answerList=new ArrayList<String>();
//	private List<String> correctAnswerList=new ArrayList<String>();
	private List<Question> questions=new ArrayList<Question>();
	private float score;
	public Integer getQuizid(){
		return quizid;
	}
	public void setQuizid(Integer s){
		this.quizid=s;
	}
	public void setAnswerList(List<String> a){
		this.answerList=a;
	}
	public List<String> getAnswerList(){
		return answerList;
	}
//	public void setCorrectAnswerList(List<String> a){
//		this.correctAnswerList=a;
//	}
//	public List<String> getCorrectAnswerList(){
//		return correctAnswerList;
//	}
	public List<Question> getQuestions(){
		return questions;
	}
	public void setQuestoins(List<Question> q){
		this.questions=q;
	}
	public float getScore(){
		return score;
	}
	public void setScore(float s){
		this.score=s;
	}
	public float getPoints(){
		return points;
	}
	public void setPoints(float p){
		this.points=p;
	}
	public String getQuizname(){
		return quizname;
	}
	public void setQuizname(String s){
		this.quizname=s;
	}
	@Action(value="answerToQuiz",results={
			@Result(name="success",location="/answerSuccess.jsp"),
			@Result(name="failure",location="/answerFailure.jsp")})
	public String execute(){
		try{
			questions=quizService.get_questionlist(quizid);
			
			String sid=(String) ActionContext.getContext().getSession().get("id");
//			correctAnswerList=quizService.get_answer(quizid);
			int count=0;
			for(int i=0;i<getQuestions().size();i++){
				if(getQuestions().get(i).getAnswer().equals(getAnswerList().get(i))){
					count++;
				}
			}
			score=(float)count*quizService.get_quiz(quizid).getTotalPoints()/getQuestions().size();
//			float score=quizService.calculate_score(quizid, answerList.toString());
//			System.out.println(score);
			quizService.read_in_sheet(quizid,sid,answerList,score);
			return "success";
		}catch(Exception exception){
			exception.printStackTrace();
		}
		return "failure";
	}
	
	@Action(value="myQuizResult",results={
			@Result(name="success",location="/myQuizResult.jsp")})
	public String myquizresult(){
//		quizid=11;
		String sid=(String) ActionContext.getContext().getSession().get("id");
		quizname=quizService.get_quiz(quizid).getTitle();
		points=quizService.get_quiz(quizid).getTotalPoints();
		score=quizService.get_sheet(sid, quizid).getScore();
		questions=quizService.get_questionlist(quizid);
		answerList=quizService.get_answer(sid, quizid);
		return "success";
	}
}
