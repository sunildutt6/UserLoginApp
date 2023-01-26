package com.evry.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.evry.entity.User;
import com.evry.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository repository;

	@Override
	public User saveUser(User user) {
		return repository.save(user);
	}

	@Override
	public User updateUser(User user) {
		return repository.save(user);
	}

	@Override
	public void deleteUserById(long id) {
		 repository.deleteById(id);
	}

	@Override
	public void deleteUser(User user) {
		repository.delete(user);
	}

	@Override
	public User getUserById(int id) {
		return repository.findById((long) id).get();
	}

	@Override
	public List<User> getAllUsers() {
		return repository.findAll();
	}

	

}
