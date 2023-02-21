package com.evry.service;

import java.util.List;

import com.evry.entity.User;

public interface UserService {

	User saveUser(User user);

	User updateUser(int id, User u);

	void deleteUserById(int id);

	void deleteUser(User user);

	User getUserById(int id);

	List<User> getAllUsers();

}
