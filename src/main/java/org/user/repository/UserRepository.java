package org.user.repository;

import org.schlarb.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	
	public List<User> findByUserName(String name);
	public List<User> findByUserId(int userId);
	public List<User> findByUserFirstName(String firstName);
	public List<User> findByUserLastName(String lastName);
	public List<User> findByUserEmail(String email);


//	@Query("select * from User")
//	public List<User> getUser;
	
}
