package com.bootcamp.jbtaxi.service;

import java.util.Optional;

import com.bootcamp.jbtaxi.domain.Taxi;
import com.bootcamp.jbtaxi.repository.TaxiRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaxiService {
    @Autowired
    private TaxiRepository taxiRepository;

    public void updateLocation(int id, double latitude, double longitude) {
        Optional<Taxi> optionalTaxi = taxiRepository.findById(id);
        
        if (optionalTaxi.isPresent()) {
            Taxi taxi = optionalTaxi.get();
            taxi.setLatitude(latitude);
            taxi.setLongitude(longitude);
            taxiRepository.save(taxi);
        }
    }
}
