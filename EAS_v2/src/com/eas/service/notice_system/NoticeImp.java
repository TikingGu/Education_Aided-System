package com.eas.service.notice_system;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.eas.dao.notice_system.NoticeDao;
import com.eas.model.Announcement;
@Service("notice")
public class NoticeImp implements INotice{
	private NoticeDao addNotice;
	public NoticeDao getAddNotice(){
		return addNotice;
	}
	@Resource(name="noticeInfor")
	public void setAddNotice(NoticeDao addNotice){
		this.addNotice=addNotice;
	}
	@Override
	public boolean AddNotice(Announcement announce) {
		return addNotice.AddNoticeInfor(announce);
	}
	
}
