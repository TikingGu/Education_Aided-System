package com.eas.dao.notice_system;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.eas.model.*;
import com.eas.util.*;
@Repository("getNoticeInfo")
public class GetNoticeInfoBase extends HibernateDAO{
	//查询公告信息
			public List QueryNoticeInfo(String hql,int offset,int length){
				init();
				Query<Announcement> query = session.createQuery(hql,Announcement.class);
				query.setFirstResult(offset);  
		        query.setMaxResults(length);
				List<Announcement> list = query.getResultList();
				transaction.commit();
		        session.close();
		        return list;
			}
}
