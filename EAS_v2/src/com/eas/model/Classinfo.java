package com.eas.newmodel;

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
 * Classinfo entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "classinfo", catalog = "eas30")
public class Classinfo implements java.io.Serializable {

	// Fields

	private String classId;
	private Course course;
	private Teacher teacher;
	private Integer studentNumber;
	private Set<Sign> signs = new HashSet<Sign>(0);
	private Set<Test> tests = new HashSet<Test>(0);
	private Set<Announcement> announcements = new HashSet<Announcement>(0);
	private Set<Teachingevaluation> teachingevaluations = new HashSet<Teachingevaluation>(
			0);

	// Constructors

	/** default constructor */
	public Classinfo() {
	}

	/** minimal constructor */
	public Classinfo(Course course, Teacher teacher) {
		this.course = course;
		this.teacher = teacher;
	}

	/** full constructor */
	public Classinfo(Course course, Teacher teacher, Integer studentNumber,
			Set<Sign> signs, Set<Test> tests, Set<Announcement> announcements,
			Set<Teachingevaluation> teachingevaluations) {
		this.course = course;
		this.teacher = teacher;
		this.studentNumber = studentNumber;
		this.signs = signs;
		this.tests = tests;
		this.announcements = announcements;
		this.teachingevaluations = teachingevaluations;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "Class_ID", unique = true, nullable = false, length = 30)
	public String getClassId() {
		return this.classId;
	}

	public void setClassId(String classId) {
		this.classId = classId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CourseID", nullable = false)
	public Course getCourse() {
		return this.course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "tid", nullable = false)
	public Teacher getTeacher() {
		return this.teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	@Column(name = "StudentNumber")
	public Integer getStudentNumber() {
		return this.studentNumber;
	}

	public void setStudentNumber(Integer studentNumber) {
		this.studentNumber = studentNumber;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "classinfo")
	public Set<Sign> getSigns() {
		return this.signs;
	}

	public void setSigns(Set<Sign> signs) {
		this.signs = signs;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "classinfo")
	public Set<Test> getTests() {
		return this.tests;
	}

	public void setTests(Set<Test> tests) {
		this.tests = tests;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "classinfo")
	public Set<Announcement> getAnnouncements() {
		return this.announcements;
	}

	public void setAnnouncements(Set<Announcement> announcements) {
		this.announcements = announcements;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "classinfo")
	public Set<Teachingevaluation> getTeachingevaluations() {
		return this.teachingevaluations;
	}

	public void setTeachingevaluations(
			Set<Teachingevaluation> teachingevaluations) {
		this.teachingevaluations = teachingevaluations;
	}

}