package com.evry.service;

import java.util.List;

import com.evry.entity.User;

public interface UserService {
	
	 User saveUser(User user);
	
	 User updateUser(User user);
	
	 void deleteUserById(long id);
	
	 void deleteUser(User user);
	
	 User getUserById(int id);
	
	List<User> getAllUsers();

}
