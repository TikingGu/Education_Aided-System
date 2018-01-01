package com.eas.dao.vote_system;

import org.springframework.stereotype.Repository;

import com.eas.util.HibernateDAO;

@Repository("SVoteDAO")
public class SVoteDAOImp extends HibernateDAO implements SVoteDAO{
	public void updateAgreebyvoteId(String voteId) {
		super.updateAgreebyvoteId(voteId);
	}
	public void updateDisagreebyvoteId(String voteId){
		super.updateDisagreebyvoteId(voteId);
	}
}
