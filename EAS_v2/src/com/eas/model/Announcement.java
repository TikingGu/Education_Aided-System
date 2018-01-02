package com.eas.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Announcement entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "announcement", catalog = "eas36")
public class Announcement implements java.io.Serializable {

	// Fields

	private String classid;
	private String title;
	private String content;

	// Constructors

	/** default constructor */
	public Announcement() {
	}

	/** minimal constructor */
	public Announcement(String title) {
		this.title = title;
	}

	/** full constructor */
	public Announcement(String title, String content) {
		this.title = title;
		this.content = content;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "classid", unique = true, nullable = false, length = 30)
	public String getClassid() {
		return this.classid;
	}

	public void setClassid(String classid) {
		this.classid = classid;
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