package com.eas.service.vote_system;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.eas.dao.vote_system.SVoteDAO;

@Service("SVoteServiceI")
public class SVoteServiceImp implements SVoteServiceI{
	@Resource(name="SVoteDAO")
	private SVoteDAO sVoteDAO;
	public void updateAgreebyvoteId(String voteId){
		sVoteDAO.updateAgreebyvoteId(voteId);
	}
	public void updateDisagreebyvoteId(String voteId){
		sVoteDAO.updateDisagreebyvoteId(voteId);
	}
}
