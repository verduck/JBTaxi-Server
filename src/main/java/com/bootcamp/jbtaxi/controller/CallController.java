package com.bootcamp.jbtaxi.controller;

import com.bootcamp.jbtaxi.domain.Waiting;
import com.bootcamp.jbtaxi.dto.WaitingDTO;
import com.bootcamp.jbtaxi.service.CallService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/call")
public class CallController {
  @Autowired
  private CallService callService;

  @RequestMapping(value = "/taxi", method = RequestMethod.POST)
  public @ResponseBody WaitingDTO callTaxi(@RequestBody WaitingDTO request) {
    System.out.println(request);
    return callService.callTaxi(request);
  }

  @RequestMapping(value = "/enqueue", method = RequestMethod.POST)
  public void enqueue(@RequestBody WaitingDTO request) {
    System.out.println(request);
    callService.enqueue(request);
  }

  @RequestMapping(value = "/dequeue", method = RequestMethod.DELETE)
  public void dequeue(@RequestBody WaitingDTO request) {
    callService.dequeue(request);
  }

  @RequestMapping(value = "/update-location", method = RequestMethod.PATCH)
  public void updateLocation(@RequestBody WaitingDTO request) {
    
  }
}
