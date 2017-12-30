package com.eas.dao.quiz_system;

import java.util.List;
import java.util.Map;

import com.eas.model.Question;
import com.eas.model.Test;

public interface QuestionDAO{
	
	public void save(Question transientInstance);
	public void delete(Question persistentInstance);
	/**
	 * 根据小测删除小测的所有问题√
	 * @param quizid
	 */
	public void deleteAll(Test test);

	public void update(Question question);
	/**
	 * 根据问题id查找问题√
	 * @param qid
	 * @return
	 */
	public Question findByQid(Integer qid);
	/**
	 * 查询小测的问题
	 * @param tid
	 * @return
	 */
	public List<Question> findByTest(Test test);
	/**
	 * 查询小测的答案
	 */
	public List<String> getAllAnswer(Integer quizid);
	
	/**
	 * 查出sid对应的学生姓名
	 * @param temp
	 * @return
	 */
	public String getStudentName(String sid);
	public List<Question> findByProperty(String propertyName, Object value);
	public List<Question> findAll();
	public void attachDirty(Question instance);
	
}