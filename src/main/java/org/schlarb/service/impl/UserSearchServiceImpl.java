package org.schlarb.service.impl;

import java.util.List;

import org.schlarb.model.User;
import org.schlarb.service.UserSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.user.repository.UserRepository;


@Service
public class UserSearchServiceImpl implements UserSearchService {

	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	@Override
	public List<User> getUserByUserName(String userName) {
		// TODO Auto-generated method stub
		return userRepository.findByUserName(userName);
	}

	@Override
	public List<User> getUserByFirstName(String firstName) {
		// TODO Auto-generated method stub
		return userRepository.findByUserFirstName(firstName);
	}

	@Override
	public List<User> getUserByLastName(String lastName) {
		// TODO Auto-generated method stub
		return userRepository.findByUserLastName(lastName);
	}

	@Override
	public List<User> getUserByEmail(String email) {
		// TODO Auto-generated method stub
		return userRepository.findByUserEmail(email);
	}

}
