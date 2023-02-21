package com.evry.service;

import java.util.List;
import java.util.Optional;

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
	public void deleteUserById(int id) {
		Optional<User> newUser = repository.findById(id);
		if(newUser.isPresent()) {
			repository.deleteById(id);
		}else {
			throw new RuntimeException("User with id { "+ id + "} not found ");
		}
	}

	@Override
	public void deleteUser(User user) {
		repository.delete(user);
	}

	@Override
	public User getUserById(int id) {
		Optional<User> newUser = repository.findById(id);

		if (newUser.isPresent()) {
			return newUser.get();
		} else {
			throw new RuntimeException("User with id {"+ id +"} not found ");
		}
	}

	@Override
	public List<User> getAllUsers() {
		return repository.findAll();
	}

	@Override
	public User updateUser(int id, User u) {
		User user = repository.findById(id).get();
		user.setFirstName(u.getFirstName());
		user.setLastName(u.getLastName());
		user.setEmail(u.getEmail());
		user.setGender(u.getGender());
		user.setPassword(u.getPassword());

		user.setAddress(u.getAddress());
		return repository.save(user);
	}

}
