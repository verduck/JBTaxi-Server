package com.bootcamp.jbtaxi.controller;

import com.bootcamp.jbtaxi.dto.WaitingDTO;
import com.bootcamp.jbtaxi.service.CallService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/call")
public class CallController {
  @Autowired
  private CallService callService;

  @MessageMapping("/taxi")
  public void callTaxi(@RequestBody WaitingDTO request) {
    callService.callTaxi(request);
  }

  @MessageMapping("/wait")
  public void waitResponse(@RequestBody WaitingDTO request) {
    
  }

  @MessageMapping("/update-location")
  public void updateLocation(@RequestBody WaitingDTO request) {
    
  }
}
