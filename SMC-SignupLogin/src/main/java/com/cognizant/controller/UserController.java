package com.cognizant.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.model.UserModel;
import com.cognizant.service.UserService;
import com.cognizant.validation.LoginValidator;
import com.cognizant.validation.RegistrationValidator;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@Autowired
	private RegistrationValidator registrationValidator;

	@Autowired
	private LoginValidator loginValidator;
	
	@Autowired
	public JavaMailSender javaMailSender; 
	
	@PostMapping("/register") 
	public ResponseEntity<String> register(@RequestBody UserModel userModel,Errors error)
	{
		ResponseEntity<String> response = null;
		ValidationUtils.invokeValidator(registrationValidator, userModel, error);
		if(error.hasErrors())
		{
			response = new ResponseEntity<String>("Registration Failed",HttpStatus.NOT_ACCEPTABLE);
		}
		else
			response = new ResponseEntity<String>("Registration Successfull",HttpStatus.ACCEPTED);
		
		return response;
	}
	
	@GetMapping("/userlogin")
	public ResponseEntity<Void> login(@RequestBody UserModel userModel,Errors error,HttpServletRequest request)
	{
		HttpSession session = request.getSession(true);
		session.setAttribute("username", userModel.getUsername());
		ResponseEntity<Void> response = null;
		userModel.setUserType("User");
		ValidationUtils.invokeValidator(loginValidator, userModel, error);
		if(error.hasErrors())
		{
			response = new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
		else
			response = new ResponseEntity<Void>(HttpStatus.FOUND);
		
		return response;
	}
	
	@GetMapping("/userlogout")
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
//		System.out.println("%%%%%%%%%%%%%%%%%%%"+session.getAttribute("username"));
		
		return response;
	}

	@PutMapping("/confirmemail/{id}")
	public ResponseEntity<String> confirmEmail(@PathVariable int id)
	{
		boolean emailResponse = userService.confirmingEmailService(id);
		ResponseEntity<String> response = null;
		if(emailResponse)
		{
			response = new ResponseEntity<String>("Success",HttpStatus.ACCEPTED);
		}
		else
			response = new ResponseEntity<String>("Not Success",HttpStatus.NOT_MODIFIED);
		
		return response;
	}
	
	@PutMapping("/updateuser")
	public ResponseEntity<String> updateUserProfile(@RequestBody UserModel userModel)
	{
		boolean updateProfile = userService.updateProfileService(userModel);
		ResponseEntity<String> response = null;
		if(updateProfile)
		{
			response = new ResponseEntity<String>("Updation Complete",HttpStatus.ACCEPTED);
		}
		else
			response = new ResponseEntity<String>("Updation Failed",HttpStatus.NOT_MODIFIED);
		
		return response;
	}	
	
}
