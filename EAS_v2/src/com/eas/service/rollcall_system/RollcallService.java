package com.eas.service.rollcall_system;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eas.dao.rollcall_system.RollcallDao;
import com.eas.model.rollcall_system.Rollcall;

@Service
public class RollcallService {
	@Autowired
	RollcallDao dao;
	
	public boolean create(String T_ID, String C_IDS, String expired_at, String code) {
		Rollcall obj = new Rollcall();
		
		obj.setCIds(C_IDS);
		obj.setCode(code);
		obj.setTId(T_ID);
		
		try {
			DateFormat fmt =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			Date expired = fmt.parse(expired_at);
			obj.setExpiredAt(expired);
		} catch (ParseException e) {
			return false;
		}

		this.dao.save(obj);

		return true;
	}
	
	public List<Rollcall> getList() {
		// TODO 筛选当前教师
		return this.dao.getAll();
	}
}
