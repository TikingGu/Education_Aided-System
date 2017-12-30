package com.eas.dao.quiz_system;

import java.util.List;
import java.util.Map;

import com.eas.model.Sheet;
import com.eas.model.Test;

public interface SheetDAO {
	
	public void save(Sheet transientInstance);
	/**
	 * 根据小测id返回这次小测所有人的成绩√
	 * @param quizid
	 * @return
	 */
	public Map<String,Float> getAllResult(Integer quizid);
	/**
	 * 根据学生id和小测返回学生小测的答案
	 * @param sid
	 * @param quizid
	 * @return
	 */
	public String getAnswer(String sid,Test test);
	/**
	 * 根据学生id和小测id返回小测√
	 * @param sid
	 * @param quizid
	 * @return
	 */
	public Sheet findBySidAndQid(String sid,Integer quizid);
	public void delete(Sheet persistentInstance);
	public void update(Sheet sheet);
	public Sheet findBySid(Integer id);
	public List<Sheet> findAll();
	

}