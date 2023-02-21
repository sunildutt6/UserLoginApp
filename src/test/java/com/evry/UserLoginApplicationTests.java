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
		user.setFirstName("kumar");
		user.setLastName("kala");
		user.setEmail("s@y.c");
		
		user.setGender("male");
		user.setPassword("test12");
		
		Address address = new Address();
		address.setCity("abcd");
		address.setCode(1234);
		address.setStreet("cddde");
		address.setCountry("pkt");
		user.setAddress(address);	
		
		repo.save(user);
	}
	

}
