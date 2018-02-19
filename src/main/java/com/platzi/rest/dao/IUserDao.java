package com.platzi.rest.dao;

import java.util.List;

import com.platzi.rest.model.User;

public interface IUserDao {
	
	void createUser(User user);
	
	List<User> readAllUsers();
	
	User read(long id);
	
	void delete(long id);
	
	void update(User user);
}
