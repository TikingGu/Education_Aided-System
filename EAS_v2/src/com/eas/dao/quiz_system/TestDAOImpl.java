package com.eas.dao.quiz_system;

import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.eas.model.Classinfo;
import com.eas.model.Test;


@Transactional
@Repository("testdao")
public class TestDAOImpl implements TestDAO{
	// property constants
	public static final String TOTAL_POINTS = "totalPoints";
	public static final String CLASS_ID = "classId";
	@Autowired
	private SessionFactory sessionFactory;
	@Autowired
	private Test test;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}
	public void setTest(Test t){
		this.test=t;
	}
	public Test getTest(){
		return test;
	}
	
	protected void initDao() {
		// do nothing
	}

	public void save(Classinfo classinfo,String quizname,float points) {
		try {
			
			Test mytest=getTest();
			mytest.setClassinfo(classinfo);
			mytest.setTitle(quizname);
			mytest.setTestDate(new Date());
			mytest.setTotalPoints(points);
			getCurrentSession().save(mytest);
		} catch (RuntimeException re) {
			throw re;
		}
	}
	
	public Integer find(String courseid,String quizname) {
		try {
			String queryString = "select model.testId from Test as model where model.testDate=("
					+ "select max(testDate) from Test as model where model.classId=? and "
					+ " model.title=?)";
			int quizid=(Integer) getCurrentSession().createQuery(queryString).setParameter(0, courseid)
					.setParameter(1, quizname).uniqueResult();
			return quizid;
		} catch (RuntimeException re) {
			throw re;
		}
	}
	
	public void save(Test persistentInstance){
		try {
			Session se=sessionFactory.getCurrentSession();
			se.save(persistentInstance);
		} catch (RuntimeException re) {
			throw re;
		}
	}
	
	public void delete(Test persistentInstance) {
		try {
			getCurrentSession().delete(persistentInstance);
		} catch (RuntimeException re) {
			throw re;
		}
	}
	
	public void update(Test persistentInstance){
		try {
			getCurrentSession().update(persistentInstance);
		} catch (RuntimeException re) {
			throw re;
		}
	}

	public Test findByTid(Integer id) {
		try {
			String queryString = "from Test as model where model.testId=?";
			Test instance = (Test) getCurrentSession().createQuery(queryString).setParameter(0, id).uniqueResult();
			return instance;
		} catch (RuntimeException re) {
			throw re;
		}
	}
	
	public Classinfo find_classinfo(String classid){
		try {
			String queryString = "from Classinfo as model where model.classId=?";
			Classinfo instance = (Classinfo) getCurrentSession().createQuery(queryString).setParameter(0, classid).uniqueResult();
			return instance;
		} catch (RuntimeException re) {
			throw re;
		}
	}
	
	public List<Test> findByClassinfo(Classinfo classinfo) {
		try {
			String queryString = "from Test as model where model.classinfo=?";
			List<Test> instance = getCurrentSession().createQuery(queryString).setParameter(0, classinfo).list();
			return instance;
		} catch (RuntimeException re) {
			throw re;
		}
	}
	
	public List<Test> findByProperty(String propertyName, Object value) {
		try {
			String queryString = "from Test as model where model."
					+ propertyName + "= ?";
			List<Test> result=getCurrentSession().createQuery(queryString).setParameter(0, value).list();
			return result;
		} catch (RuntimeException re) {
			throw re;
		}
	}
	
	public List<Test> findAll() {
		try {
			String queryString = "from Test";
			List<Test> result=getCurrentSession().createQuery(queryString).list();
			return result;
		} catch (RuntimeException re) {
			throw re;
		}
	}

	public void attachDirty(Test instance) {
		try {
			getCurrentSession().saveOrUpdate(instance);
		} catch (RuntimeException re) {
			throw re;
		}
	}

	public static TestDAO getFromApplicationContext(ApplicationContext ctx) {
		return (TestDAO) ctx.getBean("TestDAO");
	}
}