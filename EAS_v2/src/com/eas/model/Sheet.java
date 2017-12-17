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
 * Sheet entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "sheet", catalog = "eas24")
public class Sheet implements java.io.Serializable {

	// Fields

	private SheetId id;
	private Test test;
	private String sid;
	private String studentAnswers;
	private Float score;

	// Constructors

	/** default constructor */
	public Sheet() {
	}

	/** minimal constructor */
	public Sheet(SheetId id, Test test) {
		this.id = id;
		this.test = test;
	}

	/** full constructor */
	public Sheet(SheetId id, Test test, String sid, String studentAnswers,
			Float score) {
		this.id = id;
		this.test = test;
		this.sid = sid;
		this.studentAnswers = studentAnswers;
		this.score = score;
	}

	// Property accessors
	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "sheetId", column = @Column(name = "SheetID", nullable = false, length = 30)),
			@AttributeOverride(name = "testid", column = @Column(name = "testid", nullable = false)) })
	public SheetId getId() {
		return this.id;
	}

	public void setId(SheetId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "testid", nullable = false, insertable = false, updatable = false)
	public Test getTest() {
		return this.test;
	}

	public void setTest(Test test) {
		this.test = test;
	}

	@Column(name = "Sid", length = 30)
	public String getSid() {
		return this.sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	@Column(name = "Student_Answers", length = 30)
	public String getStudentAnswers() {
		return this.studentAnswers;
	}

	public void setStudentAnswers(String studentAnswers) {
		this.studentAnswers = studentAnswers;
	}

	@Column(name = "Score", precision = 12, scale = 0)
	public Float getScore() {
		return this.score;
	}

	public void setScore(Float score) {
		this.score = score;
	}

}