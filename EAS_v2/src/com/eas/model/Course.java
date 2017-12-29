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
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Course entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "course", catalog = "eas30")
public class Course implements java.io.Serializable {

	// Fields

	private String courseId;
	private String courseName;
	private Integer period;
	private Set<Classinfo> classinfos = new HashSet<Classinfo>(0);

	// Constructors

	/** default constructor */
	public Course() {
	}

	/** minimal constructor */
	public Course(String courseName, Integer period) {
		this.courseName = courseName;
		this.period = period;
	}

	/** full constructor */
	public Course(String courseName, Integer period, Set<Classinfo> classinfos) {
		this.courseName = courseName;
		this.period = period;
		this.classinfos = classinfos;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "Course_ID", unique = true, nullable = false, length = 30)
	public String getCourseId() {
		return this.courseId;
	}

	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	@Column(name = "Course_Name", nullable = false, length = 30)
	public String getCourseName() {
		return this.courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	@Column(name = "Period", nullable = false)
	public Integer getPeriod() {
		return this.period;
	}

	public void setPeriod(Integer period) {
		this.period = period;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "course")
	public Set<Classinfo> getClassinfos() {
		return this.classinfos;
	}

	public void setClassinfos(Set<Classinfo> classinfos) {
		this.classinfos = classinfos;
	}

}