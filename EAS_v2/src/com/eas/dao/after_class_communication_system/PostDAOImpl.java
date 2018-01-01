package com.eas.dao.after_class_communication_system;

import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.eas.model.Posting;
import com.eas.model.Question;
import com.eas.model.Student;
@Transactional
@Repository("postdao")
public class PostDAOImpl implements PostDAO {

	@Autowired
	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}
	
	@Override
	public Student find_student(String id) {
		// TODO Auto-generated method stub
		try {
			String queryString = "from Student as model where model.SId=?";
			Student instance = (Student) getCurrentSession().createQuery(queryString).setParameter(0, id)
					.uniqueResult();
			return instance;
		} catch (RuntimeException re) {
			throw re;
		}
	}

	@Override
	public String find_studentName(String sid) {
		// TODO Auto-generated method stub
		try {
			String queryString = "select model.stuName from Student as model where model.SId=?";
			String instance = (String) getCurrentSession().createQuery(queryString).setParameter(0, sid)
					.uniqueResult();
			return instance;
		} catch (RuntimeException re) {
			throw re;
		}
	}

	@Override
	public String find_teacherName(String tid) {
		// TODO Auto-generated method stub
		try {
			String queryString = "select model.tname from Teacher as model where model.TId=?";
			String instance = (String) getCurrentSession().createQuery(queryString).setParameter(0, tid)
					.uniqueResult();
			return instance;
		} catch (RuntimeException re) {
			throw re;
		}
	}

	@Override
	public List<Posting> get_postlist(String classid) {
		// TODO Auto-generated method stub
		try {
			String queryString = "from Posting as model where model.classid=?";
			List<Posting> instance =  getCurrentSession().createQuery(queryString).setParameter(0, classid)
					.list();
			return instance;
		} catch (RuntimeException re) {
			throw re;
		}
	}

	@Override
	public Posting find_post(int poId) {
		// TODO Auto-generated method stub
		try {
			String queryString = "from Posting as model where model.poId=?";
			Posting instance =(Posting)getCurrentSession().createQuery(queryString).setParameter(0, poId)
					.uniqueResult();
			return instance;
		} catch (RuntimeException re) {
			throw re;
		}
	}

	@Override
	public void add_a_post(Student student, String title, String content,
			String classid) {
		// TODO Auto-generated method stub
		Posting posting=new Posting();
		posting.setStudent(student);
		posting.setTitle(title);
		posting.setContent(content);
		posting.setPoDate(new Date());
		posting.setClassid(classid);
		try {
			getCurrentSession().save(posting);
		} catch (RuntimeException re) {
			throw re;
		}
	}

	@Override
	public List<Posting> find_my_postlist(String sid) {
		// TODO Auto-generated method stub
		try {
			String queryString = "from Posting as model where model.student.SId=?";
			List<Posting> instance =  getCurrentSession().createQuery(queryString).setParameter(0, sid)
					.list();
			return instance;
		} catch (RuntimeException re) {
			throw re;
		}
	}

}
