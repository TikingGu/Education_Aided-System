package com.eas.dao.quiz_system;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.eas.model.Sheet;
import com.eas.model.Test;
@Transactional
@Repository("Sheetdao")
public class SheetDAOImpl implements SheetDAO {
	@Resource
	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}
	@Override
	public void save(Sheet transientInstance) {
		// TODO Auto-generated method stub
		try {
			getCurrentSession().save(transientInstance);
		} catch (RuntimeException re) {
			throw re;
		}
	}

	@Override
	public Map<String,Float> getAllResult(Integer quizid){
		try {
			Map<String,Float> quizresult=new HashMap<String,Float>();
			String queryString = "from Sheet as model where model.test.testId=?";
			List<Sheet> sheets=getCurrentSession().createQuery(queryString).setParameter(0, quizid).list();
			for(int i=0;i<sheets.size();i++){
				quizresult.put(sheets.get(i).getSid(), sheets.get(i).getScore());
				System.out.print(sheets.get(i).getSid());
				System.out.println(sheets.get(i).getScore());
			}
			return quizresult;
		} catch (RuntimeException re) {
			throw re;
		}
	}
	
	@Override
	public String getAnswer(String sid,Test test){
		try {
			String queryString = "select model.studentAnswers from Sheet as model where model.sid=? and model.test=?";
			String temp=(String) getCurrentSession().createQuery(queryString).setParameter(0, sid)
					.setParameter(1, test).uniqueResult();
			return temp;
		} catch (RuntimeException re) {
			throw re;
		}
	}
	
	@Override
	public Sheet findBySidAndQid(String sid,Integer quizid){
		try {
			String queryString = "from Sheet as model where model.sid=? and model.test.testId=?";
			Sheet mysheet=(Sheet) getCurrentSession().createQuery(queryString).setParameter(0, sid)
					.setParameter(1, quizid).uniqueResult();
			return mysheet;
		} catch (RuntimeException re) {
			throw re;
		}
	}
	
	
	@Override
	public void delete(Sheet persistentInstance) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Sheet sheet) {
		// TODO Auto-generated method stub

	}

	@Override
	public Sheet findBySid(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Sheet> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
