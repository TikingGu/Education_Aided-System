package com.eas.newmodel;

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
 * Sign entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "sign", catalog = "eas30")
public class Sign implements java.io.Serializable {

	// Fields

	private SignId id;
	private Classinfo classinfo;
	private Student student;
	private Integer signIn;

	// Constructors

	/** default constructor */
	public Sign() {
	}

	/** minimal constructor */
	public Sign(SignId id, Classinfo classinfo, Student student) {
		this.id = id;
		this.classinfo = classinfo;
		this.student = student;
	}

	/** full constructor */
	public Sign(SignId id, Classinfo classinfo, Student student, Integer signIn) {
		this.id = id;
		this.classinfo = classinfo;
		this.student = student;
		this.signIn = signIn;
	}

	// Property accessors
	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "sid", column = @Column(name = "sid", nullable = false, length = 30)),
			@AttributeOverride(name = "classid", column = @Column(name = "classid", nullable = false, length = 30)),
			@AttributeOverride(name = "signDate", column = @Column(name = "Sign_Date", nullable = false, length = 19)) })
	public SignId getId() {
		return this.id;
	}

	public void setId(SignId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "classid", nullable = false, insertable = false, updatable = false)
	public Classinfo getClassinfo() {
		return this.classinfo;
	}

	public void setClassinfo(Classinfo classinfo) {
		this.classinfo = classinfo;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "sid", nullable = false, insertable = false, updatable = false)
	public Student getStudent() {
		return this.student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Column(name = "Sign_In")
	public Integer getSignIn() {
		return this.signIn;
	}

	public void setSignIn(Integer signIn) {
		this.signIn = signIn;
	}

}