package com.eas.service.homework_evaluation_system;

import java.util.List;

import com.eas.model.Comment;
import com.eas.model.Student;

public interface CommentService {
	
	/**
	 * 根据班级id返回该班级的学生
	 * @param classId
	 * @param tid
	 * @return
	 */
	public List<Student> get_studentlist(String classId);
	
	/**
	 * 插入一条评价
	 * @param classId
	 * @param content
	 * @param sid
	 */
	public void add_a_comment(String classId,String content,String sid);
	
	/**
	 * 根据班级id和学生id查找作业评价
	 * @param classId
	 * @param sid
	 * @return
	 */
	public List<Comment> find_comments(String classId,String sid);
}
