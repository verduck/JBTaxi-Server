package com.bootcamp.jbtaxi.controller;

import com.bootcamp.jbtaxi.dto.TaxiDTO;
import com.bootcamp.jbtaxi.service.TaxiService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/taxi")
public class TaxiController {
    @Autowired
    private TaxiService taxiService;
    
    @RequestMapping(value = "/update", method = RequestMethod.PATCH)
    public void update(@RequestBody TaxiDTO request) {
        taxiService.updateLocation(request.getId(), request.getLatitude(), request.getLongitude());
    }
}
