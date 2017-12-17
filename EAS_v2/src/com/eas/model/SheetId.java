package com.eas.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * SheetId entity. @author MyEclipse Persistence Tools
 */
@Embeddable
public class SheetId implements java.io.Serializable {

	// Fields

	private String sheetId;
	private Integer testid;

	// Constructors

	/** default constructor */
	public SheetId() {
	}

	/** full constructor */
	public SheetId(String sheetId, Integer testid) {
		this.sheetId = sheetId;
		this.testid = testid;
	}

	// Property accessors

	@Column(name = "SheetID", nullable = false, length = 30)
	public String getSheetId() {
		return this.sheetId;
	}

	public void setSheetId(String sheetId) {
		this.sheetId = sheetId;
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
		if (!(other instanceof SheetId))
			return false;
		SheetId castOther = (SheetId) other;

		return ((this.getSheetId() == castOther.getSheetId()) || (this
				.getSheetId() != null && castOther.getSheetId() != null && this
				.getSheetId().equals(castOther.getSheetId())))
				&& ((this.getTestid() == castOther.getTestid()) || (this
						.getTestid() != null && castOther.getTestid() != null && this
						.getTestid().equals(castOther.getTestid())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getSheetId() == null ? 0 : this.getSheetId().hashCode());
		result = 37 * result
				+ (getTestid() == null ? 0 : this.getTestid().hashCode());
		return result;
	}

}