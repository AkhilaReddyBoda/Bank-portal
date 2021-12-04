package com.college.professor.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.college.professor.models.Subject;

public interface SubjectRepository extends JpaRepository<Subject, Long>{

}
