package com.mrtech.adminportal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

	@GetMapping("/studenthome")
	public String studentHomePage(Model model) {
	    return "studenthome"; // loads studenthome.html
	}
	
    @GetMapping("/student")
    public String studentPage(Model model) {
        model.addAttribute("username", "Admin"); // Optional if you want to show username
        return "student"; // This will render student.html
    }
}