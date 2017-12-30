package com.eas.dao.quiz_system;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.eas.model.Question;
import com.eas.model.Test;

@Transactional
@Repository("questiondao")
public class QuestionDAOImpl implements QuestionDAO{
	// property constants
	public static final String QUESTION_TITLE = "questionTitle";
	public static final String ANSWER = "answer";
	public static final String OPTION1 = "option1";
	public static final String OPTION2 = "option2";
	public static final String OPTION3 = "option3";
	public static final String OPTION4 = "option4";
	public static final String POINT = "point";
	@Autowired
	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	protected void initDao() {
		// do nothing
	}
	@Override
	public void save(Question transientInstance) {
		try {
			getCurrentSession().save(transientInstance);
		} catch (RuntimeException re) {
			throw re;
		}
	}

	@Override
	public void delete(Question persistentInstance) {
		try {
			getCurrentSession().delete(persistentInstance);
		} catch (RuntimeException re) {
			throw re;
		}
	}

	@Override
	public void deleteAll(Test test){
		try {
			String queryString = "delete from Question as model where model.test=?";
			Query query=getCurrentSession().createQuery(queryString).setParameter(0, test);
			int i=query.executeUpdate();
			System.out.println(i);
		} catch (RuntimeException re) {
			throw re;
		}
		
	}
	
	
	@Override
	public void update(Question question){
		try {
			getCurrentSession().update(question);
		} catch (RuntimeException re) {
			throw re;
		}
	}
	
	@Override
	public Question findByQid(Integer qid) {
		try {
			String queryString = "from Question as model where model.questionId=?";
			Question instance = (Question) getCurrentSession().createQuery(queryString).setParameter(0, qid)
					.uniqueResult();
			return instance;
		} catch (RuntimeException re) {
			throw re;
		}
	}
	
	@Override
	public List<String> getAllAnswer(Integer quizid){
		try {
			List<String> temp=new ArrayList<String>();
			String queryString = "select model.answer from Question as model where model.testid=? order by model.questionId";
			temp = getCurrentSession().createQuery(queryString).setParameter(0, quizid)
					.list();
			return temp;
		} catch (RuntimeException re) {
			throw re;
		}
		
	}
	
	@Override
	public String getStudentName(String sid){
		try {
			String queryString = "select model.stuName from Student as model where model.SId=?";
			String name= (String) getCurrentSession().createQuery(queryString).
					setParameter(0, sid).uniqueResult();
			return name;
		} catch (RuntimeException re) {
			throw re;
		}
	}
	
	@Override
	public List<Question> findByTest(Test test) {
		try {
			String queryString = "from Question as model where model.test=? order by model.questionId";
			List<Question> instance = getCurrentSession().createQuery(queryString).setParameter(0, test).list();
			return instance;
		} catch (RuntimeException re) {
			throw re;
		}
	}
	
	@Override
	public List<Question> findByProperty(String propertyName, Object value) {
		try {
			String queryString = "from Question as model where model."
					+ propertyName + "= ?";
			List<Question> result=getCurrentSession().createQuery(queryString).setParameter(0, value).list();
			return result;
		} catch (RuntimeException re) {
			throw re;
		}
	}

	@Override
	public List<Question> findAll() {
		try {
			String queryString = "from Question";
			List<Question> result=getCurrentSession().createQuery(queryString).list();
			return result;
		} catch (RuntimeException re) {
			throw re;
		}
	}

	@Override
	public void attachDirty(Question instance) {
		try {
			getCurrentSession().saveOrUpdate(instance);
		} catch (RuntimeException re) {
			throw re;
		}
	}

	public static QuestionDAO getFromApplicationContext(ApplicationContext ctx) {
		return (QuestionDAO) ctx.getBean("QuestionDAO");
	}
	
	
}