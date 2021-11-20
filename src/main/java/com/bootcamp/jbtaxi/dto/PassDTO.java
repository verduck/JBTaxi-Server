package com.bootcamp.jbtaxi.dto;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class PassDTO {
  private Integer id;
  private String name;
  private int distance;
  private int price;
}
