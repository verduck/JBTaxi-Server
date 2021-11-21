package com.bootcamp.jbtaxi.service;

import java.util.HashMap;
import java.util.List;

import com.bootcamp.jbtaxi.domain.Pass;
import com.bootcamp.jbtaxi.domain.User;
import com.bootcamp.jbtaxi.dto.UserDTO;
import com.bootcamp.jbtaxi.repository.PassRepository;
import com.bootcamp.jbtaxi.repository.UserRepository;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PassService {
  @Autowired
  private UserRepository userRepository;
  @Autowired
  private PassRepository passRepository;
  @Autowired
  private ModelMapper modelMapper;
  
  public List<Pass> getAll() {
    return passRepository.findAll();
  }

  public UserDTO buy(HashMap<String, Object> request) {
    Integer userId = (Integer) request.get("userId");
    Integer passId = (Integer) request.get("passId");

    User user = userRepository.getById(userId);
    Pass pass = passRepository.getById(passId);

    user.setPass(user.getPass() + pass.getDistance());
    user = userRepository.save(user);

    return modelMapper.map(user, UserDTO.class);
  }
}
