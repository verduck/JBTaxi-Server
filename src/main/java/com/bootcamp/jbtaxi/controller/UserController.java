package com.bootcamp.jbtaxi.controller;

import com.bootcamp.jbtaxi.dto.UserRequest;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/user")
public class UserController {
  
  @RequestMapping(value = "/signin", method = RequestMethod.POST)
  public @ResponseBody String signIn(@RequestBody UserRequest request) {
    return null;
  }
}
