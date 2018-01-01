package com.eas.dao.notice_system;
import java.util.List;

import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.eas.model.*;
import com.eas.util.*;
@Repository("getClassInfo")
public class GetClassInfoBase extends HibernateDAO{
	//查询课程信息
		public List QueryClassInfo(String hql,int offset,int length){
			init();
			Query<Classinfo> query = session.createQuery(hql,Classinfo.class);
			query.setFirstResult(offset);  
	        query.setMaxResults(length);
			List<Classinfo> list = query.getResultList();
			transaction.commit();
	        session.close();
	        return list;
		}
		//查询总记录数
		public int GetAllRowCount(String tchid){
			String hql="from Classinfo where teacher.TId=?";
			init();
			Query<Classinfo> query = session.createQuery(hql,Classinfo.class).setParameter(0,tchid);
			List<Classinfo> slist = query.getResultList();
			int rowcount=slist.size();
			transaction.commit();
	        session.close();
	        return rowcount;
		}
}
