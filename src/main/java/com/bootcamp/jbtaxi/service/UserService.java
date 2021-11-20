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
		User user = modelMapper.map(userDTO, User.class);
		user = userRepository.save(user);

		userDTO = modelMapper.map(user, UserDTO.class);
		return userDTO;
	}

	public UserDTO signIn(UserDTO userDTO) {
		Optional<User> optionalUser = userRepository.findByPhoneNumber(userDTO.getPhoneNumber());
		
		if (optionalUser.isPresent()) {
			User user = optionalUser.get();
			userDTO = modelMapper.map(user, UserDTO.class);
		} else {
			userDTO.setName(userDTO.getPhoneNumber().substring(userDTO.getPhoneNumber().length() - 4));
			userDTO = signUp(userDTO);
		}
		
		return userDTO;
	}

	public UserDTO get(UserDTO userDTO) {
		return signIn(userDTO);
	}

	public UserDTO update(UserDTO userDTO) {
		User user = modelMapper.map(userDTO, User.class);
		user = userRepository.save(user);

		userDTO = modelMapper.map(user, UserDTO.class);
		return userDTO;
	}

	public UserDTO registerCertification(UserDTO userDTO) {
		// confirm certification number
		return update(userDTO);
	}
}
