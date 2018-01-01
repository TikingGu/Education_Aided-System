package com.eas.dao.notice_system;

import org.springframework.stereotype.Repository;

import com.eas.model.Announcement;
import com.eas.util.HibernateDAO;
import com.eas.model.*;
@Repository("noticeInfor")
public class NoticeDao extends HibernateDAO implements INoticeDao{
	public boolean AddNoticeInfor(Announcement announce){
		init();
		session.save(announce);
		transaction.commit();
		session.close();
		return true;
	}
	
}
