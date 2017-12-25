package com.eas.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * QuestionId entity. @author MyEclipse Persistence Tools
 */
@Embeddable
public class QuestionId implements java.io.Serializable {

	// Fields

	private String questionId;
	private Integer testid;

	// Constructors

	/** default constructor */
	public QuestionId() {
	}

	/** full constructor */
	public QuestionId(String questionId, Integer testid) {
		this.questionId = questionId;
		this.testid = testid;
	}

	// Property accessors

	@Column(name = "QuestionID", nullable = false, length = 30)
	public String getQuestionId() {
		return this.questionId;
	}

	public void setQuestionId(String questionId) {
		this.questionId = questionId;
	}

	@Column(name = "testid", nullable = false)
	public Integer getTestid() {
		return this.testid;
	}

	public void setTestid(Integer testid) {
		this.testid = testid;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof QuestionId))
			return false;
		QuestionId castOther = (QuestionId) other;

		return ((this.getQuestionId() == castOther.getQuestionId()) || (this
				.getQuestionId() != null && castOther.getQuestionId() != null && this
				.getQuestionId().equals(castOther.getQuestionId())))
				&& ((this.getTestid() == castOther.getTestid()) || (this
						.getTestid() != null && castOther.getTestid() != null && this
						.getTestid().equals(castOther.getTestid())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getQuestionId() == null ? 0 : this.getQuestionId()
						.hashCode());
		result = 37 * result
				+ (getTestid() == null ? 0 : this.getTestid().hashCode());
		return result;
	}

}