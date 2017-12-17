package com.eas.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * TeachingevaluationId entity. @author MyEclipse Persistence Tools
 */
@Embeddable
public class TeachingevaluationId implements java.io.Serializable {

	// Fields

	private String EId;
	private String EClass;
	private String sid;

	// Constructors

	/** default constructor */
	public TeachingevaluationId() {
	}

	/** full constructor */
	public TeachingevaluationId(String EId, String EClass, String sid) {
		this.EId = EId;
		this.EClass = EClass;
		this.sid = sid;
	}

	// Property accessors

	@Column(name = "e_ID", nullable = false, length = 30)
	public String getEId() {
		return this.EId;
	}

	public void setEId(String EId) {
		this.EId = EId;
	}

	@Column(name = "e_Class", nullable = false, length = 30)
	public String getEClass() {
		return this.EClass;
	}

	public void setEClass(String EClass) {
		this.EClass = EClass;
	}

	@Column(name = "sid", nullable = false, length = 30)
	public String getSid() {
		return this.sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TeachingevaluationId))
			return false;
		TeachingevaluationId castOther = (TeachingevaluationId) other;

		return ((this.getEId() == castOther.getEId()) || (this.getEId() != null
				&& castOther.getEId() != null && this.getEId().equals(
				castOther.getEId())))
				&& ((this.getEClass() == castOther.getEClass()) || (this
						.getEClass() != null && castOther.getEClass() != null && this
						.getEClass().equals(castOther.getEClass())))
				&& ((this.getSid() == castOther.getSid()) || (this.getSid() != null
						&& castOther.getSid() != null && this.getSid().equals(
						castOther.getSid())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getEId() == null ? 0 : this.getEId().hashCode());
		result = 37 * result
				+ (getEClass() == null ? 0 : this.getEClass().hashCode());
		result = 37 * result
				+ (getSid() == null ? 0 : this.getSid().hashCode());
		return result;
	}

}