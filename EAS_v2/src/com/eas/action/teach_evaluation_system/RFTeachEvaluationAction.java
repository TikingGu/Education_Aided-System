package com.eas.action.teach_evaluation_system;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;




import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

import com.eas.model.Course;
import com.eas.model.Student;
import com.eas.service.teach_evaluation_system.RFTeachEvaluationServiceI;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;


@Controller
@Namespace("/")
@ParentPackage("struts-default")
public class RFTeachEvaluationAction extends ActionSupport {
	private String sid;
	@Resource(name="RFTeachEvaluationServiceI")
	private RFTeachEvaluationServiceI rFTeachEvaluationServiceI;
	@Action(value="RFTeacherevaluationaction"
			,results={
   		@Result(name="success",location="/TeachEvaluationSuccess.jsp")})
	public String execute(){
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("/applicationContext.xml");//加载Spring配置文件，初始化IOC容器
		Student stu=(Student) ActionContext.getContext().getSession().get("student");
		sid=stu.getSId();
		List<Course> s=rFTeachEvaluationServiceI.findCourseInfby(sid);
		/*测试代码if(s.size()>0){
			System.out.print((s.get(0)).getCourseId());
		 System.out.print((s.get(0)).getCourseName());
		System.out.print((s.get(0)).getPeriod());}
		else
			System.out.print("aaa");*/
		HttpServletResponse response=ServletActionContext.getResponse();
		try {
			response.getWriter().print((s.get(0)).getCourseId());
			response.getWriter().print((s.get(0)).getCourseName());
			response.getWriter().print((s.get(0)).getPeriod());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		return SUCCESS;
	}
}
