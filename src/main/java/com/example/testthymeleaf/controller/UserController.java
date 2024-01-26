package com.example.testthymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
	
//	http://localhost:8080/user/
	@GetMapping("/")
	public String sendUserMessage(Model model) {
		// Return the Thymeleaf template name
		String name = "hello world controller class";
	    model.addAttribute("name", name);
		return "user";
	}

}
