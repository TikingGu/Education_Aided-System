package com.eas.action.rollcall_system;

import java.util.List;

import javax.annotation.Resource;

import org.apache.struts2.ServletActionContext;

import com.eas.service.rollcall_system.TrollcallServiceI;
import com.opensymphony.xwork2.ActionSupport;

public class ShowStimesAction extends ActionSupport{
	@Resource(name="TrollcallServiceI")
	private TrollcallServiceI trollcallServiceI;
    public String execute(){
    	List<String> s=trollcallServiceI.ShowStudentsSign();
    	Integer S=s.size();
    	ServletActionContext.getRequest().setAttribute("S", S);
    	trollcallServiceI.DeleteStudentsSign();
    	return SUCCESS;
    }  
}
