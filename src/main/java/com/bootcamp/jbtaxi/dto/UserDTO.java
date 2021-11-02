package com.bootcamp.jbtaxi.dto;

import java.util.Date;

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
    private Date birth;
    private String certificationNumber;
}
