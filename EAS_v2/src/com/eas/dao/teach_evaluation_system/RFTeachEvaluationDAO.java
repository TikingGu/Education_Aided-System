package com.eas.dao.teach_evaluation_system;

import java.util.List;

import com.eas.model.Course;

public interface RFTeachEvaluationDAO {
	public List<Course> findCourseInfby(String sid);
}
