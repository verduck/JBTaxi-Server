package com.bootcamp.jbtaxi.dto.taxi;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class LocationUpdateRequest {
    private Integer id;
    private double latitude;
    private double longitude;
}
