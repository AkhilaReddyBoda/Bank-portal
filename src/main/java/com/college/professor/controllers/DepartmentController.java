package com.college.professor.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.college.professor.models.Department;
import com.college.professor.services.ProfessorService;

@Controller
//@RequestMapping("/department")
public class DepartmentController {
	@Autowired
	public ProfessorService professorService;

	@GetMapping("/add-department")
	public String showaddpage(Model model) {
		model.addAttribute("department", new Department());
		return "department";
	}

	@PostMapping("/add-process")
	public String addDepartment(Department department, Model model) {
		professorService.addDepartment(department);

		model.addAttribute("department", new Department());
		return "success";
	}

	/*
	 * @GetMapping("/alldepartments") public List<Department> findAll() { return
	 * professorService.findAll(); }
	 */
	/*
	 * @GetMapping("/department-list") public String getBooks(Department department,
	 * Model model) {
	 * 
	 * List<Department> departmentList = professorService.findAll();
	 * model.addAttribute("departmentList", departmentList);
	 * 
	 * return "departmentList";
	 * 
	 * }
	 */

}
