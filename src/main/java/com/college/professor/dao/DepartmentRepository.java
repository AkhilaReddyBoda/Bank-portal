package com.college.professor.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.college.professor.controllers.ProfessorDTO;
import com.college.professor.models.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

	Department save(ProfessorDTO professorDTO);

}
