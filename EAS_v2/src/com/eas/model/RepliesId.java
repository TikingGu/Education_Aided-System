package com.eas.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * RepliesId entity. @author MyEclipse Persistence Tools
 */
@Embeddable
public class RepliesId implements java.io.Serializable {

	// Fields

	private String repliesId;
	private String poId;

	// Constructors

	/** default constructor */
	public RepliesId() {
	}

	/** full constructor */
	public RepliesId(String repliesId, String poId) {
		this.repliesId = repliesId;
		this.poId = poId;
	}

	// Property accessors

	@Column(name = "Replies_ID", nullable = false, length = 30)
	public String getRepliesId() {
		return this.repliesId;
	}

	public void setRepliesId(String repliesId) {
		this.repliesId = repliesId;
	}

	@Column(name = "PoID", nullable = false, length = 30)
	public String getPoId() {
		return this.poId;
	}

	public void setPoId(String poId) {
		this.poId = poId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof RepliesId))
			return false;
		RepliesId castOther = (RepliesId) other;

		return ((this.getRepliesId() == castOther.getRepliesId()) || (this
				.getRepliesId() != null && castOther.getRepliesId() != null && this
				.getRepliesId().equals(castOther.getRepliesId())))
				&& ((this.getPoId() == castOther.getPoId()) || (this.getPoId() != null
						&& castOther.getPoId() != null && this.getPoId()
						.equals(castOther.getPoId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getRepliesId() == null ? 0 : this.getRepliesId().hashCode());
		result = 37 * result
				+ (getPoId() == null ? 0 : this.getPoId().hashCode());
		return result;
	}

}