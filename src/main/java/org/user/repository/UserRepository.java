package org.user.repository;

import org.schlarb.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
	
	public List<User> findByUserName(String name);
	public List<User> findByUserFirstName(String firstName);
	public List<User> findByUserLastName(String lastName);
	public List<User> findByUserEmail(String email);

}
