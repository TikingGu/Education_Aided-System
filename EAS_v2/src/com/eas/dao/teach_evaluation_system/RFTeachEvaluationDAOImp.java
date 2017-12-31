package com.eas.dao.teach_evaluation_system;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.eas.model.Course;
import com.eas.model.Teacher;
import com.eas.util.HibernateDAO;

@Repository("RFTeachEvaluationDAO")
public class RFTeachEvaluationDAOImp extends HibernateDAO implements RFTeachEvaluationDAO{
       public List<Course> findCourseInfby(String sid){
    	   return super.findCourseInfby(sid);
       }
       public List<Course> findCourseby(Teacher teacher){
    	   return super.findCourseby(teacher);
       }
}
