package com.hibernate.one2many;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
	public class Answer {
		@Id
		private int aid;
		private String solution;
		
		@ManyToOne
		private Question que;	

	public Answer(int aid, String solution, Question que) {
			super();
			this.aid = aid;
			this.solution = solution;
			this.que = que;
		}
		public Answer() {
			// TODO Auto-generated constructor stub
		}

		public int getAid() {
			return aid;
		}

		public void setAid(int aid) {
			this.aid = aid;
		}

		public String getSolution() {
			return solution;
		}

		public void setSolution(String solution) {
			this.solution = solution;
		}

		public Question getQue() {
			return que;
		}

		public void setQue(Question que) {
			this.que = que;
		}		
}