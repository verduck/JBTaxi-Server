package com.bootcamp.jbtaxi.service;

import java.util.List;

import com.bootcamp.jbtaxi.domain.Pass;
import com.bootcamp.jbtaxi.repository.PassRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PassService {
  @Autowired
  private PassRepository passRepository;
  
  public List<Pass> getAll() {
    return passRepository.findAll();
  }
}
