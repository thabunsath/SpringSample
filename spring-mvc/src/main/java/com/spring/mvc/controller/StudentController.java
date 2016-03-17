package com.spring.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.mvc.service.TextService;

@Controller
public class StudentController {
	@Autowired
	TextService textService;
	
	@RequestMapping("/student")
	public void getStudentView(Model model) {
		
		String studentName = textService.generateText();
		
		model.addAttribute("studentName", studentName);
		
		//return "student";
	}

}
