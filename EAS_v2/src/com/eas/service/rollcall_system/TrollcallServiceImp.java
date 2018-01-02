package com.eas.service.rollcall_system;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.eas.dao.rollcall_system.TrollcallDAO;

@Service("TrollcallServiceI")
public class TrollcallServiceImp implements TrollcallServiceI{
    @Resource(name="TrollcallDAO")
    private TrollcallDAO trollcallDAO;
    public void add(Object object){
    	trollcallDAO.add(object);
    }
    public void update(Object object){
    	trollcallDAO.update(object);
    }
    public List<String> ShowStudentsSign(){
    	return trollcallDAO.ShowStudentsSign();
    }
	public List<String> DeleteStudentsSign(){
		return trollcallDAO.DeleteStudentsSign();
	}
}
