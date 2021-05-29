package org.schlarb.service.Impl;

import org.schlarb.exception.SchlarbException;
import org.schlarb.model.SchlarbUser;
import org.schlarb.repository.UserRepository;
import org.schlarb.service.UserCrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

//import static com.sun.xml.internal.ws.api.model.wsdl.WSDLBoundOperation.ANONYMOUS.optional;
//this appear when I moved the folder - too chicken to delete

@Service
public class UserCrudServiceImp implements UserCrudService {

    @Autowired
    private UserRepository schlarbUserRepository;

    public SchlarbUser addUser(SchlarbUser user){
        return schlarbUserRepository.save(user);
    }
    public SchlarbUser update(SchlarbUser user){
        return schlarbUserRepository.save(user);
    }
    public SchlarbUser getUserById(int id){
        Optional<SchlarbUser> optional = schlarbUserRepository.findById(id);
        if (optional.isPresent()){
            return optional.get();
        }
        else{
            throw new SchlarbException("No user with id "+id+".");
        }
    }
    public void deleteUser(int id){

    }

}
