package com.eas.action.login_system;

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
       /**
	 * 
	 */
	private static final long serialVersionUID = 8787453853743288026L;
	private String id;
       private String Password;
       private String msg;
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
	public String getMsg(){
		return msg;
	}
	public void setMsg(String s){
		this.msg=s;
	}
	@Resource(name="UserServiceI")
    private UserServiceI userServiceI;
       @Action(value="loginaction",results={
	    		@Result(name="success",location="/TeachEvaluation.jsp"),
	    		@Result(name="error",location="/index.jsp")
	    })
       public String execute(){
    	   char c= getId().charAt(0);
    	   String p = String.valueOf(c);
          ActionContext.getContext().getSession().put("id ", id);
    	  ActionContext.getContext().getSession().put("Password ", Password);
    	   if(p.equals("t")){
    		   if(userServiceI.Tlogin(id, Password)==true){
    		   return SUCCESS;}
    		   else{
    			 msg="账户错误，请重试！";
    			 return ERROR;
    		   }
    	   }
    	   if(p.equals("s")){
    		    if(userServiceI.Slogin(id, Password)==true){
    		    return SUCCESS;}
    		   else{
    			   msg="账户错误，请重试！";  
    			   return ERROR;
    		   }
    	   }
    	   return ERROR;
       }
}
