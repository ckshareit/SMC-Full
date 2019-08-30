package com.cognizant.repository;

import org.springframework.data.repository.CrudRepository;

import com.cognizant.entity.Company;


public interface CompanyRepository extends CrudRepository<Company, String> {

	
	
}
