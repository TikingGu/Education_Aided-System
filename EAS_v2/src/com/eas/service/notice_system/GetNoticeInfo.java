package com.eas.service.notice_system;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.eas.util.PageBean;
import com.eas.model.*;
import com.eas.dao.notice_system.GetClassInfoBase;
import com.eas.dao.notice_system.GetNoticeInfoBase;
import com.eas.util.*;
@Service("noticeInfo")
public class GetNoticeInfo {
	private GetNoticeInfoBase noticeInfoBase;
	public GetNoticeInfoBase getNoticeInfoBase(){
		return noticeInfoBase;
	}
	@Resource(name="getNoticeInfo")
	public void setNoticeInfoBase(GetNoticeInfoBase noticeInfoBase){
		this.noticeInfoBase=noticeInfoBase;
	}
	public PageBean QueryForPage(int pageMaxSize, int page){
		String hql="from Announcement ";
		int offset = PageBean.countOffset(pageMaxSize, page); // 当前页开始记录  
        int length = pageMaxSize; // 每页记录数
		List<Announcement> list = noticeInfoBase.QueryNoticeInfo(hql,offset,length);//某页的信息
//		Announcement obj=(Announcement)list.get(0);
//		String id=obj.getClassid();
//		System.out.println(id);
		int allRow=list.size();
		int a=allRow%pageMaxSize;
		int totaPage1;
		if(a>0){
			totaPage1=allRow/pageMaxSize+1;
		}else{
			totaPage1=allRow/pageMaxSize;
		}

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
