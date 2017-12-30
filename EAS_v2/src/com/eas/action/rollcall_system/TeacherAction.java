package com.eas.action.rollcall_system;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableMBeanExport;

import com.eas.model.rollcall_system.Rollcall;
import com.eas.service.rollcall_system.RollcallService;
import com.opensymphony.xwork2.ActionSupport;

@EnableMBeanExport
public class TeacherAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2504519677855682723L;
	
	private String T_ID;
	private String C_IDS;
	private String code;
	private String expired_at;
	
	@Autowired
	private RollcallService rollcallService;
	
	public void setT_ID(String val) {
		this.T_ID = val;
	}

	public void setC_IDS(String val) {
		this.C_IDS = val;
	}

	public void setCode(String val) {
		this.code = val;
	}

	public void setExpired_at(String val) {
		this.expired_at = val;
	}
	
	public List<Rollcall> getList() {
		System.out.println(rollcallService.getList().size());
		return rollcallService.getList();
	}
	
	public String list() {
		System.out.println(rollcallService.getList().size());
		return "success";
	}

	public String create() {
		if (rollcallService.create(T_ID, C_IDS, expired_at, code)) {
			return "success";
		}

		return "error";
	}
}
