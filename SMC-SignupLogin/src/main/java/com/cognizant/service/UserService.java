package com.cognizant.service;

import com.cognizant.model.UserModel;

public interface UserService {

	boolean checkUserLoginService(UserModel userModel);

	boolean registerService(UserModel userModel);

	String sendEmailService(int id, UserModel userModel, String link);

	boolean confirmingEmailService(int id);

	boolean updateProfileService(UserModel userModel);

}
