package com.eas.action.rollcall_system;

import javax.annotation.Resource;
import javax.servlet.ServletContext;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import com.eas.model.Sign;
import com.eas.model.Student;
import com.eas.service.rollcall_system.TrollcallServiceI;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class SrollcallAction extends ActionSupport{
	private String sid;
	private String code;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	ServletContext application = ServletActionContext.getRequest().getSession().getServletContext();
	int sta=(Integer) application.getAttribute("st");
	@Resource(name="TrollcallServiceI")
	private TrollcallServiceI trollcallServiceI;
	@Action(value="Srollcallaction",results={
    		@Result(name="success",location="/success.jsp"),
    		@Result(name="error",location="/success.jsp")
    		})  
	public String execute(){
		Student stu=(Student) ActionContext.getContext().getSession().get("student");
		sid=stu.getSId();
		String classid=(String) ServletActionContext.getRequest().getSession().getAttribute("Eclass");
		String mima=(String) ServletActionContext.getRequest().getSession().getAttribute("code");
		if(code.equals(mima)){
		if(sta==1){
			Sign Sn=new Sign();
			Sn.setClassid(classid);
			Sn.setSid(sid);
			trollcallServiceI.add(Sn);
			return SUCCESS;
		}
		else{
			return ERROR;
			}
		}
		else
			return ERROR;
	}
}
