package org.schlarb.service;

import org.schlarb.model.SchlarbUser;

public interface UserCrudService {
    //I do not think I need an artist searchService...
    public SchlarbUser addUser(SchlarbUser user);
    public SchlarbUser update(SchlarbUser user);
    public SchlarbUser getUserById(int id);
    public void deleteUser(int id);

}
