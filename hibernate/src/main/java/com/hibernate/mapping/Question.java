package com.hibernate.mapping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class Question {
	
	@Id
	@Column(name = "Q_ID")
	private int id;
	
	@Column(name = "QUE")
	private String Que;
	
	@OneToOne
	private Answer answer;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getQue() {
		return Que;
	}

	public void setQue(String que) {
		Que = que;
	}

	public Answer getAnswer() {
		return answer;
	}

	public void setAnswer(Answer answer) {
		this.answer = answer;
	}

	public Question(int id, String que, Answer answer) {
		super();
		this.id = id;
		Que = que;
		this.answer = answer;
	}

	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
