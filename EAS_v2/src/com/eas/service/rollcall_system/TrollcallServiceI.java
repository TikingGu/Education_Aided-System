package com.eas.service.rollcall_system;

import java.util.List;

public interface TrollcallServiceI {
	public void add(Object object);
	public void update(Object object);
	public List<String> ShowStudentsSign();
	public List<String> DeleteStudentsSign();
}
