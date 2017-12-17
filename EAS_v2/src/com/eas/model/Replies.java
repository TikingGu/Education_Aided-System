package com.eas.model;

import java.sql.Timestamp;
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
 * Replies entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "replies", catalog = "eas24")
public class Replies implements java.io.Serializable {

	// Fields

	private RepliesId id;
	private Posting posting;
	private Timestamp reDate;
	private String reStudent;
	private String content;

	// Constructors

	/** default constructor */
	public Replies() {
	}

	/** full constructor */
	public Replies(RepliesId id, Posting posting, Timestamp reDate,
			String reStudent, String content) {
		this.id = id;
		this.posting = posting;
		this.reDate = reDate;
		this.reStudent = reStudent;
		this.content = content;
	}

	// Property accessors
	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "repliesId", column = @Column(name = "Replies_ID", nullable = false, length = 30)),
			@AttributeOverride(name = "poId", column = @Column(name = "PoID", nullable = false, length = 30)) })
	public RepliesId getId() {
		return this.id;
	}

	public void setId(RepliesId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PoID", nullable = false, insertable = false, updatable = false)
	public Posting getPosting() {
		return this.posting;
	}

	public void setPosting(Posting posting) {
		this.posting = posting;
	}

	@Column(name = "Re_Date", nullable = false, length = 19)
	public Timestamp getReDate() {
		return this.reDate;
	}

	public void setReDate(Timestamp reDate) {
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