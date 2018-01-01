package com.eas.action.courseware_uploadanddownload_system;

import java.io.File;  
import java.io.FileInputStream;  
import java.io.FileOutputStream;  
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.struts2.ServletActionContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

import java.util.Map;
import java.util.Date;
import java.sql.Timestamp;

import javax.annotation.Resource;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.eas.model.*;
import com.eas.service.courseware_uploadanddownload_system.*;

public class UploadAction extends ActionSupport {
	private File upload;
	private String uploadFileName;
	private String uploadContextType;
	public File getUpload(){
		return upload;
	}
	public void setUpload(File upload){
		this.upload=upload;
	}
	public String getUploadFileName(){
		return uploadFileName;
	}
	public void setUploadFileName(String fileFileName){
		this.uploadFileName=fileFileName;
	}
	public String getFileContextType(){
		return uploadContextType;
	}
	public void setFileContextType(String fileContextType){
		this.uploadContextType=fileContextType;
	}
	
	
	public String execute() throws Exception{
		//加载Spring配置文件，初始化IOC容器
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		//从容器接管bean
		UploadImp UpLoad=(UploadImp)context.getBean("uploadFile");
	   
		//根据文件名判断上传文件是否重复，若不重复则执行上传操作
		if(!UpLoad.IsHaveFile(uploadFileName)){
		    //获取文件存储位置
			String root = ServletActionContext.getServletContext().getRealPath("/upload");
	        //定义输入流
	        InputStream is=new FileInputStream(upload);
	        int filesize=is.available();
	        //定义输出流
	        OutputStream os = new FileOutputStream(new File(root, uploadFileName));
	        byte[] buffer = new byte[500];
	        int length = 0;
	     
	        while(-1 != (length = is.read(buffer, 0, buffer.length)))
	        {
	            os.write(buffer);
	        }
	        //关闭输入流，输出流，删除临时文件
	        os.close();
	        is.close();
	        upload.delete();
	        
	        Teacher teacher=(Teacher) ActionContext.getContext().getSession().get("teacher");
	        String t1=teacher.getTId();
	        String t2=teacher.getTname();
	        String t3=teacher.getTpassword();
	        
	 		Timestamp time = new Timestamp(System.currentTimeMillis());
	 		Uploadfile upfile=new Uploadfile();
	 		upfile.setFileName(uploadFileName);
	 		Teacher tch=new Teacher();
	 		tch.setTId(t1);
	 		tch.setTpassword(t2);
	 		tch.setTname(t3);
	 		upfile.setTeacher(tch);
	 		upfile.setUploadDate(time);
	 		upfile.setFileSize(filesize);
	 		boolean isOK=UpLoad.AddFile(upfile);
		 	   if(isOK){
		 		   return SUCCESS; 
		 	   }else
		 		   return ERROR;
	   }else
		   return INPUT;
	}
}
