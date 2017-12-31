package com.eas.service.homework_evaluation_system;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eas.dao.homework_evaluation_system.HomeworkCommentDao;
import com.eas.model.homework_evaluation_system.HomeworkComment;

@Service
public class HomeworkCommentService {
	@Autowired
	HomeworkCommentDao dao;
	
	public boolean create(String T_ID, String S_ID, String title, String content) {
		HomeworkComment obj = new HomeworkComment();

		obj.settId(T_ID);
		obj.setsId(S_ID);
		obj.setTitle(title);
		obj.setContent(content);
		
		this.dao.save(obj);

		return true;
	}
	
	public List<HomeworkComment> getList() {
		// TODO 筛选当前学生
		System.out.println("-----------------------------------------");
		return this.dao.getAll();
	}

	public List<HomeworkComment> getListBySid(String sid) {
		return this.dao.getListBySid(sid);
	}
}
