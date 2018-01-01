package com.eas.dao.courseware_uploadanddownload_system;

import java.util.List;

import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.eas.model.*;
import com.eas.util.*;
@Repository("getFileInfo")
public class GetFileInfoBase extends HibernateDAO {
	
	//查询文件信息
	public List QueryFileInfo(String hql,int offset,int length){
		init();
		Query<Uploadfile> query = session.createQuery(hql,Uploadfile.class);
		query.setFirstResult(offset);  
        query.setMaxResults(length);
		List<Uploadfile> list = query.getResultList();
		transaction.commit();
        session.close();
        return list;
	}
	//查询总记录数
	public int GetAllRowCount(String hql){
		init();
		Query<Uploadfile> query = session.createQuery(hql,Uploadfile.class);
		List<Uploadfile> slist = query.getResultList();
		int rowcount=slist.size();
		transaction.commit();
        session.close();
        return rowcount;
	}
}
