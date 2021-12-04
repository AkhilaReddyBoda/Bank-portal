package com.college.professor.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.college.professor.models.Department;
import com.college.professor.models.Subject;
import com.college.professor.services.ProfessorService;

@Controller
//@RequestMapping("/professor")
public class ProfessorController {
	@Autowired
	public ProfessorService professorService;
 
	@GetMapping
	public String homePage() {
		return "home";
	}

	@GetMapping("/add-professor")
	public String showaddpage(Model model,ProfessorDTO professorDTO) {
		model.addAttribute("professorDTO", new ProfessorDTO());
		List<Department> departmentList = professorService.findAll();
		model.addAttribute("departmentList", departmentList);
		List<Subject> list=professorService.listAll();
		model.addAttribute("list", list);
		
		return "add-professor";
	}

	@PostMapping("/process")
	public String add(ProfessorDTO professorDTO, Model model) {

		professorService.addProfesssor(professorDTO);
		//model.addAttribute("professorDTO", new ProfessorDTO());
		return "success";
	}
	
}