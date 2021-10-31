package com.bootcamp.jbtaxi.dto.user;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class SignInResponse {
  private boolean result;
}
