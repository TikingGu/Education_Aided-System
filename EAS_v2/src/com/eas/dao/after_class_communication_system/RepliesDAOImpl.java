package com.eas.dao.after_class_communication_system;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.eas.model.Replies;
@Transactional
@Repository("repliesdao")
public class RepliesDAOImpl implements RepliesDAO {

	@Autowired
	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}
	
	@Override
	public List<Replies> get_replieslist(Integer postid) {
		// TODO Auto-generated method stub
		try {
			String queryString = "from Replies as model where model.posting.poId=?";
			List<Replies> instance = getCurrentSession().createQuery(queryString).setParameter(0, postid)
					.list();
			return instance;
		} catch (RuntimeException re) {
			throw re;
		}
	}

	@Override
	public void save(Replies replies) {
		// TODO Auto-generated method stub
		try {
			getCurrentSession().save(replies);
		} catch (RuntimeException re) {
			throw re;
		}
	}

}
