package com.eas.action.rollcall_system;

import javax.annotation.Resource;
import javax.servlet.ServletContext;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.stereotype.Component;

import com.eas.model.Rollcall;
import com.eas.service.rollcall_system.TrollcallServiceI;
import com.opensymphony.xwork2.ActionSupport;

@Component
@Namespace("/")
@ParentPackage("struts-default")
public class TrollcallAction extends ActionSupport {
    private String code;
    private String CIDS;

	/*public String getCIDS() {
		return CIDS;
	}

	public void setCIDS(String cIDS) {
		CIDS = cIDS;
	}*/

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	@Resource(name="TrollcallServiceI")
	private TrollcallServiceI trollcallServiceI;
	@Action(value="TOpenrollcallaction",results={
    		@Result(name="success",location="/success.jsp")
    })
	public String execute1(){
		 Object obj=ServletActionContext.getRequest().getSession().getAttribute("Eclass");
		 CIDS=obj.toString();
		 Rollcall Rc=new Rollcall();
		 Rc.setCIds(CIDS);
		 Rc.setCode(code);
		 Rc.setState(1);
	 	 trollcallServiceI.add(Rc);
	 	 int st=Rc.getState();
		 ServletContext application = ServletActionContext.getRequest().getSession().getServletContext();
   	     application.setAttribute("st",st);
   	  application.setAttribute("code",code);
		 return SUCCESS;
	}
	@Action(value="TCloserollcallaction",results={
    		@Result(name="success",location="/success.jsp")
    }) 
	public String execute2(){
		Object obj=ServletActionContext.getRequest().getSession().getAttribute("Eclass");
		 CIDS=obj.toString();
		 Rollcall Rc=new Rollcall();
		 Rc.setCIds(CIDS);
		 Rc.setCode(code);
		 Rc.setState(0);
		 trollcallServiceI.update(Rc);
		 int st=Rc.getState();
		 ServletContext application = ServletActionContext.getRequest().getSession().getServletContext();
		 application.setAttribute("st",st);
		 return SUCCESS;
	}
}
