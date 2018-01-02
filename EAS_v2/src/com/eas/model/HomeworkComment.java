package com.eas.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * HomeworkComment entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "homework_comment", catalog = "eas36")
public class HomeworkComment implements java.io.Serializable {

	// Fields

	private Integer id;
	private String content;
	private Date createdAt;
	private String SId;
	private String TId;
	private String title;

	// Constructors

	/** default constructor */
	public HomeworkComment() {
	}

	/** full constructor */
	public HomeworkComment(String content, Date createdAt, String SId,
			String TId, String title) {
		this.content = content;
		this.createdAt = createdAt;
		this.SId = SId;
		this.TId = TId;
		this.title = title;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "content")
	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Column(name = "created_at", length = 19)
	public Date getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	@Column(name = "S_ID")
	public String getSId() {
		return this.SId;
	}

	public void setSId(String SId) {
		this.SId = SId;
	}

	@Column(name = "T_ID")
	public String getTId() {
		return this.TId;
	}

	public void setTId(String TId) {
		this.TId = TId;
	}

	@Column(name = "title")
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}