package com.eas.util;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.eas.model.Student;
import com.eas.model.Teacher;

public class HibernateDAO {
	// 1:下面的方法默认加载hibernate.cfg.xml文件
	public Configuration configuare = null;
	// 2:创建sessionFactory
	public SessionFactory sessionFactory = null;
	// 3:创建session
	public Session session = null;
	// 4:开始事务,Hibernate必须显式的手动提交事务
	public Transaction transaction = null;
	public void init() {
	configuare = new Configuration().configure();
	sessionFactory = configuare.buildSessionFactory();
	session = sessionFactory.openSession();
	transaction = session.beginTransaction();
	}
	public void destory() {
	// 7:关闭session
	session.close();
	// 8:关闭sessionFactory
	sessionFactory.close();
	}
	/**
	* 添加对象到数据表
	* @param object
	*/
     public void add(Object object){
	try{
	init();
	session.save(object);
	transaction.commit();
	}
	catch(Exception e){
	 e.printStackTrace();
	}
	finally{
     destory();
	}
}
	/**
	* 查询从数据表到对象
	* @param object
	*/
	/*public Object get(Class clas,String a1)
	{
	Object object=null;
	try{
	init();
	object=session.get(clas,a1);
	transaction.commit();
	}
	catch(Exception e){
	e.printStackTrace();
	}
	finally{
	destory();
	}
	return object;
	}*/
     /*public String get(String e_class){
    	 String a1=null;
    	 try{
    		 init();
    		 a1=session.get(e_class);
    		 transaction.commit();
    	 }
    	 catch(Exception e){
    		 e.printStackTrace();
    	 }
    	 finally{
    		 destory();
    	 }
    	 return a1;
     }*/
	/**
	 * 从数据表删除数据
	 * @param object
	 */
	public void delete(Object object){
	try{
	init();
	session.delete(object);
	transaction.commit();
	}
	catch(Exception e){
	e.printStackTrace();
	}
	finally{
	destory();
	}
	}
	/**
	   * 从数据表修改数据
	   * @param object
	   */
	public void update(Object object){
	try{
	init();
	session.update(object);
	transaction.commit();
	}
	catch(Exception e){
	e.printStackTrace();
	}
	finally{
	destory();
	}
	}
	/*老师和学生的登陆判断*/
	public int Tlogin(String id,String pw){
		try{
			System.out.println(id);
			System.out.println(pw);
			init();
		String hql="from Teacher as t Where t.TId=?";
		List<Teacher> n=session.createQuery(hql).setParameter(0, id).list();
		if(!n.isEmpty())
			if(n.get(0).getTpassword().equals(pw)){
				return 1;
			}else{
				return -2;
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		finally{
			transaction.commit();
			destory();
			}
		return -1;
		}			
	public int Slogin(String id,String pw){
		
		try{
			init();
		String hql="from Student as s Where s.SId=?";
		List<Student> n=session.createQuery(hql).setParameter(0, id).list();
		if(!n.isEmpty())
			if(n.get(0).getStuPassword().equals(pw)){
<<<<<<< HEAD
				return 0;
=======
				return 1;
>>>>>>> 42717b619610128d059b194a2ad60f26ec0681c4
			}else{
				return -2;
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		finally{
			transaction.commit();
			destory();
			}
		return -1;
		}

        /*查询老师的评教结果*/
	public List<String> findA1by(String EClass){
		try{
			init();
			String hql="select Te.a1 from Teachingevaluation as Te where Te.EClass=?";
			List<String> n1=session.createQuery(hql).setParameter(0,EClass).list();
			return n1;
		}catch(Exception e){
			e.printStackTrace();
		}
		finally{
			transaction.commit();
			destory();
		}
		return null;
	}
	public List<String> findA2by(String EClass){
		try{
			init();
			String hql="select Te.a2 from Teachingevaluation as Te where Te.EClass=?";
			List<String> n2=session.createQuery(hql).setParameter(0,EClass).list();
			return n2;
		}catch(Exception e){
			e.printStackTrace();
		}
		finally{
			transaction.commit();
			destory();
		}
		return null;
	}
	public List<String> findA3by(String EClass){
		try{
			init();
			String hql="select Te.a3 from Teachingevaluation as Te where Te.EClass=?";
			List<String> n3=session.createQuery(hql).setParameter(0,EClass).list();
			return n3;
		}catch(Exception e){
			e.printStackTrace();
		}
		finally{
			transaction.commit();
			destory();
		}
		return null;
	}
	public List<String> findA4by(String EClass){
		try{
			init();
			String hql="select Te.a4 from Teachingevaluation as Te where Te.EClass=?";
			List<String> n4=session.createQuery(hql).setParameter(0,EClass).list();
			return n4;
		}catch(Exception e){
			e.printStackTrace();
		}
		finally{
			transaction.commit();
			destory();
		}
		return null;
	}
}
