package com.bootcamp.jbtaxi.dto;

import java.time.LocalTime;

import com.bootcamp.jbtaxi.domain.User;

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
    private User user;
    private LocalTime time;
    private double latitude;
    private double longtitude;
}
