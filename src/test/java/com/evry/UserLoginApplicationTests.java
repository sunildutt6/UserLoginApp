package com.evry;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.evry.entity.Address;
import com.evry.entity.User;
import com.evry.repository.UserRepository;

@SpringBootTest
class UserLoginApplicationTests {
	
	@Autowired
	private UserRepository repo;

	@Test
	void createUser() {
		User user = new User();
		user.setFirstName("sunil");
		user.setLastName("kala");
		user.setEmail("s2@y.com");
		user.setSex("male");
		user.setPassword("test");
		
		Address address = new Address();
		address.setCity("abc");
		address.setCode(123);
		address.setStreet("cde");
		address.setCountry("pk");
		user.setAddress(address);	
		
		repo.save(user);
		
	}

}
