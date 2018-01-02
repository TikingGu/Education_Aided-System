package com.eas.action.homework_evaluation_system;

import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.eas.model.Comment;
import com.eas.model.Student;
import com.eas.service.homework_evaluation_system.CommentService;
import com.opensymphony.xwork2.ActionSupport;
@Component
@ParentPackage(value = "struts-default")
@Namespace("/")
public class CommentAction extends ActionSupport{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3869640683209713297L;
	@Autowired
	private CommentService commentService;
	private List<Student> studentlist=new ArrayList<Student>();
	private String classId;
	private List<Comment> commentlist=new ArrayList<Comment>();
	private List<String> namelist=new ArrayList<String>();
	private Integer commentId;
	private String content;
	private String sid;
	private Comment comment;
	
	public List<Student> getStudentlist(){
		return studentlist;
	}
	public void setStudentlist(List<Student> p){
		this.studentlist=p;
	}
	public String getClassId(){
		return classId;
	}
	public void setClassId(String s){
		this.classId=s;
	}
	public List<Comment> getCommentlist(){
		return commentlist;
	}
	public void setCommentlist(List<Comment> r){
		this.commentlist=r;
	}
	public List<String> getNamelist(){
		return namelist;
	}
	public void setNamelist(List<String> n){
		this.namelist=n;
	}
	public Integer getCommentId(){
		return commentId;
	}
	public void setCommentId(Integer s){
		this.commentId=s;
	}
	public String getContent(){
		return content;
	}
	public void setContent(String s){
		this.content=s;
	}
	public String getSid(){
		return sid;
	}
	public void setSid(String s){
		this.sid=s;
	}
	public Comment getComment(){
		return comment;
	}
	public void setComment(Comment c){
		this.comment=c;
	}
	@Action(value="loadStudent",results={
			@Result(name="success",location="/allstudent.jsp"),
			@Result(name="failure",location="/commentmenu.jsp")})
	public String loadStudent(){
		try{
			Object obj=ServletActionContext.getRequest().getSession().getAttribute("Eclass");
			classId=obj.toString();
			System.out.println("classId: "+classId);
//			String tid=(String)ServletActionContext.getRequest().getSession().getAttribute("id");
			studentlist=commentService.get_studentlist(classId);
			ServletActionContext.getRequest().setAttribute("studentlist", studentlist);
			return "success";
		}catch(Exception exception){
			exception.printStackTrace();
		}
		return "failure";
	}
	
	
	
	@Action(value="addcomment",results={
			@Result(name="success",location="/addcommentsuccess.jsp")})
	public String addcomment(){
		try{
			Object obj=ServletActionContext.getRequest().getSession().getAttribute("Eclass");
			classId=obj.toString();
//			String tid=(String)ServletActionContext.getRequest().getSession().getAttribute("id");
			System.out.println("sid:"+sid);
			commentService.add_a_comment(classId,content,sid);
			ServletActionContext.getRequest().setAttribute("content", content);
			return "success";
		}catch(Exception exception){
			exception.printStackTrace();
		}
		return null;
	}
	
	@Action(value="showcomment",results={
			@Result(name="success",location="/showcomment.jsp")})
	public String showcomment(){
		try{
			Object obj=ServletActionContext.getRequest().getSession().getAttribute("Eclass");
			classId=obj.toString();
			System.out.println("classId:"+classId);
			String sid=(String)ServletActionContext.getRequest().getSession().getAttribute("id");
			System.out.println("sid:"+sid);
			commentlist=commentService.find_comments(classId,sid);
			ServletActionContext.getRequest().setAttribute("commentlist", commentlist);
			return "success";
		}catch(Exception exception){
			exception.printStackTrace();
		}
		return null;
	}
	
	@Action(value="toaddcomment",results={
			@Result(name="success",location="/addcomment.jsp")})
	public String toaddcomment(){
		try{
			return "success";
		}catch(Exception exception){
			exception.printStackTrace();
		}
		return null;
	}
	
	@Action(value="tocommentmenu",results={
			@Result(name="success",location="/commentmenu.jsp")})
	public String tocomment(){
		try{
			ServletActionContext.getRequest().getSession().setAttribute("id","s915101");
			ServletActionContext.getRequest().getSession().setAttribute("Eclass","class1");
			return "success";
		}catch(Exception exception){
			exception.printStackTrace();
		}
		return null;
	}
	
	
	
}
