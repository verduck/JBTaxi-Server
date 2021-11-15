package com.bootcamp.jbtaxi.controller;

import com.bootcamp.jbtaxi.service.TaxiService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/taxi")
public class TaxiController {
    @Autowired
    private TaxiService taxiService;

    
    
}
