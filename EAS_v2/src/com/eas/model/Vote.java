package com.eas.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Vote entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "vote", catalog = "eas")
public class Vote implements java.io.Serializable {

	// Fields

	private String voteId;
	private Integer agreeNum;
	private Integer disagreeNum;

	// Constructors

	/** default constructor */
	public Vote() {
	}

	/** full constructor */
	public Vote(Integer agreeNum, Integer disagreeNum) {
		this.agreeNum = agreeNum;
		this.disagreeNum = disagreeNum;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "Vote_ID", unique = true, nullable = false, length = 30)
	public String getVoteId() {
		return this.voteId;
	}

	public void setVoteId(String voteId) {
		this.voteId = voteId;
	}

	@Column(name = "AgreeNum")
	public Integer getAgreeNum() {
		return this.agreeNum;
	}

	public void setAgreeNum(Integer agreeNum) {
		this.agreeNum = agreeNum;
	}

	@Column(name = "DisagreeNum")
	public Integer getDisagreeNum() {
		return this.disagreeNum;
	}

	public void setDisagreeNum(Integer disagreeNum) {
		this.disagreeNum = disagreeNum;
	}

}