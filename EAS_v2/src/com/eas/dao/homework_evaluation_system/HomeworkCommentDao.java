package com.eas.dao.homework_evaluation_system;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.eas.model.homework_evaluation_system.HomeworkComment;

@Repository (value = "HomeworkCommentRepo")
@Transactional()
public class HomeworkCommentDao {
	@Resource(name = "sessionFactory")
    SessionFactory sf;

	public void save(HomeworkComment obj) {
		Session sess = this.sf.getCurrentSession();

		sess.save(obj);
	}
	
	@SuppressWarnings("unchecked")
	public List<HomeworkComment> getAll() {
		return this.sf.getCurrentSession().createQuery("from HomeworkComment").list();
	}

	@SuppressWarnings({ "unchecked", "rawtypes", "deprecation" })
	public List<HomeworkComment> getListBySid(String sid) {
		Query query = this.sf.getCurrentSession().createQuery("from HomeworkComment where S_ID = :sid");
		query.setString("sid", sid);
		
		return query.list();
	}
}