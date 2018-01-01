package com.eas.action.after_class_communication_system;

import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.eas.model.Posting;
import com.eas.model.Replies;
import com.eas.service.after_class_communication_system.PostService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
@Component
@ParentPackage(value = "struts-default")
@Namespace("/")
public class ManagePostAction extends ActionSupport{
/**
	 * 
	 */
	private static final long serialVersionUID = -6349451969491583386L;
	@Autowired
	private PostService postService;
	private List<Posting> postlist;
	private String classId;
	private List<Replies> replieslist=new ArrayList<Replies>();
	private List<String> namelist=new ArrayList<String>();
	private Integer poId;
//	private Replies replies;
	private String content;
//	private Posting posting;
	private String title;
	private Integer replyid;
	
	public List<Posting> getPostlist(){
		return postlist;
	}
	public void setPostlist(List<Posting> p){
		this.postlist=p;
	}
	public String getClassId(){
		return classId;
	}
	public void setClassId(String s){
		this.classId=s;
	}
	public List<Replies> getReplieslist(){
		return replieslist;
	}
	public void setReplieslist(List<Replies> r){
		this.replieslist=r;
	}
	public List<String> getNamelist(){
		return namelist;
	}
	public void setNamelist(List<String> n){
		this.namelist=n;
	}
	public Integer getPoId(){
		return poId;
	}
	public void setPoId(Integer s){
		this.poId=s;
	}
//	public Replies getReplies(){
//		return replies;
//	}
//	public void setReplies(Replies r){
//		this.replies=r;
//	}
	public String getContent(){
		return content;
	}
	public void setContent(String s){
		this.content=s;
	}
//	public Posting getPosting(){
//		return posting;
//	}
//	public void setPosting(Posting p){
//		this.posting=p;
//	}
	public String getTitle(){
		return title;
	}
	public void setTitle(String s){
		this.title=s;
	}
	public Integer getReplyid(){
		return replyid;
	}
	public void setReplyid(Integer s){
		this.replyid=s;
	}
	
	@Action(value="addPost",results={
			@Result(name="success",location="/addpostSuccess.jsp"),
			@Result(name="failure",location="/menu.jsp")})
	public String addpost(){
		try{
			String sid=(String)ServletActionContext.getRequest().getSession().getAttribute("id");
			classId=(String)ServletActionContext.getRequest().getSession().getAttribute("classId");
			postService.add_a_post(sid,title,content,classId);
			return "success";
		}catch(Exception exception){
			exception.printStackTrace();
		}
		return "failure";
	}
	
	@Action(value="loadMyPost",results={
			@Result(name="success",location="/myPost.jsp"),
			@Result(name="failure",location="/menu.jsp")})
	public String mypost(){
		try{
			postlist=postService.get_my_postlist((String)ServletActionContext.getRequest().getSession().getAttribute("id"));
			return "success";
		}catch(Exception exception){
			exception.printStackTrace();
		}
		return "failure";
	}
	
	@Action(value="deletePost",results={
			@Result(name="success",location="/deleteSuccess.jsp"),
			@Result(name="failure",location="/menu.jsp")})
	public String deletepost(){
		try{
			postService.delete_a_post(poId);
			return "success";
		}catch(Exception exception){
			exception.printStackTrace();
		}
		return "failure";
	}
	
	@Action(value="loadMyReply",results={
			@Result(name="success",location="/myReply.jsp"),
			@Result(name="failure",location="/menu.jsp")})
	public String myreply(){
		try{
			replieslist=postService.get_my_replylist((String)ActionContext.getContext().getSession().get("id"));
			for(Replies r:replieslist){
				namelist.add(postService.find_name(r.getReStudent()));
			}
			return "success";
		}catch(Exception exception){
			exception.printStackTrace();
		}
		return "failure";
	}
	
	@Action(value="deleteReply",results={
			@Result(name="success",location="/deleteSuccess.jsp"),
			@Result(name="failure",location="/menu.jsp")})
	public String deletereply(){
		try{
			postService.delete_a_post(poId);
			return "success";
		}catch(Exception exception){
			exception.printStackTrace();
		}
		return "failure";
	}
	
	@Action(value="topostmenu",results={
			@Result(name="success",location="/postmenu.jsp"),
			@Result(name="failure",location="/menu.jsp")})
	public String topostmenu(){
		try{
			ServletActionContext.getRequest().getSession().setAttribute("id","s915101");
			ServletActionContext.getRequest().getSession().setAttribute("classId","class1");
			return "success";
		}catch(Exception exception){
			exception.printStackTrace();
		}
		return "failure";
	}
	
}

