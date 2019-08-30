package com.cognizant.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cognizant.entity.Company;


import com.cognizant.service.UserService;

@RestController
@RequestMapping("/userBR")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	
	@GetMapping("/company/{id}")
	public Company getCompany(@PathVariable String id) {
		return userService.getCompany(id);
	}

}
