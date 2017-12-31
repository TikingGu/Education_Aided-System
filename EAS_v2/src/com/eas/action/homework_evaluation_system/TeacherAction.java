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
@Namespace("/homework_comment/teacher")
public class TeacherAction extends ActionSupport{
	private static final long serialVersionUID = -9218760136150056378L;

	@Autowired
	private HomeworkCommentService hs;

	private String sid;
	private String tid;
	private String title;
	private String content;
	
	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public String getTid() {
		return tid;
	}

	public void setTid(String tid) {
		this.tid = tid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	public List<HomeworkComment> getList() {
		System.out.println(hs.getList().size());
		return hs.getList();
	}

	@Action(value="index",results={
			@Result(name="list",location="/WEB-INF/pages/homework_comment/teacher/list.jsp")})
	public String index() {
		return "list";
	}

	@Action(value="create",results={
			@Result(name="create",location="/WEB-INF/pages/homework_comment/teacher/create.jsp")})
	public String create() {
		return "create";
	}
	
	@Action(value="docreate",results={
			@Result(name="success",location="/WEB-INF/pages/homework_comment/success.jsp"),
			@Result(name="error",location="/WEB-INF/pages/homework_comment/error.jsp")})
	public String doCreate() {
		System.out.println(tid);
		System.out.println(sid);
		System.out.println(title);
		System.out.println(content);
		if (hs.create(tid, sid, title, content)) {
			return "success";
		}

		return "error";
	}
}
