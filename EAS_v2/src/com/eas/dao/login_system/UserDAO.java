package com.eas.dao.login_system;
import com.eas.model.Student;
import com.eas.model.Teacher;
public interface UserDAO {
	public int Slogin(String id,String pw);
	public int Tlogin(String id,String pw);
	
	public Student get_student(String sid);
	public Teacher get_teacher(String tid);
}
