package com.eas.dao.teach_evaluation_system;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.eas.util.HibernateDAO;

@Repository("SaveCourseIdDAO")
public class SaveCourseIdDAOImp extends HibernateDAO implements SaveCourseIdDAO {
	public List<String> findClassIdby(String courseId){
		return super.findClassIdby(courseId);
	}
}
