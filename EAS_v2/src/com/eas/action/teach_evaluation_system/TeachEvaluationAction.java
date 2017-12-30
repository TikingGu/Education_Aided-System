package com.eas.action.teach_evaluation_system;


import java.text.SimpleDateFormat;
import java.util.Date;

import javax.annotation.Resource;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;










import com.eas.model.Classinfo;
import com.eas.model.Student;
import com.eas.model.Teachingevaluation;
import com.eas.service.teach_evaluation_system.TeachEvaluationServiceI;
import com.opensymphony.xwork2.ActionSupport;
@Component
@Namespace("/")
@ParentPackage("struts-default")
public class TeachEvaluationAction extends ActionSupport {
	private String sid;
	private String e_class;
	private String a1,a2,a3,a4,a5;
	private String e_id;
	
   
	public String getA1() {
		return a1;
	}
	public void setA1(String a1) {
		this.a1 = a1;
	}
	public String getA2() {
		return a2;
	}
	public void setA2(String a2) {
		this.a2 = a2;
	}
	public String getA3() {
		return a3;
	}
	public void setA3(String a3) {
		this.a3 = a3;
	}
	public String getA4() {
		return a4;
	}
	public void setA4(String a4) {
		this.a4 = a4;
	}
	public String getA5() {
		return a5;
	}
	public void setA5(String a5) {
		this.a5 = a5;
	}
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public String getE_class() {
		return e_class;
	}
	public void setE_class(String e_class) {
		this.e_class = e_class;
	}
	public String getE_id() {
		return e_id;
	}
	public void setE_id(String e_id) {
		this.e_id = e_id;
	}
	
	@Resource(name="TeachEvaluationServiceI")
	private TeachEvaluationServiceI teachEvaluationServiceI;
	 @Action(value="TeachEvaluation",results={
	    		@Result(name="success",location="/TeachEvaluationSuccess.jsp")
	    })
    public String execute(){
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("/applicationContext.xml");//加载Spring配置文件，初始化IOC容器
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
		String str = format.format(new Date());

		Teachingevaluation TE=new Teachingevaluation();
		
		Student st=new Student();
		st.setSId(sid);
		TE.setStudent(st);
		Classinfo cl=new Classinfo();
		cl.setClassId(e_class);
		TE.setClassinfo(cl);
		/*TE.setSid(sid);
		TE.setEClass(e_class);*/
		TE.setA1(a1);
		TE.setA2(a2);
		TE.setA3(a3);
		TE.setA4(a4);
		TE.setA5(a5);
		TE.setEId(str);
		
		teachEvaluationServiceI.add(TE);
		
		return SUCCESS;
		}
	
	
}
	

