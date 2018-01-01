package com.eas.action.notice_system;

import javax.annotation.Resource;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.eas.model.*;
import com.eas.service.notice_system.GetNoticeInfo;
import com.eas.util.PageBean;
public class ShowNoticeAction extends ActionSupport{
	private int page=1; // 第几页  
    private PageBean pageBean; // 包含分布信息的PageBean  
    private Announcement announce;//信息类
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
    public Announcement getAnnounce(){
    	return announce;
    }
    public void setAnnounce(Classinfo classinfo){
    	this.announce=announce;
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
        GetNoticeInfo getNoticeInfo=(GetNoticeInfo)context.getBean("noticeInfo");
        this.pageMaxSize=5;//为了测试设为5
        this.pageBean = getNoticeInfo.QueryForPage(pageMaxSize, page);
        return SUCCESS;
    }
}
