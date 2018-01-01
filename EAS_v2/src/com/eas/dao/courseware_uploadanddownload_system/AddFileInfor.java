package com.eas.dao.courseware_uploadanddownload_system;

import java.util.List;

import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.eas.model.*;
import com.eas.util.*;
@Repository("fileInforInput")
public class AddFileInfor extends HibernateDAO implements IAddFileInfor {
	
	@SuppressWarnings("deprecation")
	public boolean IsHaveFile(String FileName){
		String hql = " from Uploadfile l where l.fileName=?";
		init();
		Query<Uploadfile> query = session.createQuery(hql,Uploadfile.class).setParameter(0,FileName);  
        //query.setString(0, FileName);
        List<Uploadfile> slist = query.getResultList();
        int count=slist.size();
        transaction.commit();
        session.close();
        return count>0?true:false;  
	}
	@Override
	public boolean InforInput(Uploadfile file) {
		init();
		session.save(file);
		transaction.commit();
		boolean isok=true;
		session.close();
		return isok;
	}
}
