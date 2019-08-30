package com.cognizant.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.model.UserModel;
import com.cognizant.validation.LoginValidator;

@RestController
@RequestMapping("/admin")
public class AdminController {

	//@Autowired
	//private AdminService adminService;
		
	@Autowired
	private LoginValidator loginValidator;
	
	@GetMapping("/adminlogin")
	public ResponseEntity<Void> login(@RequestBody UserModel userModel,Errors error,HttpServletRequest request)
	{
		HttpSession session = request.getSession(true);
		session.setAttribute("username", userModel.getUsername());
		ResponseEntity<Void> response = null;
		userModel.setUserType("Admin");
		ValidationUtils.invokeValidator(loginValidator, userModel, error);
		if(error.hasErrors())
		{
			response = new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
		else
			response = new ResponseEntity<Void>(HttpStatus.FOUND);

		return response;
	}
	
	@GetMapping("/adminlogout")
	public ResponseEntity<Void> logout(HttpServletRequest request)
	{
		HttpSession session = request.getSession(false);
		ResponseEntity<Void> response = null;
		session.invalidate();
		if(session.getAttribute("username").equals(null))
		{
			response = new ResponseEntity<Void>(HttpStatus.LOCKED);
		}
		else
			response = new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);

		
		return response;
	}
		 
}
