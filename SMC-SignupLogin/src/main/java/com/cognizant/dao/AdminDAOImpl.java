package com.cognizant.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.cognizant.entity.User;

@Repository
public class AdminDAOImpl implements AdminDAO {

	@PersistenceContext
	private EntityManager entityManager;

	public String checkLogin(User user) {
		
		Query query = entityManager.createQuery("from User u where u.username=:username and u.password=:password");
		query.setParameter("username",  user.getUsername());
		query.setParameter("password", user.getPassword());
		List<User> userList = query.getResultList();
		
		String existingUserPassword = userList.get(0).getPassword();
		return existingUserPassword;
	}
	
}
