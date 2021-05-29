package org.schlarb.controller;


import org.schlarb.model.SchlarbUser;
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
    public SchlarbUser addUser(@RequestBody SchlarbUser user){
//        return userCrudService.addUser(user);
        SchlarbUser resUser = userCrudService.addUser(user);
        resUser.setPassword(null); //this works, thanks to lombok
        //disregard the above red text!!!
        return resUser;
    }
//    @PutMapping
//
//    @PostMapping
//
//    @DeleteMapping

}
