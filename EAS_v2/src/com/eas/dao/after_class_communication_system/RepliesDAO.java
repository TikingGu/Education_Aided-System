package com.eas.dao.after_class_communication_system;

import java.util.List;

import com.eas.model.Replies;

public interface RepliesDAO {
	/**
	 * 根据帖子id返回帖子回复
	 * @param postid
	 * @return
	 */
	public List<Replies> get_replieslist(Integer postid);
	
	/**
	 * 保存一个回复记录
	 * @param replies
	 */
	public void save(Replies replies);
	
}
