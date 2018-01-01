package com.eas.service.courseware_uploadanddownload_system;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.eas.util.PageBean;
import com.eas.model.*;
import com.eas.dao.courseware_uploadanddownload_system.GetFileInfoBase;
import com.eas.util.*;
@Service("fileInfo")
public class GetFileInfo {
	private GetFileInfoBase fileInfoBase;
	public GetFileInfoBase getFileInfoBase(){
		return fileInfoBase;
	}
	@Resource(name="getFileInfo")
	public void setFileInfoBase(GetFileInfoBase fileInfoBase){
		this.fileInfoBase=fileInfoBase;
	}
	public PageBean QueryForPage(int pageMaxSize, int page){
		String hql="from Uploadfile";
		int allRow=fileInfoBase.GetAllRowCount(hql);
		int a=allRow%pageMaxSize;
		int totaPage1;
		if(a>0){
			totaPage1=allRow/pageMaxSize+1;
		}else{
			totaPage1=allRow/pageMaxSize;
		}
		int offset = PageBean.countOffset(pageMaxSize, page); // 当前页开始记录  
        int length = pageMaxSize; // 每页记录数
		List<Uploadfile> list = fileInfoBase.QueryFileInfo(hql,offset,length);//某页的信息
		//把分页信息封装到PageBean中
		PageBean pageBean=new PageBean();
		pageBean.setCurrentPage(page);
		pageBean.setTotaPage(totaPage1);
		pageBean.setTotalRecord(allRow);
		pageBean.setPageSize(pageMaxSize);
		pageBean.setList(list);
		
		return pageBean;
	}
}
