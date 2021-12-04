package com.college.professor.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.college.professor.models.Address;

public interface AddressRepository extends JpaRepository<Address, Long>{

}
