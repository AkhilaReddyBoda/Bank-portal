package com.college.professor.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.college.professor.models.Professor;

public interface ProfessorRepository extends JpaRepository<Professor, Long>{

}
