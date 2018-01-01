package com.eas.service.vote_system;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.eas.dao.vote_system.TVoteDAO;

@Service("TVoteServiceI")
public class TVoteServiceImp implements TVoteServiceI{
	@Resource(name="TVoteDAO")
	private TVoteDAO tVoteDAO;
	public void add(Object object){
		tVoteDAO.add(object);
	}
}
