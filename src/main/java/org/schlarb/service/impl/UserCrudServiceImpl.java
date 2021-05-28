package org.schlarb.service.impl;

import java.util.List;

import org.schlarb.model.User;
import org.schlarb.service.UserCrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.user.repository.UserRepository;

@Service
public class UserCrudServiceImpl implements UserCrudService {
	
	@Autowired
	private UserRepository userRepository;
	
	
	@Override
	public User addUser(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}
	
	@Override
	public User updateUser(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}
	
	@Override
	public User getUserByUserId(int userId) {
		// TODO Auto-generated method stub
		return userRepository.findById(userId).get();
	}

	@Override
	public User getUserByUserName(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

	@Override
	public void deleteUser(int userId) {
		// TODO Auto-generated method stub
		userRepository.deleteById(userId);
		
	}

}
