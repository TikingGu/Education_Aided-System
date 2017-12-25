package com.eas.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * UploadflieId entity. @author MyEclipse Persistence Tools
 */
@Embeddable
public class UploadflieId implements java.io.Serializable {

	// Fields

	private String fileName;
	private String uploadTeacher;

	// Constructors

	/** default constructor */
	public UploadflieId() {
	}

	/** full constructor */
	public UploadflieId(String fileName, String uploadTeacher) {
		this.fileName = fileName;
		this.uploadTeacher = uploadTeacher;
	}

	// Property accessors

	@Column(name = "FileName", nullable = false, length = 50)
	public String getFileName() {
		return this.fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	@Column(name = "UploadTeacher", nullable = false, length = 30)
	public String getUploadTeacher() {
		return this.uploadTeacher;
	}

	public void setUploadTeacher(String uploadTeacher) {
		this.uploadTeacher = uploadTeacher;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof UploadflieId))
			return false;
		UploadflieId castOther = (UploadflieId) other;

		return ((this.getFileName() == castOther.getFileName()) || (this
				.getFileName() != null && castOther.getFileName() != null && this
				.getFileName().equals(castOther.getFileName())))
				&& ((this.getUploadTeacher() == castOther.getUploadTeacher()) || (this
						.getUploadTeacher() != null
						&& castOther.getUploadTeacher() != null && this
						.getUploadTeacher()
						.equals(castOther.getUploadTeacher())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getFileName() == null ? 0 : this.getFileName().hashCode());
		result = 37
				* result
				+ (getUploadTeacher() == null ? 0 : this.getUploadTeacher()
						.hashCode());
		return result;
	}

}