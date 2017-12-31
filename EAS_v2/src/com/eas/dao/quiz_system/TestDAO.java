package com.eas.dao.quiz_system;
import java.util.List;

import org.springframework.stereotype.Component;

import com.eas.model.Classinfo;
import com.eas.model.Test;

public interface TestDAO {
	/**
	 * 根据班级和小测名 插入小测
	 * @param courseid
	 * @param quizname
	 * @return
	 */
	public void save(Classinfo classinfo,String quizname,float points);
	/**
	 * 根据班级id和小测名返回小测id（返回最新的）
	 * @param courseid
	 * @param quizname
	 * @return
	 */
	public Integer find(String courseid,String quizname);
	/**
	 * 根据classinfo返回该课程的小测
	 * @param id
	 * @return
	 */
	public List<Test> findByClassinfo(Classinfo classinfo);
	public void save(Test persistentInstance);
	public void delete(Test persistentInstance);
	public void update(Test persistentInstance);
	/**
	 * 根据小测id查找小测√
	 * @param id
	 * @return
	 */
	public Test findByTid(Integer id);
	/**
	 * 根据班级id返回班级
	 * @param classid
	 * @return
	 */
	public Classinfo find_classinfo(String classid);
	/**
	 * 根据课程id返回最新的小测id
	 * @param classid
	 * @return
	 */
	public int get_latest_quizid(String classid);
	public List<Test> findByProperty(String propertyName, Object value);
	public List<Test> findAll();
	public void attachDirty(Test instance) ;
	

}