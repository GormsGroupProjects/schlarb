package org.schlarb.service;

import java.util.List;

import org.schlarb.model.User;

public interface UserSearchService {
	
	public List<User> getAllUsers();
	public List<User> getUserByUserName(String name);
	public List<User> getUserByFirstName(String name);
	public List<User> getUserByLastName(String name);
	public List<User> getUserByEmail(String email);
	
}
