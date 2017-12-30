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
 * Announcement entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "announcement", catalog = "eas")
public class Announcement implements java.io.Serializable {

	// Fields

	private Integer anId;
	private Classinfo classinfo;
	private String title;
	private String content;

	// Constructors

	/** default constructor */
	public Announcement() {
	}

	/** minimal constructor */
	public Announcement(Classinfo classinfo, String title) {
		this.classinfo = classinfo;
		this.title = title;
	}

	/** full constructor */
	public Announcement(Classinfo classinfo, String title, String content) {
		this.classinfo = classinfo;
		this.title = title;
		this.content = content;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "An_ID", unique = true, nullable = false)
	public Integer getAnId() {
		return this.anId;
	}

	public void setAnId(Integer anId) {
		this.anId = anId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "classid", nullable = false)
	public Classinfo getClassinfo() {
		return this.classinfo;
	}

	public void setClassinfo(Classinfo classinfo) {
		this.classinfo = classinfo;
	}

	@Column(name = "Title", nullable = false, length = 50)
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Column(name = "Content", length = 300)
	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}