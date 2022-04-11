package com.Walkingtree.mainController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Walkingtree.Entity.Employee;
import com.Walkingtree.Repo.EmployeeRepository;
import com.Walkingtree.Repo.UsersRepo;

@Controller
public class MVCController {

	@Autowired
	EmployeeRepository employeeRepository;
	
	@Autowired
	UsersRepo usersRepo;

	@RequestMapping(value = "/")
	public String home() {
		return "index";
	}

	@RequestMapping(value = "/login")
	public String login(Model m) {
		List<Employee> ad = employeeRepository.findAll();
		m.addAttribute("ad", ad);
		return "login";

	}
}
