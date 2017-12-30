package com.eas.service.teach_evaluation_system;

import java.util.List;

import com.eas.model.Course;

public interface RFTeachEvaluationServiceI {
	public List<Course> findCourseInfby(String sid);
}
