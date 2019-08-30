package com.cognizant.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cognizant.entity.User;

@Repository
public class UserDAOImpl implements UserDAO{

	@PersistenceContext
	private EntityManager entityManager;

	@Transactional
	public boolean registerUser(User user) {
		entityManager.persist(user);
		return true;
	}
	
	public int getUserId(User user)
	{
		Query query = entityManager.createQuery("from User u where u.username=:username");
		query.setParameter("username",  user.getUsername());
		List<User> userList = query.getResultList();
		return userList.get(0).getId();
	}
		
	public User checkLogin(User user) {
		
		Query query = entityManager.createQuery("from User u where u.username=:username and u.password=:password");
		query.setParameter("username",  user.getUsername());
		query.setParameter("password", user.getPassword());
		List<User> userList = query.getResultList();
		
		User checkedUser = userList.get(0);
		return checkedUser;
	}

	@Transactional
	public boolean confirmEmailStatus(int id) {
		Query query = entityManager.createQuery("from User u where u.id=:id");
		query.setParameter("id", id); 
		List<User> userList = query.getResultList();
		User user = userList.get(0);
		user.setConfirmed(true);
		entityManager.merge(user);
		return true; 	
	}

	@Transactional
	public boolean updateProfile(User user) {
		entityManager.merge(user);
		return true;
	}

}
