package org.schlarb.controller;


import org.schlarb.model.User;
import org.schlarb.service.UserCrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
public class UserCrudController {

//    public ResponseEntity<Object>

    @Autowired
    private UserCrudService userCrudService;


//    @GetMapping("/user/id/{id}")
//    public User getUserById


    @PostMapping("/user")
    public User addUser(@RequestBody User user){
//        return userCrudService.addUser(user);
        User resUser = userCrudService.addUser(user);
        resUser.setPassword(null); //this works, thanks to lombok
        //disregard the above red text!!!
        return resUser;
    }
//    @PutMapping
//
//    @PostMapping
//
//    @DeleteMapping

//    @PostMapping("/login")
//    //this needs to take a username and pw...
//    //and return full user (no pw?)
//    public User loginUser(String username, String password){
//
//        //i could get by username, then get by pw...
//        //
//    }

//
//    public User addUser(@RequestBody User user){
////        return userCrudService.addUser(user);
//        User resUser = userCrudService.addUser(user);
//        resUser.setPassword(null); //this works, thanks to lombok
//        //disregard the above red text!!!
//        return resUser;
//    }


}
