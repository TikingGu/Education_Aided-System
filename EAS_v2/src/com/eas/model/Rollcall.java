package com.eas.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Rollcall entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "rollcall", catalog = "eas")
public class Rollcall implements java.io.Serializable {

	// Fields

	private String CIds;
	private String code;
	private Integer state;

	// Constructors

	/** default constructor */
	public Rollcall() {
	}

	/** full constructor */
	public Rollcall(String code, Integer state) {
		this.code = code;
		this.state = state;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "C_IDS", unique = true, nullable = false)
	public String getCIds() {
		return this.CIds;
	}

	public void setCIds(String CIds) {
		this.CIds = CIds;
	}

	@Column(name = "code")
	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Column(name = "State")
	public Integer getState() {
		return this.state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

}