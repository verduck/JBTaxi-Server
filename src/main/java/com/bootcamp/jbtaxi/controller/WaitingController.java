package com.bootcamp.jbtaxi.controller;

import com.bootcamp.jbtaxi.service.WaitingService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WaitingController {
  @Autowired
  private WaitingService waitingService;
}
