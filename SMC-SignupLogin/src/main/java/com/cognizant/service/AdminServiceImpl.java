package com.cognizant.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.conversion.ModelToEntityConversion;
import com.cognizant.dao.AdminDAO;
import com.cognizant.entity.User;
import com.cognizant.model.UserModel;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminDAO adminDAO;

	private ModelToEntityConversion conversion = new ModelToEntityConversion();

	public boolean checkLoginService(UserModel userModel) {
		
		User user = conversion.modelToEntityMethod(userModel);
		
		String receivedUserPassword = adminDAO.checkLogin(user);

		if(receivedUserPassword.equals(userModel.getPassword()))
			return true;
		else return false;
		
	}
	
}
