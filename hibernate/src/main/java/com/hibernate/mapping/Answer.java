package com.hibernate.mapping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Answer {
	@Id
	@Column(name = "Ans_id")
	private int aid;
	
	@Column(name = "Answer")
	private String ans;

	@Column(name = "q_id")
	@OneToOne
	private Question q;
	
	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getAns() {
		return ans;
	}

	
	public Question getQ() {
		return q;
	}

	public void setQ(Question q) {
		this.q = q;
	}

	public void setAns(String ans) {
		this.ans = ans;
	}
	
	

	public Answer(int aid, String ans) {
		super();
		this.aid = aid;
		this.ans = ans;
		this.q = q;
	}

	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
