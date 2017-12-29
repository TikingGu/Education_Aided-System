package com.eas.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * SignId entity. @author MyEclipse Persistence Tools
 */
@Embeddable
public class SignId implements java.io.Serializable {

	// Fields

	private String sid;
	private String classid;
	private Date signDate;

	// Constructors

	/** default constructor */
	public SignId() {
	}

	/** full constructor */
	public SignId(String sid, String classid, Date signDate) {
		this.sid = sid;
		this.classid = classid;
		this.signDate = signDate;
	}

	// Property accessors

	@Column(name = "sid", nullable = false, length = 30)
	public String getSid() {
		return this.sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	@Column(name = "classid", nullable = false, length = 30)
	public String getClassid() {
		return this.classid;
	}

	public void setClassid(String classid) {
		this.classid = classid;
	}

	@Column(name = "Sign_Date", nullable = false, length = 19)
	public Date getSignDate() {
		return this.signDate;
	}

	public void setSignDate(Date signDate) {
		this.signDate = signDate;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof SignId))
			return false;
		SignId castOther = (SignId) other;

		return ((this.getSid() == castOther.getSid()) || (this.getSid() != null
				&& castOther.getSid() != null && this.getSid().equals(
				castOther.getSid())))
				&& ((this.getClassid() == castOther.getClassid()) || (this
						.getClassid() != null && castOther.getClassid() != null && this
						.getClassid().equals(castOther.getClassid())))
				&& ((this.getSignDate() == castOther.getSignDate()) || (this
						.getSignDate() != null
						&& castOther.getSignDate() != null && this
						.getSignDate().equals(castOther.getSignDate())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getSid() == null ? 0 : this.getSid().hashCode());
		result = 37 * result
				+ (getClassid() == null ? 0 : this.getClassid().hashCode());
		result = 37 * result
				+ (getSignDate() == null ? 0 : this.getSignDate().hashCode());
		return result;
	}

}