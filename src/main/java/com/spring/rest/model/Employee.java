package com.spring.rest.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="employee", uniqueConstraints={@UniqueConstraint(columnNames = "email")})
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Id;
	
	@Column(name="Name")
	private String name;
	
	@Column(name="Email",unique = true)
	private String email;
	
	@Column(name="Dept")
	private String dept;
	
	@OneToMany(cascade= CascadeType.ALL)
	@JoinColumn(name="TeamLeadEmpId", referencedColumnName = "Id")
	List<TeamLead> teamLead = new ArrayList<>();

	public Employee() {
		
	}

	public Employee(String name, String email, String dept) {
		super();
		this.name = name;
		this.email = email;
		this.dept = dept;
	}

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public List<TeamLead> getTeamLead() {
		return teamLead;
	}

	public void setTeamLead(List<TeamLead> teamLead) {
		this.teamLead = teamLead;
	}

	

}
