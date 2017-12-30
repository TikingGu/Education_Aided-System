package com.eas.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Uploadfile entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "uploadfile", catalog = "eas")
public class Uploadfile implements java.io.Serializable {

	// Fields

	private String fileName;
	private Teacher teacher;
	private Integer fileSize;
	private Date uploadDate;

	// Constructors

	/** default constructor */
	public Uploadfile() {
	}

	/** minimal constructor */
	public Uploadfile(Teacher teacher) {
		this.teacher = teacher;
	}

	/** full constructor */
	public Uploadfile(Teacher teacher, Integer fileSize, Date uploadDate) {
		this.teacher = teacher;
		this.fileSize = fileSize;
		this.uploadDate = uploadDate;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "FileName", unique = true, nullable = false, length = 50)
	public String getFileName() {
		return this.fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "UploadTeacher", nullable = false)
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
	public Date getUploadDate() {
		return this.uploadDate;
	}

	public void setUploadDate(Date uploadDate) {
		this.uploadDate = uploadDate;
	}

}