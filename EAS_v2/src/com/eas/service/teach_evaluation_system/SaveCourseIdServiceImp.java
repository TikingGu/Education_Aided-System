package com.eas.service.teach_evaluation_system;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.eas.dao.teach_evaluation_system.SaveCourseIdDAO;

@Service("SaveCourseIdServiceI")
public class SaveCourseIdServiceImp implements SaveCourseIdServiceI{
     @Resource(name="SaveCourseIdDAO")
     private SaveCourseIdDAO saveCourseIdDAO;
     public List<String> findClassIdby(String courseId){
    	 return saveCourseIdDAO.findClassIdby(courseId);
     }
}
