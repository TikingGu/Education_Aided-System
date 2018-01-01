package com.eas.action.courseware_uploadanddownload_system;

import java.io.InputStream;
import java.io.UnsupportedEncodingException;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
public class DownloadAction extends ActionSupport {
	//设置文件下载路径
	private final static String DOWNLOADFILEPATH="/upload/";
	private String fileName;
	private InputStream downloadFile;

	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public void setDownloadFile(InputStream downloadFile){
		this.downloadFile=downloadFile;
	}
	//从下载文件原始存放路径读取得到文件输出流
	public InputStream getDownloadFile() {	
		System.out.println(DOWNLOADFILEPATH+fileName);
		InputStream in=ServletActionContext.getServletContext().getResourceAsStream(DOWNLOADFILEPATH+fileName);
		//System.out.println(in);
		return in;
	}
	//如果下载文件名为中文，进行字符编码转换
	public String getDownloadChineseFileName() {
		String downloadChineseFileName = fileName;
		try {
			downloadChineseFileName = new String(downloadChineseFileName.getBytes(), "ISO8859-1");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return downloadChineseFileName;
	}
	public String execute() {
		return SUCCESS;
	}
}
