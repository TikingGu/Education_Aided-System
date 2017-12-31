package com.eas.action.homework_evaluation_system;

import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.eas.model.homework_evaluation_system.HomeworkComment;
import com.eas.service.homework_evaluation_system.HomeworkCommentService;
import com.opensymphony.xwork2.ActionSupport;

@Component
@ParentPackage(value = "struts-default")
@Namespace("/homework_comment/student")
public class StudentAction extends ActionSupport{
	private static final long serialVersionUID = -9218760136150056378L;

	@Autowired
	private HomeworkCommentService hs;

	private String sid;
	
	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public List<HomeworkComment> getList() {
		if (this.sid == null) { // TODO 只获取某个学生的列表
			return hs.getList();			
		} else {
			return hs.getListBySid(this.sid);
		}
	}

	@Action(value="index",results={
			@Result(name="list",location="/WEB-INF/pages/homework_comment/student/list.jsp")})
	
	public String index() {
		return "list";
	}
}
