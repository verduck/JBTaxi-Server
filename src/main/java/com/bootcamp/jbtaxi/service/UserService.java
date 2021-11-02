package com.bootcamp.jbtaxi.service;

import java.util.Optional;

import com.bootcamp.jbtaxi.domain.User;
import com.bootcamp.jbtaxi.dto.UserDTO;
import com.bootcamp.jbtaxi.repository.UserRepository;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;

	@Autowired
	private ModelMapper modelMapper;

	public UserDTO signIn(String phoneNumber) {
		UserDTO userDTO;
		Optional<User> optionalUser = userRepository.findByPhoneNumber(phoneNumber);
		User user;
		if (!optionalUser.isPresent()) {
			user = User.builder()
			.phoneNumber(phoneNumber)
			.name(phoneNumber.substring(phoneNumber.length() - 4))
			.build();
			
			userRepository.save(user);
		} else {
			user = optionalUser.get();
		}
		userDTO = modelMapper.map(user, UserDTO.class);
		return userDTO;
	}
}
