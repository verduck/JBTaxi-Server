package com.bootcamp.jbtaxi.dto;

import java.sql.Date;
import java.time.LocalDate;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class UserDTO {
    private Integer id;
    private String phoneNumber;
    private String name;
    private LocalDate birth;
    private String certificationNumber;
    private int pass;
}
