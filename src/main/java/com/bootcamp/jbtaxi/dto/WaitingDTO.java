package com.bootcamp.jbtaxi.dto;

import java.time.LocalTime;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class WaitingDTO {
    private Integer id;
    private UserDTO user;
    private LocalTime time;
    private double latitude;
    private double longitude;
}
