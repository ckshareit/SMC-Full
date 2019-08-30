package com.cognizant.conversion;

import com.cognizant.entity.User;

import java.util.ArrayList;
import java.util.List;
import java.util.List;

import com.cognizant.entity.Company;

import com.cognizant.model.UserModel;
import com.cognizant.model.CompanyModel;


public class ModelToEntityConversion {

	public User modelToEntityMethod(UserModel userModel)
	{
		User user=new User();
		
		user.setId(userModel.getId());
		user.setUsername(userModel.getUsername());
		user.setPassword(userModel.getPassword());
		user.setUserType(userModel.getUserType());
		user.setEmail(userModel.getEmail());
		user.setMobileNumber(userModel.getMobileNumber());
		user.setConfirmed(userModel.getConfirmed());
		
		return user;
	}

	
	
	

	
	
	
}
