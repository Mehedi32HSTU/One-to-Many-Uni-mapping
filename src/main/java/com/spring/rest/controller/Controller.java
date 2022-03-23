package com.spring.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.rest.exception.ResourceNotFoundException;
import com.spring.rest.model.Employee;
import com.spring.rest.model.TeamLead;
import com.spring.rest.repository.EmployeeRepository;
import com.spring.rest.repository.TeamLeadRepository;

@RestController
@RequestMapping("/onetomanyuni")
public class Controller {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	
	@GetMapping("/employees")
	public List<Employee> getAllEmployee()
	{
		return employeeRepository.findAll();
	}
	
	@GetMapping("/employees/{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable (value = "id") Long employeeId) throws ResourceNotFoundException{
		Employee employee = employeeRepository.findById(employeeId)
				.orElseThrow(()->new ResourceNotFoundException("Employee Not Found ::"+employeeId));
		return ResponseEntity.ok().body(employee);
	}
	
	@PostMapping("/employees")
	public Employee createEmployee(@RequestBody Employee employee)
	{
		return employeeRepository.save(employee);
	}
	
	
//	TeamLeads 
	
	@Autowired
	private TeamLeadRepository teamLeadRepository;
	@GetMapping("/teamleads")
	public List<TeamLead> getAllTeamLead()
	{
		return teamLeadRepository.findAll();
	}
	
	
	
	

}
