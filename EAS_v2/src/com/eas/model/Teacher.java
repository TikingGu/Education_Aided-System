package com.eas.model;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Teacher entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "teacher", catalog = "eas24")
public class Teacher implements java.io.Serializable {

	// Fields

	private String TId;
	private String tname;
	private String tpassword;
	private Set<Uploadflie> uploadflies = new HashSet<Uploadflie>(0);
	private Set<Classinfo> classinfos = new HashSet<Classinfo>(0);

	// Constructors

	/** default constructor */
	public Teacher() {
	}

	/** minimal constructor */
	public Teacher(String TId, String tname, String tpassword) {
		this.TId = TId;
		this.tname = tname;
		this.tpassword = tpassword;
	}

	/** full constructor */
	public Teacher(String TId, String tname, String tpassword,
			Set<Uploadflie> uploadflies, Set<Classinfo> classinfos) {
		this.TId = TId;
		this.tname = tname;
		this.tpassword = tpassword;
		this.uploadflies = uploadflies;
		this.classinfos = classinfos;
	}

	// Property accessors
	@Id
	@Column(name = "T_ID", unique = true, nullable = false, length = 30)
	public String getTId() {
		return this.TId;
	}

	public void setTId(String TId) {
		this.TId = TId;
	}

	@Column(name = "tName", nullable = false, length = 30)
	public String getTname() {
		return this.tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	@Column(name = "tPassword", nullable = false, length = 30)
	public String getTpassword() {
		return this.tpassword;
	}

	public void setTpassword(String tpassword) {
		this.tpassword = tpassword;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "teacher")
	public Set<Uploadflie> getUploadflies() {
		return this.uploadflies;
	}

	public void setUploadflies(Set<Uploadflie> uploadflies) {
		this.uploadflies = uploadflies;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "teacher")
	public Set<Classinfo> getClassinfos() {
		return this.classinfos;
	}

	public void setClassinfos(Set<Classinfo> classinfos) {
		this.classinfos = classinfos;
	}

}