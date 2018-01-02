package com.eas.action.teach_evaluation_system;

import java.io.IOException;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.eas.service.teach_evaluation_system.TeacherEvaluationServiceI;
import com.opensymphony.xwork2.ActionSupport;

@Component
@Namespace("/")
@ParentPackage("struts-default")
public class TeacherEvaluationAction extends ActionSupport{
	
	private String e_class;

	public String getE_class() {
		return e_class;
	}

	public void setE_class(String e_class) {
		this.e_class = e_class;
	}
	
	@Resource(name="TeacherEvaluationServiceI")
	private TeacherEvaluationServiceI teacherEvaluationServiceI;
	@Action(value="Teacherevaluationaction",results={
    		@Result(name="success",location="/TeachEvaluationSuccess.jsp")})
	public String execute(){
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("/applicationContext.xml");//加载Spring配置文件，初始化IOC容器
		//获取问题1的总成绩
		List<String> s1=teacherEvaluationServiceI.findA1by(e_class);
		int count11=0,count12=0,count13=0,count14=0;
		for(int i=0;i<s1.size();i++){
			if(s1.get(i).equals("优")){
				count11++;
			}
			if(s1.get(i).equals("良")){
				count12++;
			}
			if(s1.get(i).equals("中")){
				count13++;
			}
			if(s1.get(i).equals("差")){
				count14++;
			}
		}
		int n1=count11*100+count12*80+count13*60+count14*40;
		//获取问题2的总成绩
		List<String> s2=teacherEvaluationServiceI.findA2by(e_class);
		int count21=0,count22=0,count23=0,count24=0;
		for(int i=0;i<s2.size();i++){
			if(s2.get(i).equals("优")){
				count21++;
			}
			if(s2.get(i).equals("良")){
				count22++;
			}
			if(s2.get(i).equals("中")){
				count23++;
			}
			if(s2.get(i).equals("差")){
				count24++;
			}
		}
		int n2=count21*100+count22*80+count23*60+count24*40;
		//获取问题3的总成绩
		List<String> s3=teacherEvaluationServiceI.findA3by(e_class);
		int count31=0,count32=0,count33=0,count34=0;
		for(int i=0;i<s3.size();i++){
			if(s3.get(i).equals("优")){
				count31++;
			}
			if(s3.get(i).equals("良")){
				count32++;
			}
			if(s3.get(i).equals("中")){
				count33++;
			}
			if(s3.get(i).equals("差")){
				count34++;
			}
		}
		int n3=count31*100+count32*80+count33*60+count34*40;
		//获取问题4的总成绩
		List<String> s4=teacherEvaluationServiceI.findA4by(e_class);
		int count41=0,count42=0,count43=0,count44=0;
		for(int i=0;i<s4.size();i++){
			if(s4.get(i).equals("优")){
				count41++;
			}
			if(s4.get(i).equals("良")){
				count42++;
			}
			if(s4.get(i).equals("中")){
				count43++;
			}
			if(s4.get(i).equals("差")){
				count44++;
			}
		}
		int n4=count41*100+count42*80+count43*60+count44*40;
		int sum=n1+n2+n3+n4;
		NumberFormat nt = NumberFormat.getPercentInstance();//设置百分数精确度2即保留两位小数  
		nt.setMinimumFractionDigits(0);
		float A1 = (float)n1/sum;
		float A2 = (float)n2/sum;
		float A3 = (float)n3/sum;
		float A4 = (float)n4/sum;
		List<String> p=new ArrayList<String>();
		p.add(nt.format(A1));
		p.add(nt.format(A2));
		p.add(nt.format(A3));
		p.add(nt.format(A4));
		/*System.out.print(nt.format(A1));
		System.out.print(nt.format(A2));
		System.out.print(nt.format(A3));
		System.out.print(nt.format(A4));*/
		HttpServletResponse response=ServletActionContext.getResponse();
		try {	
			response.getWriter().print(p);		
		} catch (IOException e) {
			throw new RuntimeException(e.getMessage());
		}
		return SUCCESS;
}
}
