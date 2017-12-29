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
 * Student entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "student", catalog = "eas30")
public class Student implements java.io.Serializable {

	// Fields

	private String SId;
	private String stuPassword;
	private String stuName;
	private Set<Comment> comments = new HashSet<Comment>(0);
	private Set<Sign> signs = new HashSet<Sign>(0);
	private Set<Posting> postings = new HashSet<Posting>(0);
	private Set<Teachingevaluation> teachingevaluations = new HashSet<Teachingevaluation>(
			0);

	// Constructors

	/** default constructor */
	public Student() {
	}

	/** minimal constructor */
	public Student(String stuPassword, String stuName) {
		this.stuPassword = stuPassword;
		this.stuName = stuName;
	}

	/** full constructor */
	public Student(String stuPassword, String stuName, Set<Comment> comments,
			Set<Sign> signs, Set<Posting> postings,
			Set<Teachingevaluation> teachingevaluations) {
		this.stuPassword = stuPassword;
		this.stuName = stuName;
		this.comments = comments;
		this.signs = signs;
		this.postings = postings;
		this.teachingevaluations = teachingevaluations;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "S_ID", unique = true, nullable = false, length = 30)
	public String getSId() {
		return this.SId;
	}

	public void setSId(String SId) {
		this.SId = SId;
	}

	@Column(name = "stuPassword", nullable = false, length = 30)
	public String getStuPassword() {
		return this.stuPassword;
	}

	public void setStuPassword(String stuPassword) {
		this.stuPassword = stuPassword;
	}

	@Column(name = "stuName", nullable = false, length = 30)
	public String getStuName() {
		return this.stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "student")
	public Set<Comment> getComments() {
		return this.comments;
	}

	public void setComments(Set<Comment> comments) {
		this.comments = comments;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "student")
	public Set<Sign> getSigns() {
		return this.signs;
	}

	public void setSigns(Set<Sign> signs) {
		this.signs = signs;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "student")
	public Set<Posting> getPostings() {
		return this.postings;
	}

	public void setPostings(Set<Posting> postings) {
		this.postings = postings;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "student")
	public Set<Teachingevaluation> getTeachingevaluations() {
		return this.teachingevaluations;
	}

	public void setTeachingevaluations(
			Set<Teachingevaluation> teachingevaluations) {
		this.teachingevaluations = teachingevaluations;
	}

}