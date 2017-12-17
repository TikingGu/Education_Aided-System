package com.eas.model;

import java.sql.Timestamp;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Uploadflie entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "uploadflie", catalog = "eas24")
public class Uploadflie implements java.io.Serializable {

	// Fields

	private UploadflieId id;
	private Teacher teacher;
	private Integer fileSize;
	private Timestamp uploadDate;

	// Constructors

	/** default constructor */
	public Uploadflie() {
	}

	/** minimal constructor */
	public Uploadflie(UploadflieId id, Teacher teacher) {
		this.id = id;
		this.teacher = teacher;
	}

	/** full constructor */
	public Uploadflie(UploadflieId id, Teacher teacher, Integer fileSize,
			Timestamp uploadDate) {
		this.id = id;
		this.teacher = teacher;
		this.fileSize = fileSize;
		this.uploadDate = uploadDate;
	}

	// Property accessors
	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "fileName", column = @Column(name = "FileName", nullable = false, length = 50)),
			@AttributeOverride(name = "uploadTeacher", column = @Column(name = "UploadTeacher", nullable = false, length = 30)) })
	public UploadflieId getId() {
		return this.id;
	}

	public void setId(UploadflieId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "UploadTeacher", nullable = false, insertable = false, updatable = false)
	public Teacher getTeacher() {
		return this.teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	@Column(name = "FileSize")
	public Integer getFileSize() {
		return this.fileSize;
	}

	public void setFileSize(Integer fileSize) {
		this.fileSize = fileSize;
	}

	@Column(name = "UploadDate", length = 19)
	public Timestamp getUploadDate() {
		return this.uploadDate;
	}

	public void setUploadDate(Timestamp uploadDate) {
		this.uploadDate = uploadDate;
	}

}