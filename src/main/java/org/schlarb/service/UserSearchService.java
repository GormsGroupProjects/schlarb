package org.schlarb.service;

import java.util.List;

import org.schlarb.model.User;

public interface UserSearchService {
	
	public List<User> getAllUsers();
	public List<User> getUserByUserId(int userId);
	public List<User> getUserByUserName(String userName);
	public List<User> getUserByFirstName(String firstName);
	public List<User> getUserByLastName(String lastName);
	public List<User> getUserByEmail(String email);
	
	
}
