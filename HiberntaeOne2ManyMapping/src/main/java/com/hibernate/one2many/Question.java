package com.hibernate.one2many;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
	@Entity
	public class Question {
		@Id
	    @GeneratedValue(strategy=GenerationType.IDENTITY)
		private int qid;
		private String qname;
		
		@OneToMany(mappedBy="que")
		private List<Answer> an;

		public Question() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Question(int qid, String qname, List<Answer> an) {
			super();
			this.qid = qid;
			this.qname = qname;
			this.an = an;
		}

		public int getQid() {
			return qid;
		}

		public void setQid(int qid) {
			this.qid = qid;
		}

		public String getQname() {
			return qname;
		}

		public void setQname(String qname) {
			this.qname = qname;
		}

		public List<Answer> getAn() {
			return an;
		}

		public void setAn(List<Answer> an) {
			this.an = an;
		}
	}