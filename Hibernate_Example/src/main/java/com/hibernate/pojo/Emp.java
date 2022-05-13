package com.hibernate.pojo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Emp {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int eid;
	private String ename;
	private long esal;
	private String ecity;
	private String edeg;
	@ManyToMany(mappedBy = "ed")
	private List<Edeg> des;

	public Emp(int eid, String ename, long esal, String ecity, String edeg, List<Edeg> des) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
		this.ecity = ecity;
		this.edeg = edeg;
		this.des = des;
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public long getEsal() {
		return esal;
	}

	public void setEsal(long esal) {
		this.esal = esal;
	}

	public String getEcity() {
		return ecity;
	}

	public void setEcity(String ecity) {
		this.ecity = ecity;
	}

	public String getEdeg() {
		return edeg;
	}

	public void setEdeg(String edeg) {
		this.edeg = edeg;
	}

	public List<Edeg> getDes() {
		return des;
	}

	public void setDes(List<Edeg> des) {
		this.des = des;
	}
}