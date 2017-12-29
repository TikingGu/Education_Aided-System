package com.eas.newmodel;

import java.util.Date;
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
 * Replies entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "replies", catalog = "eas30")
public class Replies implements java.io.Serializable {

	// Fields

	private Integer repliesId;
	private Posting posting;
	private Date reDate;
	private String reStudent;
	private String content;

	// Constructors

	/** default constructor */
	public Replies() {
	}

	/** full constructor */
	public Replies(Posting posting, Date reDate, String reStudent,
			String content) {
		this.posting = posting;
		this.reDate = reDate;
		this.reStudent = reStudent;
		this.content = content;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "Replies_ID", unique = true, nullable = false)
	public Integer getRepliesId() {
		return this.repliesId;
	}

	public void setRepliesId(Integer repliesId) {
		this.repliesId = repliesId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PoID", nullable = false)
	public Posting getPosting() {
		return this.posting;
	}

	public void setPosting(Posting posting) {
		this.posting = posting;
	}

	@Column(name = "Re_Date", nullable = false, length = 19)
	public Date getReDate() {
		return this.reDate;
	}

	public void setReDate(Date reDate) {
		this.reDate = reDate;
	}

	@Column(name = "Re_Student", nullable = false, length = 30)
	public String getReStudent() {
		return this.reStudent;
	}

	public void setReStudent(String reStudent) {
		this.reStudent = reStudent;
	}

	@Column(name = "Content", nullable = false, length = 200)
	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}