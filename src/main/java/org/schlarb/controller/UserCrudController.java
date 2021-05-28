package org.schlarb.controller;

import org.schlarb.model.User;
import org.schlarb.service.UserCrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserCrudController  {
	
	@Autowired
	private UserCrudService userCrudService;

	@PostMapping("/user")
	public User addUser(User user) {
		// TODO Auto-generated method stub
		return userCrudService.addUser(user);
	}

	@PutMapping("/user")
	public User updateUser(User user) {
		// TODO Auto-generated method stub
		return userCrudService.updateUser(user);
	}

	@GetMapping("/user/{userId}") 
	public User getUserByUserId(int userId) {
		// TODO Auto-generated method stub
		return userCrudService.getUserByUserId(userId);
	}

	@DeleteMapping ("/user/{userId}") 
	public void deleteUser(int userId) {
		// TODO Auto-generated method stub
		userCrudService.deleteUser(userId);
		
	}

}
