package com.eas.action.teach_evaluation_system;

import java.util.List;

import javax.annotation.Resource;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

import com.eas.model.Student;
import com.eas.service.teach_evaluation_system.SaveCourseIdServiceI;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
 
@Controller
@Namespace("/")
@ParentPackage("struts-default")
public class SaveCourseIdAction extends ActionSupport{
	private String courseId;
	private String path;

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
	public String getCourseId() {
		return courseId;
	}

	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	
	@Resource(name="SaveCourseIdServiceI")
	private SaveCourseIdServiceI saveCourseIdServiceI;
	@Action(value="SavaCourseIdAction"/*,results={
	   		@Result(name="success",location="/TeachEvaluationSuccess.jsp")}*/)
	public String execute(){
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("/applicationContext.xml");//鍔犺浇Spring閰嶇疆鏂囦欢锛屽垵濮嬪寲IOC瀹瑰櫒
		
		List<String> eclass=saveCourseIdServiceI.findClassIdby(courseId);
		ServletActionContext.getRequest().getSession().setAttribute("Eclass", eclass.get(0));
		System.out.print(eclass);
		return null;
	}
	@Action(value="toCourseById",results={
	   		@Result(name="course",location="/course_inf_all.jsp"),
	   		@Result(name="teacher",location="/teacher_coursde_display.jsp"),
	   		@Result(name="success",location="/login.jsp")})
	public String toCourseById(){
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("/applicationContext.xml");//鍔犺浇Spring閰嶇疆鏂囦欢锛屽垵濮嬪寲IOC瀹瑰櫒
		System.out.print(courseId);
		List<String> eclass=saveCourseIdServiceI.findClassIdby(courseId);
		ServletActionContext.getRequest().getSession().setAttribute("Eclass", eclass.get(0));
		System.out.println("eclass"+eclass);
		if(path.equals("course")) {
			return "course";
		}else if(path.equals("teacher")) {
			return "teacher";
		}else {
		return "success";
		}
	}
}

