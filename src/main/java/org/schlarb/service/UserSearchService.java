package org.schlarb.service;

import org.schlarb.model.User;

import java.util.List;

public interface UserSearchService {

    public List<User> getAllUsers(); //do I really need this?
    public List<User> getUsersByName(String name);
//    public List<User> getUsersByArtist(Artist artist); //should this be in another service layer?
    //add getByOther features...


}
