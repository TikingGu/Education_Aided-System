package com.eas.service.after_class_communication_system;

import java.util.List;

import com.eas.model.Posting;
import com.eas.model.Replies;

public interface PostService {
	
	/**
	 * 根据班级id返回该班级的帖子
	 * @param classid
	 * @return
	 */
	public List<Posting> get_postlist(String classid);
	
	/**
	 * 根据帖子id返回帖子回复
	 * @param postid
	 * @return
	 */
	public List<Replies> get_replieslist(Integer postid);
	
	/**
	 * 根据贴子id查找贴子
	 * @param poId
	 * @return
	 */
	public Posting find_post(int poId);
	
	/**
	 * 根据用户id查询名字
	 * @param id
	 * @return
	 */
	public String find_name(String id);
	
	/**
	 * 根据帖子id，用户id，回帖内容插入回帖
	 * @param postid
	 * @param id
	 * @param content
	 */
	public void insert_a_reply(int postid,String id,String content);
	
	/**
	 * 为帖子点赞
	 */
	public void agree_a_post();
	
	/**
	 * 踩一下帖子
	 */
	public void disagree_a_post();
	
	/**
	 * 为回复点赞
	 */
	public void agree_a_reply();
	
	/**
	 * 踩一下回复
	 */
	public void disagree_a_reply();
	
	/**
	 * 创建帖子
	 * @param id
	 * @param title
	 * @param content
	 * @param classid
	 */
	public void add_a_post(String id,String title,String content,String classid);
	
	/**
	 * 根据学生id查询学生的帖子
	 * @param sid
	 * @return
	 */
	public List<Posting> get_my_postlist(String sid);
	
	
	/**
	 * 根据帖子id删除帖子
	 * @param postid
	 */
	public void delete_a_post(int postid);
	
	/**
	 * 根据学生id查询学生的回复
	 * @param sid
	 * @return
	 */
	public List<Replies> get_my_replylist(String sid);
}
