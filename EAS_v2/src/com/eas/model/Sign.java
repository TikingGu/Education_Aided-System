package com.eas.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Sign entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "sign", catalog = "eas")
public class Sign implements java.io.Serializable {

	// Fields

	private Integer id;
	private String sid;
	private String classid;

	// Constructors

	/** default constructor */
	public Sign() {
	}

	/** full constructor */
	public Sign(String sid, String classid) {
		this.sid = sid;
		this.classid = classid;
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

}