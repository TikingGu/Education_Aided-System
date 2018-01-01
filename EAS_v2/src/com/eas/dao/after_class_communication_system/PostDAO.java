package com.eas.dao.after_class_communication_system;

import java.util.List;

import com.eas.model.Posting;
import com.eas.model.Student;

public interface PostDAO {
	
	/**
	 * 根据学生id查找学生
	 * @param id
	 * @return
	 */
	public Student find_student(String id);
	
	/**
	 * 根据学生id返回学生姓名
	 * @param sid
	 * @return
	 */
	public String find_studentName(String sid);
	
	/**
	 * 根据老师id返回老师姓名
	 * @param tid
	 * @return
	 */
	public String find_teacherName(String tid);
	
	/**
	 * 根据班级id返回该班级的帖子
	 * @param classid
	 * @return
	 */
	public List<Posting> get_postlist(String classid);
	
	/**
	 * 根据贴子id查找贴子
	 * @param poId
	 * @return
	 */
	public Posting find_post(int poId);
	
	/**
	 * 添加一个贴子
	 * @param student
	 * @param title
	 * @param content
	 * @param classid
	 */
	public void add_a_post(Student student,String title,String content,String classid);
	
	/**
	 * 根据学生id查询学生的帖子
	 * @param sid
	 * @return
	 */
	public List<Posting> find_my_postlist(String sid);
	
	
}
