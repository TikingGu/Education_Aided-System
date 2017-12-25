package com.eas.model;

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
 * Teachingevaluation entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "teachingevaluation", catalog = "eas24")
public class Teachingevaluation implements java.io.Serializable {

	// Fields

	private TeachingevaluationId id;
	private Classinfo classinfo;
	private Student student;
	private String a1;
	private String a2;
	private String a3;
	private String a4;
	private String a5;

	// Constructors

	/** default constructor */
	public Teachingevaluation() {
	}

	/** minimal constructor */
	public Teachingevaluation(TeachingevaluationId id, Classinfo classinfo,
			Student student) {
		this.id = id;
		this.classinfo = classinfo;
		this.student = student;
	}

	/** full constructor */
	public Teachingevaluation(TeachingevaluationId id, Classinfo classinfo,
			Student student, String a1, String a2, String a3, String a4,
			String a5) {
		this.id = id;
		this.classinfo = classinfo;
		this.student = student;
		this.a1 = a1;
		this.a2 = a2;
		this.a3 = a3;
		this.a4 = a4;
		this.a5 = a5;
	}

	// Property accessors
	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "EId", column = @Column(name = "e_ID", nullable = false, length = 30)),
			@AttributeOverride(name = "EClass", column = @Column(name = "e_Class", nullable = false, length = 30)),
			@AttributeOverride(name = "sid", column = @Column(name = "sid", nullable = false, length = 30)) })
	public TeachingevaluationId getId() {
		return this.id;
	}

	public void setId(TeachingevaluationId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "e_Class", nullable = false, insertable = false, updatable = false)
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

	@Column(name = "A1", length = 1)
	public String getA1() {
		return this.a1;
	}

	public void setA1(String a1) {
		this.a1 = a1;
	}

	@Column(name = "A2", length = 1)
	public String getA2() {
		return this.a2;
	}

	public void setA2(String a2) {
		this.a2 = a2;
	}

	@Column(name = "A3", length = 1)
	public String getA3() {
		return this.a3;
	}

	public void setA3(String a3) {
		this.a3 = a3;
	}

	@Column(name = "A4", length = 1)
	public String getA4() {
		return this.a4;
	}

	public void setA4(String a4) {
		this.a4 = a4;
	}

	@Column(name = "A5", length = 1)
	public String getA5() {
		return this.a5;
	}

	public void setA5(String a5) {
		this.a5 = a5;
	}

}