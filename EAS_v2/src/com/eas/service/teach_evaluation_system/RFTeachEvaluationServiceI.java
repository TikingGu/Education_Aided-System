package com.eas.service.teach_evaluation_system;

import java.util.List;

import com.eas.model.Course;
import com.eas.model.Teacher;

public interface RFTeachEvaluationServiceI {
	public List<Course> findCourseInfby(String sid);
        public List<Course> findCourseby(Teacher teacher);
}
