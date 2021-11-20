package com.bootcamp.jbtaxi.controller;

import com.bootcamp.jbtaxi.dto.TaxiDTO;
import com.bootcamp.jbtaxi.dto.UserDTO;
import com.bootcamp.jbtaxi.service.TaxiService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/taxi")
public class TaxiController {
    @Autowired
    private TaxiService taxiService;

    @RequestMapping(value = "/get", method = RequestMethod.POST)
    public @ResponseBody TaxiDTO get(@RequestBody UserDTO request) {
        return taxiService.get(request);
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public @ResponseBody TaxiDTO register(@RequestBody TaxiDTO request) {
        return taxiService.register(request);
    }
    
}
