﻿package com.eas.action.login_system;

import javax.annotation.Resource;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import com.eas.service.login_system.UserServiceI;
import com.opensymphony.xwork2.ActionSupport;

@Component
@Namespace("/")
@ParentPackage("struts-default")
public class loginAction extends ActionSupport {
	private static final long serialVersionUID = 8787453853743288026L;
	private String id;
    private String Password;

    public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	@Resource(name="UserServiceI")
    private UserServiceI userServiceI;
       @Action(value="loginaction")
       public String execute(){
			int login=-1;
			char c= getId().charAt(0);
			String p = String.valueOf(c);
			ActionContext.getContext().getSession().put("id ", id);
			if(p.equals("t")){
    		   login=userServiceI.Tlogin(id, Password);
    		   
			}
			if(p.equals("s")){
    		   login=userServiceI.Slogin(id, Password);
    		   
			}
			return null;
       }
}
