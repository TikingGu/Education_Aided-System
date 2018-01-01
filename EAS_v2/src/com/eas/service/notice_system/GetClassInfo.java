package com.eas.service.notice_system;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.eas.util.PageBean;
import com.eas.model.*;
import com.eas.dao.notice_system.GetClassInfoBase;
import com.eas.util.*;
@Service("classInfo")
public class GetClassInfo {
	private GetClassInfoBase classInfoBase;
	public GetClassInfoBase getClassInfoBase(){
		return classInfoBase;
	}
	@Resource(name="getClassInfo")
	public void setClassInfoBase(GetClassInfoBase classInfoBase){
		this.classInfoBase=classInfoBase;
	}
	public PageBean QueryForPage(int pageMaxSize, int page,String tchid){
		String hql="from Classinfo";
		int allRow=classInfoBase.GetAllRowCount(tchid);
		int a=allRow%pageMaxSize;
		int totaPage1;
		if(a>0){
			totaPage1=allRow/pageMaxSize+1;
		}else{
			totaPage1=allRow/pageMaxSize;
		}
		int offset = PageBean.countOffset(pageMaxSize, page); // 当前页开始记录  
        int length = pageMaxSize; // 每页记录数
		List<Classinfo> list = classInfoBase.QueryClassInfo(hql,offset,length);//某页的信息
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
