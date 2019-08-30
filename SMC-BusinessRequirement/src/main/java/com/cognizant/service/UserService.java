package com.cognizant.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.entity.Company;
import com.cognizant.repository.CompanyRepository;

@Service
public class UserService {

	@Autowired
	private CompanyRepository companyRepository;
	
	public Company getCompany(String id) {
		
		return companyRepository.findOne(id);
	}

	
}
