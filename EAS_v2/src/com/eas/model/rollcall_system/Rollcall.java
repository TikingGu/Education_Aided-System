package com.eas.model.rollcall_system;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name="lsy_rollcall")
public class Rollcall {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int id;

   @Column(name="T_ID")
   private String tId;

   @Column(name="C_IDS")
   private String cIds;

   @Column(name="expired_at")
   private Date expiredAt;

   @Column(name="code")
   private String code;

   @Column(name="created_at")
   @CreationTimestamp
   private Date createdAt;

   public int getId() {
      return this.id;
   }

   public String getTId() {
      return this.tId;
   }

   public String getCIds() {
      return this.cIds;
   }

   public Date getExpiredAt() {
      return this.expiredAt;
   }

   public String getCode() {
      return this.code;
   }

   public Date getCreatedAt() {
      return this.createdAt;
   }

   public void setTId(String val) {
      this.tId = val;
   }

   public void setCIds(String val) {
      this.cIds = val;
   }

   public void setExpiredAt(Date val) {
      this.expiredAt = val;
   }

   public void setCode(String val) {
      this.code = val;
   }
}
