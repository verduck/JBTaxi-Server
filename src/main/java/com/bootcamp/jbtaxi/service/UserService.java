package com.bootcamp.jbtaxi.service;

import java.util.Optional;

import com.bootcamp.jbtaxi.domain.User;
import com.bootcamp.jbtaxi.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;

	public void signIn(String phoneNumber) {
		Optional<User> optionalUser = userRepository.findByPhoneNumber(phoneNumber);
		if (!optionalUser.isPresent()) {
			User user = User.builder()
			.phoneNumber(phoneNumber)
			.name(phoneNumber.substring(phoneNumber.length() - 4))
			.build();
			
			userRepository.save(user);
		}
	}
}
