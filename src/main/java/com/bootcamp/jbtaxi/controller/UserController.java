package com.bootcamp.jbtaxi.controller;

import com.bootcamp.jbtaxi.dto.user.SignInRequest;
import com.bootcamp.jbtaxi.dto.user.SignInResponse;
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

  @RequestMapping(value = "/signin", method = RequestMethod.POST)
  public @ResponseBody SignInResponse signIn(@RequestBody SignInRequest request) {
    SignInResponse response = new SignInResponse(true);
    userService.signIn(request.getPhoneNumber());
    return response;
  }
}
