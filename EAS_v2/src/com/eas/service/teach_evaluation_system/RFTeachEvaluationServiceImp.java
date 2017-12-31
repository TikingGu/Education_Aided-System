package com.eas.service.teach_evaluation_system;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.eas.dao.teach_evaluation_system.RFTeachEvaluationDAO;
import com.eas.model.Course;
import com.eas.model.Teacher;


@Service("RFTeachEvaluationServiceI")
public class RFTeachEvaluationServiceImp implements RFTeachEvaluationServiceI{
      @Resource(name="RFTeachEvaluationDAO")
      private RFTeachEvaluationDAO rFTeachEvaluationDAO;
      public List<Course> findCourseInfby(String sid){
    	  return rFTeachEvaluationDAO.findCourseInfby(sid);
      }
       public List<Course> findCourseby(Teacher teacher){
    	  return rFTeachEvaluationDAO.findCourseby(teacher);
      }
}
