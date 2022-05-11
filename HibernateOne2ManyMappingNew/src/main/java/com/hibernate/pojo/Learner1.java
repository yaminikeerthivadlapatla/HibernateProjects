package com.hibernate.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Learner1 {
	@Id
	private int lid;
	private String lname;
	private String lcourse;
	@ManyToOne
	private Trainer1 trn;
	public Learner1(int lid, String lname, String lcourse, Trainer1 trn) {
		super();
		this.lid = lid;
		this.lname = lname;
		this.lcourse = lcourse;
		this.trn = trn;
	}
	public Learner1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getLcourse() {
		return lcourse;
	}
	public void setLcourse(String lcourse) {
		this.lcourse = lcourse;
	}
	public Trainer1 getTrn() {
		return trn;
	}
	public void setTrn(Trainer1 trn) {
		this.trn = trn;
	}
	
}
