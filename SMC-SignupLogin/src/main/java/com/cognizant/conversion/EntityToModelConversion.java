package com.cognizant.conversion;


import com.cognizant.entity.User;

import com.cognizant.model.UserModel;

public class EntityToModelConversion {

		public UserModel entityToModelMethod(User user)
		{
			UserModel userModel=new UserModel();
			
			userModel.setId(user.getId());
			userModel.setUsername(user.getUsername());
			userModel.setPassword(user.getPassword());
			userModel.setUserType(user.getUserType());
			userModel.setEmail(user.getEmail());
			userModel.setMobileNumber(user.getMobileNumber());
			userModel.setConfirmed(user.getConfirmed());
			
			return userModel;
		}
		
		

}
