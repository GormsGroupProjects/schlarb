package org.schlarb.repository;


import org.schlarb.model.SchlarbUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<SchlarbUser, Integer> {
    public List<SchlarbUser> findByUsername(String name);
    //findBy each variable
    //findall is complaining... not written...
}
