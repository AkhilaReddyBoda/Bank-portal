package com.college.professor.models;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "subject")
public class Subject {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long subject_id;
	
	public String subject_name;
	
	@JsonIgnore
	@ManyToMany(mappedBy = "subjects")
	public Set<Professor> users = new HashSet<Professor>();

	public Subject() {
		super();
	}

	public Long getSubject_id() {
		return subject_id;
	}

	public void setSubject_id(Long subject_id) {
		this.subject_id = subject_id;
	}

	public String getSubject_name() {
		return subject_name;
	}

	public void setSubject_name(String subject_name) {
		this.subject_name = subject_name;
	}

	public Set<Professor> getUsers() {
		return users;
	}

	public void setUsers(Set<Professor> users) {
		this.users = users;
	}
	
	
	
	
}
