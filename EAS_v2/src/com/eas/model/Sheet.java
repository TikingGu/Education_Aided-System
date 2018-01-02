package com.eas.model;

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
 * Sheet entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "sheet", catalog = "eas36")
public class Sheet implements java.io.Serializable {

	// Fields

	private Integer sheetId;
	private Test test;
	private String sid;
	private String studentAnswers;
	private float score;

	// Constructors

	/** default constructor */
	public Sheet() {
	}

	/** minimal constructor */
	public Sheet(Test test) {
		this.test = test;
	}

	/** full constructor */
	public Sheet(Test test, String sid, String studentAnswers, float score) {
		this.test = test;
		this.sid = sid;
		this.studentAnswers = studentAnswers;
		this.score = score;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "SheetID", unique = true, nullable = false)
	public Integer getSheetId() {
		return this.sheetId;
	}

	public void setSheetId(Integer sheetId) {
		this.sheetId = sheetId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "testid", nullable = false)
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
	public float getScore() {
		return this.score;
	}

	public void setScore(float score) {
		this.score = score;
	}

}