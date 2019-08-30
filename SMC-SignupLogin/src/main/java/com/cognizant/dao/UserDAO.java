package com.cognizant.dao;

import com.cognizant.entity.User;

public interface UserDAO {

	User checkLogin(User user);

	boolean registerUser(User user);
	
	public int getUserId(User user);

	boolean confirmEmailStatus(int id);

	boolean updateProfile(User user);

}
