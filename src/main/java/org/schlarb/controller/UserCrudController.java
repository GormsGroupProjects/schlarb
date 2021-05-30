package org.schlarb.controller;


import org.schlarb.model.User;
import org.schlarb.service.UserCrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class UserCrudController {

//    public ResponseEntity<Object>

    @Autowired
    private UserCrudService userCrudService;


//    @GetMapping("/user/id/{id}")
//    public User getUserById


//    @PostMapping("/user")
//    public User addUser(@RequestBody User user){
////        return userCrudService.addUser(user);
//        User resUser = userCrudService.addUser(user);
//        resUser.setPassword(null); //this works, thanks to lombok
//        //disregard the above red text!!!
//        return resUser;
//    }
    
    @PostMapping("/user")
	public User addUser(@RequestBody User user) {
		// TODO Auto-generated method stub
		return userCrudService.addUser(user);
	}
//    @PutMapping
//
//    @PostMapping
//
//    @DeleteMapping

}
