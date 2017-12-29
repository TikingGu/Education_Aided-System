package com.eas.model;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Teacher entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "teacher", catalog = "eas30")
public class Teacher implements java.io.Serializable {

	// Fields

	private String TId;
	private String tname;
	private String tpassword;
	private Set<Uploadfile> uploadfiles = new HashSet<Uploadfile>(0);
	private Set<Classinfo> classinfos = new HashSet<Classinfo>(0);

	// Constructors

	/** default constructor */
	public Teacher() {
	}

	/** minimal constructor */
	public Teacher(String tname, String tpassword) {
		this.tname = tname;
		this.tpassword = tpassword;
	}

	/** full constructor */
	public Teacher(String tname, String tpassword, Set<Uploadfile> uploadfiles,
			Set<Classinfo> classinfos) {
		this.tname = tname;
		this.tpassword = tpassword;
		this.uploadfiles = uploadfiles;
		this.classinfos = classinfos;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
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
	public Set<Uploadfile> getUploadfiles() {
		return this.uploadfiles;
	}

	public void setUploadfiles(Set<Uploadfile> uploadfiles) {
		this.uploadfiles = uploadfiles;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "teacher")
	public Set<Classinfo> getClassinfos() {
		return this.classinfos;
	}

	public void setClassinfos(Set<Classinfo> classinfos) {
		this.classinfos = classinfos;
	}

}