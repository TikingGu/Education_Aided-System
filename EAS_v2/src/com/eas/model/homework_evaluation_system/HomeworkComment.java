package com.eas.model.homework_evaluation_system;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name="homework_comment")
public class HomeworkComment {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int id;

   @Column(name="T_ID")
   private String tId;

   @Column(name="S_ID")
   private String sId;

   @Column(name="title")
   private String title;

   @Column(name="content")
   private String content;

   @Column(name="created_at")
   @CreationTimestamp
   private Date createdAt;

	public String gettId() {
		return tId;
	}
	
	public void settId(String tId) {
		this.tId = tId;
	}
	
	public String getsId() {
		return sId;
	}
	
	public void setsId(String sId) {
		this.sId = sId;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getContent() {
		return content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	public Date getCreatedAt() {
		return createdAt;
	}	

}
