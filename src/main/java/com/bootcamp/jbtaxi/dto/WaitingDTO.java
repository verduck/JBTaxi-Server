package com.bootcamp.jbtaxi.dto;

import java.util.Date;

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
    private Date date;
    private double latitude;
    private double longtitude;
}
