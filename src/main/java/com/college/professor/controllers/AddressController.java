package com.college.professor.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.college.professor.models.Address;
//import com.college.professor.models.Department;
import com.college.professor.services.ProfessorService;

@RestController
@RequestMapping("/address")
public class AddressController {

	@Autowired
	public ProfessorService professorService ;
	
	/*
	 * @PostMapping("/addaddress") public Address addAddress(@RequestBody Address
	 * address) { return professorService.addAddress(address); }
	 */
}
