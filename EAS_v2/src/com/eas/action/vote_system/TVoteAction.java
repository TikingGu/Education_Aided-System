package com.eas.action.vote_system;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

import javax.annotation.Resource;


import javax.servlet.ServletContext;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.eas.model.Vote;
import com.eas.service.vote_system.TVoteServiceI;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

@Component
@Namespace("/")
@ParentPackage("struts-default")
public class TVoteAction extends ActionSupport {
	@Resource(name="TVoteServiceI")
	private TVoteServiceI tVoteServiceI;
	/*public static String getUUID(){
        UUID uuid=UUID.randomUUID();
        String str = uuid.toString(); 
        String uuidStr=str.replace("-", "");
        return uuidStr;
      }*/
	 @Action(value="TVoteACtion",results={
	    		@Result(name="success",location="/TeachEvaluationSuccess.jsp")
	    })
     public String execute(){
    	 ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("/applicationContext.xml");//加载Spring配置文件，初始化IOC容器
    	 
    	 
 		SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss"); 
 		String str = format.format(new Date());
 		Vote v=new Vote();
 		v.setVoteId(str);
 		v.setAgreeNum(0);
 		v.setDisagreeNum(0);
 		tVoteServiceI.add(v);
 		
 		String vd=v.getVoteId();
 		ServletContext application = ServletActionContext.getRequest().getSession().getServletContext(); 
 		application.setAttribute("VoteId",vd);
 		System.out.print(vd);
 		return SUCCESS;
     }
}
