package com.hibernate.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Edeg {
	@Id
	private String program_leader;
	private String team_leader;
	private String software_engg;
	private String junior_engg;

	@ManyToMany
	private Emp ep;

	public Edeg(String program_leader, String team_leader, String software_engg, String junior_engg, Emp ep) {
		super();
		this.program_leader = program_leader;
		this.team_leader = team_leader;
		this.software_engg = software_engg;
		this.junior_engg = junior_engg;
		this.ep = ep;
	}

	public Edeg() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getProgram_leader() {
		return program_leader;
	}

	public void setProgram_leader(String program_leader) {
		this.program_leader = program_leader;
	}

	public String getTeam_leader() {
		return team_leader;
	}

	public void setTeam_leader(String team_leader) {
		this.team_leader = team_leader;
	}

	public String getSoftware_engg() {
		return software_engg;
	}

	public void setSoftware_engg(String software_engg) {
		this.software_engg = software_engg;
	}

	public String getJunior_engg() {
		return junior_engg;
	}

	public void setJunior_engg(String junior_engg) {
		this.junior_engg = junior_engg;
	}

	public Emp getEp() {
		return ep;
	}

	public void setEp(Emp ep) {
		this.ep = ep;
	}
}