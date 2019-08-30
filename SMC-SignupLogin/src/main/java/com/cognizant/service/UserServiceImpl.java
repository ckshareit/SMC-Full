package com.cognizant.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.cognizant.conversion.ModelToEntityConversion;
import com.cognizant.dao.UserDAO;
import com.cognizant.entity.User;
import com.cognizant.model.UserModel;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDAO userDAO;
	
	private ModelToEntityConversion conversion = new ModelToEntityConversion();
	
	@Autowired
	private JavaMailSender javaMailSender;
	
	public boolean registerService(UserModel userModel) {
		
		userModel.setConfirmed(false);
		userModel.setUserType("user");
		
		User user = conversion.modelToEntityMethod(userModel);
		
		boolean registerResult = userDAO.registerUser(user);
		if(registerResult)
		{
			int userGeneratedId = userDAO.getUserId(user);
			//String encryptedText = getEncryptedText();
			String link = getLink(userGeneratedId);
			String emailSent = sendEmailService(userGeneratedId, userModel, link);
			System.out.println(emailSent);
			return true;
		}
		else {
			System.out.println("email not sent");
			return false;
		}
	}

	/*
	 * private String getEncryptedText() { Random random = new Random(); long
	 * randomLong = random.nextLong(); return Long.toString(randomLong); }
	 * 
	 */	
	private String getLink(int userGeneratedId) 
	{
		String url = "http://localhost:8089/user/" + userGeneratedId;
		return url;
	}

	public boolean checkUserLoginService(UserModel userModel) {
		User user = conversion.modelToEntityMethod(userModel);
		
		User checkedUser = userDAO.checkLogin(user);
		if(checkedUser.getConfirmed())
			return true;
		else return false;
	}

	public String sendEmailService(int id,UserModel userModel,String link) 
	{
		SimpleMailMessage mailMessage = new SimpleMailMessage();
		mailMessage.setTo(userModel.getEmail());
		mailMessage.setSubject("Confirm Email ID");
		mailMessage.setText("Hello "+userModel.getUsername()+", \n"+
				"Your "+userModel.getUserType().toUpperCase()+" ID : "+id+"\n"
				+"Password : "+userModel.getPassword()+"\n"
				+"Click Here to confirm your Email Id"+"\n"+link);
		javaMailSender.send(mailMessage);
		return "Success";
	}

	public boolean confirmingEmailService(int id) {
		return userDAO.confirmEmailStatus(id);
	}

	public boolean updateProfileService(UserModel userModel) {
		User user = conversion.modelToEntityMethod(userModel);
		
		return userDAO.updateProfile(user);
	}

}
