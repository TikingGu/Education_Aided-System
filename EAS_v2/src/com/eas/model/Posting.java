package com.eas.model;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Posting entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "posting", catalog = "eas24")
public class Posting implements java.io.Serializable {

	// Fields

	private String poId;
	private Student student;
	private Timestamp poDate;
	private Integer repliesNum;
	private Integer agreeNum;
	private Integer disagreeNum;
	private String content;
	private Set<Replies> replieses = new HashSet<Replies>(0);

	// Constructors

	/** default constructor */
	public Posting() {
	}

	/** minimal constructor */
	public Posting(String poId, Student student, Timestamp poDate,
			String content) {
		this.poId = poId;
		this.student = student;
		this.poDate = poDate;
		this.content = content;
	}

	/** full constructor */
	public Posting(String poId, Student student, Timestamp poDate,
			Integer repliesNum, Integer agreeNum, Integer disagreeNum,
			String content, Set<Replies> replieses) {
		this.poId = poId;
		this.student = student;
		this.poDate = poDate;
		this.repliesNum = repliesNum;
		this.agreeNum = agreeNum;
		this.disagreeNum = disagreeNum;
		this.content = content;
		this.replieses = replieses;
	}

	// Property accessors
	@Id
	@Column(name = "Po_ID", unique = true, nullable = false, length = 30)
	public String getPoId() {
		return this.poId;
	}

	public void setPoId(String poId) {
		this.poId = poId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Po_Student", nullable = false)
	public Student getStudent() {
		return this.student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Column(name = "Po_Date", nullable = false, length = 19)
	public Timestamp getPoDate() {
		return this.poDate;
	}

	public void setPoDate(Timestamp poDate) {
		this.poDate = poDate;
	}

	@Column(name = "Replies_Num")
	public Integer getRepliesNum() {
		return this.repliesNum;
	}

	public void setRepliesNum(Integer repliesNum) {
		this.repliesNum = repliesNum;
	}

	@Column(name = "Agree_Num")
	public Integer getAgreeNum() {
		return this.agreeNum;
	}

	public void setAgreeNum(Integer agreeNum) {
		this.agreeNum = agreeNum;
	}

	@Column(name = "Disagree_Num")
	public Integer getDisagreeNum() {
		return this.disagreeNum;
	}

	public void setDisagreeNum(Integer disagreeNum) {
		this.disagreeNum = disagreeNum;
	}

	@Column(name = "Content", nullable = false, length = 500)
	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "posting")
	public Set<Replies> getReplieses() {
		return this.replieses;
	}

	public void setReplieses(Set<Replies> replieses) {
		this.replieses = replieses;
	}

}