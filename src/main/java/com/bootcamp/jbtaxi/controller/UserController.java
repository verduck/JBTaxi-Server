package com.bootcamp.jbtaxi.controller;

import com.bootcamp.jbtaxi.dto.UserDTO;
import com.bootcamp.jbtaxi.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/user")
public class UserController {
  @Autowired
  private UserService userService;
  
  @RequestMapping(value = "/signup", method = RequestMethod.POST)
  public @ResponseBody UserDTO signUp(@RequestBody UserDTO request) {
    return userService.signUp(request);
  }

  @RequestMapping(value = "/signin", method = RequestMethod.POST)
  public @ResponseBody UserDTO signIn(@RequestBody UserDTO request) {
    return userService.signIn(request);
  }
}
