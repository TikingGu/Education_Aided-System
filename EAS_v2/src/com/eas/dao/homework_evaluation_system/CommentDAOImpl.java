package com.eas.dao.homework_evaluation_system;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.eas.model.Comment;
import com.eas.model.Student;

@Transactional
@Repository("commentdao")
public class CommentDAOImpl implements CommentDAO {

	@Autowired
	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	
	@Override
	public List<Student> get_studentlist(String classId) {
		// TODO Auto-generated method stub
		try {
			String queryString = "from Student as model where model.SId in ("
					+ "select s.sid from StuClass as s where s.classid=?)";
			List<Student> instance = getCurrentSession().createQuery(queryString).setParameter(0, classId)
					.list();
			return instance;
		} catch (RuntimeException re) {
			throw re;
		}
	}

	@Override
	public void save(Comment comment) {
		// TODO Auto-generated method stub
		try {
			getCurrentSession().save(comment);
		} catch (RuntimeException re) {
			throw re;
		}
	}

	@Override
	public List<Comment> find_comments(String classId, String sid) {
		// TODO Auto-generated method stub
		try {
			String queryString = "from Comment as model where model.title=? "
					+ "and model.student.SId=? order by model.commentId desc";
			List<Comment> instance = getCurrentSession().createQuery(queryString).setParameter(0, classId)
					.setParameter(1, sid).list();
			return instance;
		} catch (RuntimeException re) {
			throw re;
		}
	}

}
