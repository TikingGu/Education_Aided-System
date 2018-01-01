package com.eas.action.notice_system;

import javax.annotation.Resource;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.eas.model.*;
import com.eas.service.notice_system.GetClassInfo;
import com.eas.util.PageBean;
public class NoticeInfoAction extends ActionSupport{
	private int page=1; // 第几页  
    private PageBean pageBean; // 包含分布信息的PageBean  
    private Classinfo classinfo;//信息类
    private int pageMaxSize;//当前页面最大记录数，有页面传值
    
    public int getPage(){
    	return page;
    }
    public void setPage(int page){
    	this.page=page;
    }
    public PageBean getPageBean(){
    	return pageBean;
    }
    @Resource(name="pagebean")
    public void setPageBean(PageBean pageBean){
    	this.pageBean=pageBean;
    }
    public Classinfo getClassinfo(){
    	return classinfo;
    }
    public void setClassinfo(Classinfo classinfo){
    	this.classinfo=classinfo;
    }
    public int getPageMaxSize(){
    	return pageMaxSize;
    }
    public void setPageMaxSize(int pageMaxSize){
    	this.pageMaxSize=pageMaxSize;
    }
    public String execute() throws Exception {
    	//加载Spring配置文件，初始化IOC容器
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        //从容器接管bean
        GetClassInfo getClassInfo=(GetClassInfo)context.getBean("classInfo");
        //获得当前登录老师的id
        Teacher teacher=(Teacher) ActionContext.getContext().getSession().get("teacher");
        String tchid=teacher.getTId();
        this.pageMaxSize=5;//为了测试设为5
        this.pageBean = getClassInfo.QueryForPage(pageMaxSize, page,tchid);
        return SUCCESS;
    }
}
