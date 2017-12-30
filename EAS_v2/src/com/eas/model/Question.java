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
 * Question entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "question", catalog = "eas")
public class Question implements java.io.Serializable {

	// Fields

	private Integer questionId;
	private Test test;
	private String questionTitle;
	private String answer;
	private String option1;
	private String option2;
	private String option3;
	private String option4;
	private float point;

	// Constructors

	/** default constructor */
	public Question() {
	}

	/** minimal constructor */
	public Question(Test test, String questionTitle, String answer, float point) {
		this.test = test;
		this.questionTitle = questionTitle;
		this.answer = answer;
		this.point = point;
	}

	/** full constructor */
	public Question(Test test, String questionTitle, String answer,
			String option1, String option2, String option3, String option4,
			float point) {
		this.test = test;
		this.questionTitle = questionTitle;
		this.answer = answer;
		this.option1 = option1;
		this.option2 = option2;
		this.option3 = option3;
		this.option4 = option4;
		this.point = point;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "QuestionID", unique = true, nullable = false)
	public Integer getQuestionId() {
		return this.questionId;
	}

	public void setQuestionId(Integer questionId) {
		this.questionId = questionId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "testid", nullable = false)
	public Test getTest() {
		return this.test;
	}

	public void setTest(Test test) {
		this.test = test;
	}

	@Column(name = "QuestionTitle", nullable = false, length = 100)
	public String getQuestionTitle() {
		return this.questionTitle;
	}

	public void setQuestionTitle(String questionTitle) {
		this.questionTitle = questionTitle;
	}

	@Column(name = "Answer", nullable = false, length = 1)
	public String getAnswer() {
		return this.answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	@Column(name = "Option1", length = 30)
	public String getOption1() {
		return this.option1;
	}

	public void setOption1(String option1) {
		this.option1 = option1;
	}

	@Column(name = "Option2", length = 30)
	public String getOption2() {
		return this.option2;
	}

	public void setOption2(String option2) {
		this.option2 = option2;
	}

	@Column(name = "Option3", length = 30)
	public String getOption3() {
		return this.option3;
	}

	public void setOption3(String option3) {
		this.option3 = option3;
	}

	@Column(name = "Option4", length = 30)
	public String getOption4() {
		return this.option4;
	}

	public void setOption4(String option4) {
		this.option4 = option4;
	}

	@Column(name = "Point", nullable = false, precision = 12, scale = 0)
	public float getPoint() {
		return this.point;
	}

	public void setPoint(float point) {
		this.point = point;
	}

}