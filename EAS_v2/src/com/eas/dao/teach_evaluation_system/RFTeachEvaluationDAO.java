package com.eas.dao.teach_evaluation_system;

import java.util.List;

import com.eas.model.Course;
import com.eas.model.Teacher;

public interface RFTeachEvaluationDAO {
	public List<Course> findCourseInfby(String sid);
        public List<Course> findCourseby(Teacher teacher);
}
