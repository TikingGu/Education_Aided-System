package com.eas.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * StuClass entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "stu_class", catalog = "eas36")
public class StuClass implements java.io.Serializable {

	// Fields

	private Integer id;
	private String classid;
	private String sid;

	// Constructors

	/** default constructor */
	public StuClass() {
	}

	/** full constructor */
	public StuClass(String classid, String sid) {
		this.classid = classid;
		this.sid = sid;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "Classid", length = 30)
	public String getClassid() {
		return this.classid;
	}

	public void setClassid(String classid) {
		this.classid = classid;
	}

	@Column(name = "Sid", length = 30)
	public String getSid() {
		return this.sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

}