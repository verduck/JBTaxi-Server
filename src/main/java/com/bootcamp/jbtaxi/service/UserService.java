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

	public UserDTO signUp(UserDTO userDTO) {
		UserDTO result;

		User user = modelMapper.map(userDTO, User.class);
		user = userRepository.save(user);

		result = modelMapper.map(user, UserDTO.class);
		return result;
	}

	public UserDTO signIn(UserDTO userDTO) {
		UserDTO result;
		Optional<User> optionalUser = userRepository.findByPhoneNumber(userDTO.getPhoneNumber());
		
		if (!optionalUser.isPresent()) {
			User user = optionalUser.get();
			result = modelMapper.map(user, UserDTO.class);
			return result;
		} else {
			return null;
		}
		
	}
}
