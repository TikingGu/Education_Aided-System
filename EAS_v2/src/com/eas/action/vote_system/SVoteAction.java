package com.eas.action.vote_system;

import javax.annotation.Resource;



import javax.servlet.ServletContext;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.apache.struts2.convention.annotation.Result;

import com.eas.service.vote_system.SVoteServiceI;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

@Controller
@Namespace("/")
@ParentPackage("struts-default")
public class SVoteAction extends ActionSupport {
	@Resource(name="SVoteServiceI")
	  private SVoteServiceI sVoteServiceI;
	  @Action(value="SVoteAgreeaction",results={
			  @Result(name="success",location="/TeachEvaluationSuccess.jsp")})
      public String execute1(){
    	  ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("/applicationContext.xml");//加载Spring配置文件，初始化IOC容器
    	  ServletContext application = ServletActionContext.getRequest().getSession().getServletContext();
    	  String voteId= (String) application.getAttribute("VoteId");
    	  System.out.println("voteId:  "+voteId);
    	  sVoteServiceI.updateAgreebyvoteId(voteId);
    	  return SUCCESS;
      }
	  @Action(value="SVoteDisagreeaction",results={
			  @Result(name="success",location="/TeachEvaluationSuccess.jsp")})
	  public String execute2(){
    	  ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("/applicationContext.xml");//加载Spring配置文件，初始化IOC容器
    	  ServletContext application = ServletActionContext.getRequest().getSession().getServletContext();
    	  String voteId= (String) application.getAttribute("VoteId");
    	  sVoteServiceI.updateDisagreebyvoteId(voteId);
    	  return SUCCESS;
}
}
