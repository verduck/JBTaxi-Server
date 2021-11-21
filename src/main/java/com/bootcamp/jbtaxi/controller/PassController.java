package com.bootcamp.jbtaxi.controller;

import java.util.HashMap;
import java.util.List;

import com.bootcamp.jbtaxi.domain.Pass;
import com.bootcamp.jbtaxi.dto.UserDTO;
import com.bootcamp.jbtaxi.service.PassService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pass")
public class PassController {
  @Autowired
  private PassService passService;

  @RequestMapping(value = "/all", method = RequestMethod.GET)
  public @ResponseBody List<Pass> getAll() {
    return passService.getAll();
  }

  @RequestMapping(value = "/buy", method = RequestMethod.POST)
  public @ResponseBody UserDTO buy(@RequestBody HashMap<String, Object> request) {
    return passService.buy(request);
  }
}
