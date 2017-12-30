package com.eas.dao.teach_evaluation_system;

import java.util.List;

public interface TeacherEvaluationDAO {
	public List<String> findA1by(String EClass);
	public List<String> findA2by(String EClass);
	public List<String> findA3by(String EClass);
	public List<String> findA4by(String EClass);
}
