package com.spring.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.spring.rest.model.Employee;
import com.spring.rest.model.TeamLead;
import com.spring.rest.repository.EmployeeRepository;

@SpringBootApplication
//public class OneToManyUniApplication implements CommandLineRunner {
public class OneToManyUniApplication {

	public static void main(String[] args) {
		SpringApplication.run(OneToManyUniApplication.class, args);
	}
	
	
//	@Autowired
//	private EmployeeRepository employeeRepository;
//	
//	@Override
//	public void run(String... args) throws Exception {
//		Employee employee1= new Employee("Mehedi","mehedi@nsl.com", "Software");
//		Employee employee2= new Employee("Bappy","bappy@nsl.com", "Software");
//		
//		TeamLead teamLead1 = new TeamLead("Analog");
//		TeamLead teamLead2 = new TeamLead("PnR");
//		TeamLead teamLead3 = new TeamLead("Varification");
//		TeamLead teamLead4 = new TeamLead("GF");
//		TeamLead teamLead5 = new TeamLead("Software");
//		
//		employee1.getTeamLead().add(teamLead2);
//		employee1.getTeamLead().add(teamLead4);
//		employee1.getTeamLead().add(teamLead5);
//		employee2.getTeamLead().add(teamLead1);
//		employee2.getTeamLead().add(teamLead3);
//		
//		employeeRepository.save(employee1);
//		employeeRepository.save(employee2);
//
//	}

	
}
