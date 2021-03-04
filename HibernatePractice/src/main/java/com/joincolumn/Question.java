package com.joincolumn;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Question {
	@Id
	@Column(name="question_id")
	private int questionId;
	private String question;
	
	@OneToOne
	@JoinColumn(name="a_id")
	private Answer answer;
	
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param questionId
	 * @param question
	 * @param answerId
	 */
	public Question(int questionId, String question, Answer answer) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.answer = answer;
	}

	/**
	 * @return the questionId
	 */
	public int getQuestionId() {
		return questionId;
	}

	/**
	 * @param questionId the questionId to set
	 */
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	/**
	 * @return the question
	 */
	public String getQuestion() {
		return question;
	}

	/**
	 * @param question the question to set
	 */
	public void setQuestion(String question) {
		this.question = question;
	}

	/**
	 * @return the answerId
	 */
	public Answer getAnswerId() {
		return answer;
	}

	/**
	 * @param answerId the answerId to set
	 */
	public void setAnswerId(Answer answer) {
		this.answer = answer;
	}

	@Override
	public String toString() {
		return "Question [questionId=" + questionId + ", question=" + question + ", answerId=" + answer + "]";
	}
	
	
	

}
