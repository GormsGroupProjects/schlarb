package org.schlarb.service.Impl;


import org.schlarb.model.SchlarbUser;
import org.schlarb.repository.UserRepository;
import org.schlarb.service.UserSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserSearchServiceImp implements UserSearchService {
    @Autowired
    private UserRepository schlarbUserRepository;

    @Override
    public List<SchlarbUser> getAllUsers()
    {
        return schlarbUserRepository.findAll();
    }
    @Override
    public List<SchlarbUser> getUsersByName(String name){
        return schlarbUserRepository.findByUsername(name);
    }
//    public List<User> getUsersByArtist(Artist artist) {
//        return userRepository.findByArtist(Artist artist);
//    } //this may be problematic...

}
