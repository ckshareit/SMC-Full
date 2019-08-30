package com.cognizant.validation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.cognizant.model.UserModel;
import com.cognizant.service.AdminService;
import com.cognizant.service.UserService;

@Component("LoginValidator")
public class LoginValidator implements Validator{
	
	@Autowired
	private AdminService adminService;
	
	@Autowired
	private UserService userService;
	
	public boolean supports(Class<?> arg0) {
		
		return arg0.equals(UserModel.class);
	}

	public void validate(Object target, Errors errors) {
		UserModel userModel = (UserModel)target;
		
		if(userModel.getUserType().equalsIgnoreCase("Admin"))
		{
			boolean loginResult = adminService.checkLoginService(userModel);
			if(!loginResult)
			{
				errors.rejectValue("username", "com.cognizant.controller.wrongAdminUsername");
			}
		}
		else
		{
			boolean loginResult = userService.checkUserLoginService(userModel);
			if(!loginResult)
			{
				errors.rejectValue("username", "com.cognizant.controller.wrongUsername");
			}			
		}
	}
}
