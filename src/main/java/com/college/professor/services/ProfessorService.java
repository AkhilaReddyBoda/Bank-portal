package com.college.professor.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.college.professor.controllers.ProfessorDTO;
import com.college.professor.dao.AddressRepository;
import com.college.professor.dao.DepartmentRepository;
import com.college.professor.dao.LanguagesRepository;
import com.college.professor.dao.ProfessorRepository;
import com.college.professor.dao.SubjectRepository;
import com.college.professor.models.Address;
import com.college.professor.models.Department;
import com.college.professor.models.Languages;
import com.college.professor.models.Professor;
import com.college.professor.models.Subject;

@Service
public class ProfessorService {

	@Autowired
	private ProfessorRepository professorRepo;

	@Autowired
	private AddressRepository addressRepository;

	@Autowired
	private LanguagesRepository languagesRepository;

	@Autowired
	public DepartmentRepository departmentRepository;

	@Autowired
	private SubjectRepository subjectRepository;

	public Object addProfesssor(ProfessorDTO professorDTO) {

		Professor professor = professorRepo
				.save(new Professor(professorDTO.getName(), professorDTO.getFather_name(), professorDTO.getAge()));
		Address address = addressRepository.save(new Address(professorDTO.getVillage(), professorDTO.getMandal(),
				professorDTO.getDistrict(), professorDTO.getState(), professor));
		professor.setAddress(address);
		Optional<Department> department = departmentRepository.findById(professorDTO.getDepartment_Id());
		if (department.isPresent()) {
			professor.setDepartment(department.get());
		} else {
			return "success";
		}

		
		  for (String language : professorDTO.getLanguage_name()) {
		  languagesRepository.save(new Languages(language, professor)); }
		 

		for (Long subjectId : professorDTO.getSubjectsId()) {
			Optional<Subject> subject = subjectRepository.findById(subjectId);
			if (subject.isPresent()) {
				professor.getSubjects().add(subject.get()); // professor.getSubjects().remove
			} else {
				return "Subject details not found";
			}
		}

		professorRepo.save(professor);

		return "success";

	}

	/*
	 * public Professor addProfesssor(Professor professor) { // TODO Auto-generated
	 * method stub return professorRepo.save(professor);
	 * 
	 * }
	 */

	/*
	 * public List<Professor> findAll() {
	 * 
	 * return professorRepo.findAll(); }
	 */

	public Object getProfessor(Long id) {

		Optional<Professor> professor_details = professorRepo.findById(id);
		if (professor_details.isPresent()) {
			return professor_details.get();
		} else {
			return "Professor not found";
		}

		// return professorRepo.findById(id);
	}

	public Department addDepartment(Department department) {
		// TODO Auto-generated method stub
		return departmentRepository.save(department);
	}

	public List<Department> findAll() {

		return departmentRepository.findAll();
	}

	public Subject addSubject(Subject subject) {
		// TODO Auto-generated method stub
		return subjectRepository.save(subject);

	}

	public List<Subject> listAll() {

		return subjectRepository.findAll();
	}

}
