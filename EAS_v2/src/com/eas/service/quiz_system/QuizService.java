package com.eas.service.quiz_system;

import java.util.List;
import java.util.Map;

import com.eas.model.Question;
import com.eas.model.Sheet;
import com.eas.model.Test;

public interface QuizService {

	/**
	 * 插入一条小测记录到数据库，返回小测的id√
	 * @param classid
	 * @param quizname
	 * @return
	 */
	public Integer read_in_quiz(String classid,String quizname,float points);
	
	/**
	 * 插入一条选择题到数据库√
	 * (testid:小测id)
	 * @param question
	 * @param testid
	 */
	public void read_in_question(Question question,Integer testid);
	
	/**
	 * 根据课程id返回该课程的小测√
	 * @param classid
	 * @return
	 */
	public List<Test> get_quizlist(String classid);
	
	/**
	 * 根据小测id返回该小测的问题
	 * @param quizid
	 * @return
	 */
	public List<Question> get_questionlist(Integer quizid);
	
	/**
	 * 根据小测id删除小测,还有小测的问题√
	 * @param quizid
	 */
	public void delete_quiz(Integer quizid);
	
	/**
	 * 根据问题id删除问题
	 * @param questionid
	 */
	public void delete_question(Integer questionid);
	
	/**
	 * 根据小测id修改小测√
	 * @param quizid
	 * @param quizname
	 */
	public void modify_quiz(Integer quizid,String quizname,float points);
	
	/**
	 * 根据问题id修改问题的内容√
	 * @param questionid
	 * @param title
	 * @param options
	 * @param answer
	 */
	public void modify_question(Question question);
	
	/**
	 * 插入答卷√
	 */
	public void read_in_sheet(Integer quizid,String sid,List<String> answerList,float score);
	
	
	/**
	 * 根据学生id和小测id返回学生小测的答案√
	 */
	public List<String> get_answer(String sid,Integer quizid);
	
	/**
	 * 根据小测id返回小测√
	 * @param quizid
	 * @return
	 */
	public Test get_quiz(Integer quizid);
	
	/**
	 * 根据小测id返回小测结果√
	 * @param quizid
	 * @return
	 */
	public Map<String,Float> get_quiz_result(Integer quizid);
	
	/**
	 * 根据学生id和小测id返回这次小测√
	 * @param sid
	 * @param quizid
	 * @return
	 */
	public Sheet get_sheet(String sid,Integer quizid);
}
