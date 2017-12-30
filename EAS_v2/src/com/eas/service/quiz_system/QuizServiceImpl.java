package com.eas.service.quiz_system;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eas.dao.quiz_system.QuestionDAO;
import com.eas.dao.quiz_system.SheetDAO;
import com.eas.dao.quiz_system.TestDAO;
import com.eas.model.Classinfo;
import com.eas.model.Question;
import com.eas.model.Sheet;
import com.eas.model.Test;

@Service("quizService")
public class QuizServiceImpl implements QuizService {
	@Autowired
	private TestDAO testdao;
	@Autowired
	private QuestionDAO questiondao;
	@Autowired
	private SheetDAO sheetdao;
	@Autowired
	private Sheet sheet;
	@Autowired
	private Question question=new Question();
	
	public void setTestDAO(TestDAO test){
		this.testdao=test;
	}
	public TestDAO getTestDAO(){
		return testdao;
	}
	public void setQuestionDAO(QuestionDAO question){
		this.questiondao=question;
	}
	public QuestionDAO getQuestionDAO(){
		return questiondao;
	}
	public void setSheetDAO(SheetDAO sheet){
		this.sheetdao=sheet;
	}
	public SheetDAO getSheetDAO(){
		return sheetdao;
	}
	public Question getQuestion(){
		return question;
	}
	public void setQuestoin(Question q){
		this.question=q;
	}
	
	@Override
	public Integer read_in_quiz(String classid, String quizname,float points) {
		// TODO Auto-generated method stub
		Classinfo temp=testdao.find_classinfo(classid);
		testdao.save(temp, quizname,points);
		return testdao.find(classid, quizname);
	}
	
	@Override
	public void read_in_question(Question question,Integer testid) {
		// TODO Auto-generated method stub
		Test test=testdao.findByTid(testid);
		question.setTest(test);
		questiondao.save(question);
	}
	
	@Override
	public List<Test> get_quizlist(String classid) {
		// TODO Auto-generated method stub
		Classinfo classinfo=testdao.find_classinfo(classid);
		return testdao.findByClassinfo(classinfo);
	}
	
	@Override
	public List<Question> get_questionlist(Integer quizid) {
		// TODO Auto-generated method stub
		Test test=testdao.findByTid(quizid);
		return questiondao.findByTest(test);
	}
	
	@Override
	public void delete_quiz(Integer quizid) {
		// TODO Auto-generated method stub
		Test test=testdao.findByTid(quizid);
		questiondao.deleteAll(test);
		testdao.delete(test);
	}
	
	@Override
	public void delete_question(Integer questionid) {
		// TODO Auto-generated method stub
		question=questiondao.findByQid(questionid);
		questiondao.delete(question);
	}

	
	@Override
	public void modify_quiz(Integer quizid,String quizname,float points){
		Test test=testdao.findByTid(quizid);
		test.setTitle(quizname);
		test.setTotalPoints(points);
		testdao.update(test);
	};
	
	@Override
	public void modify_question(Question question){
		questiondao.update(question);
	}
	
	@Override
	public void read_in_sheet(Integer quizid,String sid,List<String> answerList,float score){
		String temp = "";
		Test test=testdao.findByTid(quizid);
		sheet.setTest(test);
		sheet.setScore(score);
		sheet.setSid(sid);
		for(int i=0;i<answerList.size();i++){
			temp+=answerList.get(i);
		}
		sheet.setStudentAnswers(temp);
		sheetdao.save(sheet);
	}
	
	
	@Override
	public List<String> get_answer(String sid,Integer quizid){
		Test test=testdao.findByTid(quizid);
		String temp=sheetdao.getAnswer(sid,test);
		List<String> answer=new ArrayList<String>();
		for(int i=0;i<temp.length();i++){
			answer.add(String.valueOf(temp.charAt(i)));
		}
		return answer;
	}
	
	@Override
	public Test get_quiz(Integer quizid){
		return testdao.findByTid(quizid);
	}
	
	@Override
	public Map<String,Float> get_quiz_result(Integer quizid){
		Map<String,Float> temp=sheetdao.getAllResult(quizid);
		Map<String,Float> a=new HashMap<String, Float>();
		for(String key:temp.keySet()){
			a.put(questiondao.getStudentName(key), temp.get(key));
		}
		return a;
	}
	
	@Override
	public Sheet get_sheet(String sid,Integer quizid){
		return sheetdao.findBySidAndQid(sid,quizid);
	}
}
