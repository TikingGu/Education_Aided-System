package com.eas.action.notice_system;

import com.opensymphony.xwork2.ActionSupport;

public class WriteNotice extends ActionSupport{
	private String classid;
	public String getClassid(){
		return classid;
	}
	public void setClassid(String classid){
		this.classid=classid;
	}
	public String execute() throws Exception{
		return SUCCESS;
	}
}
