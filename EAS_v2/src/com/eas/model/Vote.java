package com.eas.model;

/**
 * Vote entity. @author MyEclipse Persistence Tools
 */

public class Vote implements java.io.Serializable {

	// Fields

	private String voteId;
	private Integer agreeNum;
	private Integer disagreeNum;

	// Constructors

	/** default constructor */
	public Vote() {
	}

	/** minimal constructor */
	public Vote(String voteId) {
		this.voteId = voteId;
	}

	/** full constructor */
	public Vote(String voteId, Integer agreeNum, Integer disagreeNum) {
		this.voteId = voteId;
		this.agreeNum = agreeNum;
		this.disagreeNum = disagreeNum;
	}

	// Property accessors

	public String getVoteId() {
		return this.voteId;
	}

	public void setVoteId(String voteId) {
		this.voteId = voteId;
	}

	public Integer getAgreeNum() {
		return this.agreeNum;
	}

	public void setAgreeNum(Integer agreeNum) {
		this.agreeNum = agreeNum;
	}

	public Integer getDisagreeNum() {
		return this.disagreeNum;
	}

	public void setDisagreeNum(Integer disagreeNum) {
		this.disagreeNum = disagreeNum;
	}

}