package com.spring.rest.model;

import javax.persistence.*;

@Entity
@Table(name="teamlead", uniqueConstraints={@UniqueConstraint(columnNames = "teamName")})
public class TeamLead {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Id;
	@Column(name="TeamName", unique = true)
	private String teamName;
	
	public TeamLead() {
		
	}
	public TeamLead(String teamName) {
		this.teamName = teamName;
	}
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	
	

}
