package org.schlarb.repository;


import org.schlarb.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    public List<User> findByUsername(String name);
    //findBy each variable
    //findall is complaining... not written...
}
