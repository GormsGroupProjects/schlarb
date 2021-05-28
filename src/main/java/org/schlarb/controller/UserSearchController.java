package org.schlarb.controller;

import java.util.List;

import org.schlarb.model.User;
import org.schlarb.service.UserSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserSearchController implements UserSearchService {

	@Autowired
	private UserSearchService userSearchService;

	@GetMapping("/user")
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return userSearchService.getAllUsers();
	}

	@GetMapping("/user/userName/{userName}")
	public List<User> getUserByUserName(@PathVariable String userName) {
		// TODO Auto-generated method stub
		return userSearchService.getUserByUserName(userName);
	}

	@GetMapping("/user/firstName/{firstName}")
	public List<User> getUserByFirstName(@PathVariable String firstName) {
		// TODO Auto-generated method stub
		return userSearchService.getUserByFirstName(firstName);
	}

	@GetMapping("/user/lastName/{lastName}")
	public List<User> getUserByLastName(@PathVariable String lastName) {
		// TODO Auto-generated method stub
		return userSearchService.getUserByLastName(lastName);
	}

	@GetMapping("/user/email/{email}")
	public List<User> getUserByEmail(@PathVariable String email) {
		// TODO Auto-generated method stub
		return userSearchService.getUserByEmail(email);
	}

}
