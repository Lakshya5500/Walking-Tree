package com.Walkingtree.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Walkingtree.Entity.Employee;
import com.Walkingtree.Entity.Users;
import com.Walkingtree.Repo.EmployeeRepository;
import com.Walkingtree.Repo.UsersRepo;

@RestController
public class MainController {

	@Autowired
	EmployeeRepository employeeRepository;
	
	@Autowired
	UsersRepo usersRepo;
	
	
	@GetMapping("/employees")
	public List<Employee> EmpDetails() {
		return employeeRepository.findAll();
	}
	@PostMapping("/employee")
	public Employee SaveEmployee(@RequestBody Employee emp) {
		return employeeRepository.save(emp);
	}
	
	
	@PostMapping("/us")
	public Users saveUsers(@RequestBody Users us) {
		return usersRepo.save(us);
	}
	
}
