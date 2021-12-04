package com.college.professor.controllers;

import java.util.List;

public class ProfessorDTO {

	public String name;

	public String father_name;

	public Long age;

	public String village;

	public String mandal;

	public String district;

	public String state;
	
	public List<String> language_name;
	
	public Long department_Id;
	
	public List<Long> subjectsId;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFather_name() {
		return father_name;
	}

	public void setFather_name(String father_name) {
		this.father_name = father_name;
	}

	public Long getAge() {
		return age;
	}

	public void setAge(Long age) {
		this.age = age;
	}

	public String getVillage() {
		return village;
	}

	public void setVillage(String village) {
		this.village = village;
	}

	public String getMandal() {
		return mandal;
	}

	public void setMandal(String mandal) {
		this.mandal = mandal;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public List<String> getLanguage_name() {
		return language_name;
	}

	public void setLanguage_name(List<String> language_name) {
		this.language_name = language_name;
	}

	public Long getDepartment_Id() {
		return department_Id;
	}

	public void setDepartment_Id(Long department_Id) {
		this.department_Id = department_Id;
	}

	public List<Long> getSubjectsId() {
		return subjectsId;
	}

	public void setSubjectsId(List<Long> subjectsId) {
		this.subjectsId = subjectsId;
	}
	
	
	
}
