package com.example.testthymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.testthymeleaf.model.YourForm;

@Controller
@RequestMapping("/admin")
public class AdminController {

//	http://localhost:8080/admin/
    @GetMapping("/")
    public String adminDashboard(Model model) {
        // Add any necessary data to the model
    	model.addAttribute("yourForm", new YourForm());

        // Return the Thymeleaf template name
        return "admin";
    }
    
    @PostMapping("/processForm")
    public String processForm(@ModelAttribute("yourForm") YourForm yourForm) {
        // Process the form data here

        return "result";
    }
    
}
