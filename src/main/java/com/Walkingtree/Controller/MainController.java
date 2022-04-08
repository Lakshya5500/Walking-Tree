package com.Walkingtree.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Walkingtree.Entity.Employee;
import com.Walkingtree.Repo.EmployeeRepository;

@RestController
public class MainController {

	@Autowired
	EmployeeRepository employeeRepository;
	
	
	@GetMapping("/")
	public String home() {
		return "Welcome to WalkingTree Technologies, Agra";
	}
	@GetMapping("/employees")
	public List<Employee> EmpDetails() {
		return employeeRepository.findAll();
	}
	@PostMapping("/employee")
	public Employee SaveEmployee(@RequestBody Employee emp) {
		return employeeRepository.save(emp);
	}
	
	
}
