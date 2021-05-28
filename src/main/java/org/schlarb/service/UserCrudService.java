package org.schlarb.service;

import org.schlarb.model.User;

public interface UserCrudService {
		
		public User addUser(User user);
		public User updateUser(User user);
		public User getUserByUserName(User user);
		public User getUserByUserId(int userId);
		public void deleteUser(int userId);
	
	}


