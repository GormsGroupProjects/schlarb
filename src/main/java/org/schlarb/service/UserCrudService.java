package org.schlarb.service;

import org.schlarb.model.User;

public interface UserCrudService {
		
		public User addUser(User user);

		User updateUser(User user);

		User getUserByUserName(User user);

		void deleteUser(User user);
	
	}


