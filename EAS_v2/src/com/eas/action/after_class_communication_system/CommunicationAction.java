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
import com.opensymphony.xwork2.ActionSupport;
@Component
@ParentPackage(value = "struts-default")
@Namespace("/")
public class CommunicationAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = -3663938074899345393L;
	@Autowired
	private PostService postService;
	private List<Posting> postlist;
	private String classId;
	private List<Replies> replieslist=new ArrayList<Replies>();
	private List<String> namelist=new ArrayList<String>();
	private Integer poId;
//	private Replies replies;
	private String content;
	private Posting post;
	
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
	public Posting getPost(){
		return post;
	}
	public void setPost(Posting p){
		this.post=p;
	}
		@Action(value="loadPost",results={
			@Result(name="success",location="/Posting.jsp"),
			@Result(name="failure",location="/Posting.jsp")})
	public String loadpost(){
		try{
			Object obj=ServletActionContext.getRequest().getSession().getAttribute("Eclass");
			classId=obj.toString(); 
			//classId=(String)ServletActionContext.getRequest().getSession().getAttribute("classId");
			System.out.print("classId"+classId);
			postlist=postService.get_postlist(classId);
			ServletActionContext.getRequest().setAttribute("postlist", postlist);
			System.out.print(postlist);
			return "success";
		}catch(Exception exception){
			exception.printStackTrace();
		}
		return "failure";
	}
	
	@Action(value="showPost",results={
			@Result(name="success",location="/reply.jsp"),
			@Result(name="failure",location="/menu.jsp")})
	public String showpost(){
		try{
			post=postService.find_post(poId);
			replieslist=postService.get_replieslist(poId);
			for(Replies r:replieslist){
				namelist.add(postService.find_name(r.getReStudent()));
			}
			ServletActionContext.getRequest().setAttribute("post", post);
			ServletActionContext.getRequest().setAttribute("replieslist", replieslist);
			ServletActionContext.getRequest().setAttribute("namelist", namelist);
		}catch(Exception exception){
			exception.printStackTrace();
		}
		return "success";
	}
	
	@Action(value="replyPost",results={
			@Result(name="success",location="/Posting.jsp"),
			@Result(name="failure",location="/error/400.jsp")})
	public String replypost(){
		try{
			System.out.println("Ñ§Éúid:"+(String)ServletActionContext.getRequest().getSession().getAttribute("id"));
			postService.insert_a_reply(poId,(String)ServletActionContext.getRequest().getSession().getAttribute("id"), content);
			post=postService.find_post(poId);
			replieslist=postService.get_replieslist(poId);
			for(Replies r:replieslist){
				namelist.add(postService.find_name(r.getReStudent()));
			}
			ServletActionContext.getRequest().setAttribute("post", post);
			ServletActionContext.getRequest().setAttribute("replieslist", replieslist);
			ServletActionContext.getRequest().setAttribute("namelist", namelist);
		}catch(Exception exception){
			exception.printStackTrace();
		}
		return "success";
	}
	
	@Action(value="agreePost",results={@Result(name="success",location="/showPost.jsp")})
	public String agreepost(){
		postService.agree_a_post();
		return "success";
	}
	
	@Action(value="disagreePost",results={
			@Result(name="success",location="/showPost.jsp"),
			@Result(name="failure",location="/menu.jsp")})
	public String disagreepost(){
		try{
			postService.disagree_a_post();
			return "success";
		}catch(Exception exception){
			exception.printStackTrace();
		}
		return "failure";
	}
	
	@Action(value="agreeReply",results={
			@Result(name="success",location="/showPost.jsp"),
			@Result(name="failure",location="/menu.jsp")})
	public String agreereply(){
		try{
			postService.agree_a_reply();
			return "success";
		}catch(Exception exception){
			exception.printStackTrace();
		}
		return "failure";
	}
	
	@Action(value="disagreeReply",results={
			@Result(name="success",location="/showPost.jsp"),
			@Result(name="failure",location="/menu.jsp")})
	public String disagreereply(){
		try{
			postService.disagree_a_reply();
			return "success";
		}catch(Exception exception){
			exception.printStackTrace();
		}
		return "failure";
	}
	
}
