package com.Walkingtree.mainController;



import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

 
import com.Walkingtree.Entity.Users;
import com.Walkingtree.Repo.EmployeeRepository;
import com.Walkingtree.Repo.UsersRepo;

@Controller
public class MVCController {

	@Autowired
	EmployeeRepository employeeRepository;
	
//	@Autowired
//	UsersRepo usersRepo;

	@RequestMapping(value = "/")
	public String home() {
		return "index";
	}

//	@RequestMapping(value = "/login")
//	public String login(Model m, HttpServletRequest req) {
//
//		String user = req.getParameter("user");
//		String pass = req.getParameter("pass");
//		
//		Users u = usersRepo.getUser( user, pass);
//		HttpSession session = req.getSession();
//		if (u != null) {
//				session.setAttribute("id", u.getId());
//		} else {
//
//			m.addAttribute("e","user not found");
//		}
//		return"redirect:/index";
//
//	}
}
