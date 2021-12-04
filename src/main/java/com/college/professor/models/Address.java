package com.college.professor.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
@Table(name = "address")
public class Address {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public Long id;
	
	public String village;
	
	public String mandal;
	
	public String district;
	
	public String state;


	@JsonIgnore
    @OneToOne(mappedBy = "address")
    private Professor user;
    
	public Address() {
		super();
	}
	
	public Long getId() {
		return id;
	}
	public Address(String village, String mandal, String district, String state, Professor user) {
		super();
		this.village = village;
		this.mandal = mandal;
		this.district = district;
		this.state = state;
		this.user = user;
	}

	public void setId(Long id) {
		this.id = id;
	}
	public Professor getUser() {
		return user;
	}
	public void setUser(Professor user) {
		this.user = user;
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
    
    
}
