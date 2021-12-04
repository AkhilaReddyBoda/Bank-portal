package com.college.professor.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.college.professor.models.Subject;
import com.college.professor.services.ProfessorService;

@Controller

public class SubjectController {

	@Autowired
	public ProfessorService professorService;
	

	@GetMapping("/add-subject")
	public String showaddpage(Model model) {
		model.addAttribute("subject", new Subject());
		return "subject";
	}

	@PostMapping("/add-process1")
	public String addDepartment(Subject subject, Model model) {
		professorService.addSubject(subject);

		model.addAttribute("subject", new Subject());
		return "success";
	}
}
