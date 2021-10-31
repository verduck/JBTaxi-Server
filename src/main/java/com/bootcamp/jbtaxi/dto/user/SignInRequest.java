package com.bootcamp.jbtaxi.dto.user;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class SignInRequest {
  private String phoneNumber;
}
