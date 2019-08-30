package com.cognizant.validation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.cognizant.model.UserModel;
import com.cognizant.service.UserService;
@Component("RegistrationValidator")
public class RegistrationValidator implements Validator {

	@Autowired
	private UserService userService;
	
	public boolean supports(Class<?> arg) {
		return arg.equals(UserModel.class);
	}

	public void validate(Object target, Errors errors) {
		UserModel userModel = (UserModel)target;
		
		boolean registrationResult = userService.registerService(userModel);
		if(!registrationResult)
		{
			errors.rejectValue("username", "com.cognizant.controller.registrationError");
		}
		
	}

}
