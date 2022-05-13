package com.hibernate.many2many.join;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.*;
 
@Entity
@Table(name="employee2")
public class Employee2{
 
	@Id	
	private int eid;
	private String ename;
		
	@ManyToMany(cascade = { CascadeType.ALL})
	@JoinTable(name = "employee2_project2",joinColumns = { 
    @JoinColumn(name = "eid") },inverseJoinColumns = { 
    @JoinColumn(name = "pid")})
	private List<Project2> proj;

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

	public List<Project2> getProj() {
		return proj;
	}

	public void setProj(List<Project2> proj) {
		this.proj = proj;
	}
	

}