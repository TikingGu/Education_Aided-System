package com.eas.action.notice_system;

import org.apache.struts2.ServletActionContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.eas.model.Announcement;
import com.eas.service.courseware_uploadanddownload_system.UploadImp;
import com.eas.service.notice_system.NoticeImp;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class NoticeAction extends ActionSupport {
	private String title;
	private String content;
	private String classId;
	public String getTitle(){
		return title;
	}
	public void setTitle(String title){
		 this.title=title;
	}
	public String getContent(){
		return content;
	}
	public void setContent(String content){
		 this.content=content;
	}
	public String getClassId(){
		return classId;
	}
	public void setClassId(String classId){
		 this.classId=classId;
	}
	public String execute() throws Exception {
		//加载Spring配置文件，初始化IOC容器
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		//从容器接管bean
		NoticeImp Notice=(NoticeImp)context.getBean("notice");
		
		Object obj=ServletActionContext.getRequest().getSession().getAttribute("Eclass");
		classId=obj.toString();
		
		System.out.println(classId);
		Announcement announce =new Announcement();
		announce.setTitle(title);
		announce.setContent(content);
		//announce.setClassid(classId);
		boolean is=Notice.AddNotice(announce);
		if(is){
			return SUCCESS;
		}else
			return ERROR;
	}
}
