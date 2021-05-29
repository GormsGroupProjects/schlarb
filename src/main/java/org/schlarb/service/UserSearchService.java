package org.schlarb.service;

import org.schlarb.model.SchlarbUser;

import java.util.List;

public interface UserSearchService {

    public List<SchlarbUser> getAllUsers(); //do I really need this?
    public List<SchlarbUser> getUsersByName(String name);
//    public List<User> getUsersByArtist(Artist artist); //should this be in another service layer?
    //add getByOther features...


}
