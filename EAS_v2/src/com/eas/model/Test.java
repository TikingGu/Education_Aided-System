package com.eas.model;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Test entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "test", catalog = "eas24")
public class Test implements java.io.Serializable {

	// Fields

	private Integer testId;
	private Classinfo classinfo;
	private Float totalPoints;
	private Timestamp testDate;
	private Set<Question> questions = new HashSet<Question>(0);
	private Set<Sheet> sheets = new HashSet<Sheet>(0);

	// Constructors

	/** default constructor */
	public Test() {
	}

	/** minimal constructor */
	public Test(Classinfo classinfo, Float totalPoints, Timestamp testDate) {
		this.classinfo = classinfo;
		this.totalPoints = totalPoints;
		this.testDate = testDate;
	}

	/** full constructor */
	public Test(Classinfo classinfo, Float totalPoints, Timestamp testDate,
			Set<Question> questions, Set<Sheet> sheets) {
		this.classinfo = classinfo;
		this.totalPoints = totalPoints;
		this.testDate = testDate;
		this.questions = questions;
		this.sheets = sheets;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "Test_ID", unique = true, nullable = false)
	public Integer getTestId() {
		return this.testId;
	}

	public void setTestId(Integer testId) {
		this.testId = testId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Class_ID", nullable = false)
	public Classinfo getClassinfo() {
		return this.classinfo;
	}

	public void setClassinfo(Classinfo classinfo) {
		this.classinfo = classinfo;
	}

	@Column(name = "TotalPoints", nullable = false, precision = 12, scale = 0)
	public Float getTotalPoints() {
		return this.totalPoints;
	}

	public void setTotalPoints(Float totalPoints) {
		this.totalPoints = totalPoints;
	}

	@Column(name = "Test_Date", nullable = false, length = 19)
	public Timestamp getTestDate() {
		return this.testDate;
	}

	public void setTestDate(Timestamp testDate) {
		this.testDate = testDate;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "test")
	public Set<Question> getQuestions() {
		return this.questions;
	}

	public void setQuestions(Set<Question> questions) {
		this.questions = questions;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "test")
	public Set<Sheet> getSheets() {
		return this.sheets;
	}

	public void setSheets(Set<Sheet> sheets) {
		this.sheets = sheets;
	}

}