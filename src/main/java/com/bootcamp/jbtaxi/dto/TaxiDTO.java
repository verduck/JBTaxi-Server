package com.bootcamp.jbtaxi.dto;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class TaxiDTO {
    private Integer id;
    private UserDTO user;
    private String carNumber;
    private double latitude;
    private double longitude;
}
