package com.eas.dao.rollcall_system;

import java.util.List;

public interface TrollcallDAO {
	public void add(Object object);
	public void update(Object object);
	public List<String> ShowStudentsSign();
	public List<String> DeleteStudentsSign();
}
