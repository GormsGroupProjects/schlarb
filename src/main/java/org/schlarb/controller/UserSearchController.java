package org.schlarb.controller;


import org.schlarb.service.UserSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class UserSearchController {
    @Autowired
    private UserSearchService userSearchService;

    //use mostly for username?
    @GetMapping("/")
    public String noThanks(){
        return "This is not that type of server, kindly bugger off.";
    }
    //need to write a function to get by userId and PW...




}
