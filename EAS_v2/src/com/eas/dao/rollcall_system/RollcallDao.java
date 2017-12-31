package com.eas.dao.rollcall_system;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.eas.model.rollcall_system.Rollcall;

@Repository (value = "RollcallDaoRepo")
@Transactional()
public class RollcallDao {
	@Resource(name = "sessionFactory")
    SessionFactory sf;

	public void save(Rollcall obj) {
		Session sess = this.sf.getCurrentSession();

		sess.save(obj);
	}
	
	@SuppressWarnings("unchecked")
	public List<Rollcall> getAll() {
		return this.sf.getCurrentSession().createQuery("from Rollcall").list();
	}
}