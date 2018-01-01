package com.eas.action.courseware_uploadanddownload_system;

import javax.annotation.Resource;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.opensymphony.xwork2.ActionSupport;
import com.eas.model.Uploadfile;
import com.eas.service.courseware_uploadanddownload_system.GetFileInfo;
import com.eas.util.PageBean;

public class FileInfoAction extends ActionSupport{
	private int page=1; // 第几页  
    private PageBean pageBean; // 包含分布信息的PageBean  
    private Uploadfile uploadfile;//页面文件信息类
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
    public Uploadfile getUploadfile(){
    	return uploadfile;
    }
    public void setUploadfile(Uploadfile uploadfile){
    	this.uploadfile=uploadfile;
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
        GetFileInfo getGileInfo=(GetFileInfo)context.getBean("fileInfo");
        this.pageMaxSize=5;
        this.pageBean = getGileInfo.QueryForPage(pageMaxSize, page);
        return SUCCESS;
    }
}
