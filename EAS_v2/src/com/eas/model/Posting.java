package com.eas.model;

import java.util.Date;
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
 * Posting entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "posting", catalog = "eas")
public class Posting implements java.io.Serializable {

	// Fields

	private Integer poId;
	private Student student;
	private Date poDate;
	private Integer repliesNum;
	private Integer agreeNum;
	private Integer disagreeNum;
	private String content;
	private String title;
	private Set<Replies> replieses = new HashSet<Replies>(0);

	// Constructors

	/** default constructor */
	public Posting() {
	}

	/** minimal constructor */
	public Posting(Student student, Date poDate, String content, String title) {
		this.student = student;
		this.poDate = poDate;
		this.content = content;
		this.title = title;
	}

	/** full constructor */
	public Posting(Student student, Date poDate, Integer repliesNum,
			Integer agreeNum, Integer disagreeNum, String content,
			String title, Set<Replies> replieses) {
		this.student = student;
		this.poDate = poDate;
		this.repliesNum = repliesNum;
		this.agreeNum = agreeNum;
		this.disagreeNum = disagreeNum;
		this.content = content;
		this.title = title;
		this.replieses = replieses;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "Po_ID", unique = true, nullable = false)
	public Integer getPoId() {
		return this.poId;
	}

	public void setPoId(Integer poId) {
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
	public Date getPoDate() {
		return this.poDate;
	}

	public void setPoDate(Date poDate) {
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

	@Column(name = "Title", nullable = false, length = 50)
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "posting")
	public Set<Replies> getReplieses() {
		return this.replieses;
	}

	public void setReplieses(Set<Replies> replieses) {
		this.replieses = replieses;
	}

}