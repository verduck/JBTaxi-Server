package com.bootcamp.jbtaxi.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;
import lombok.NonNull;

@Data
@Entity
public class Taxi {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;

  @NonNull
  @OneToOne(mappedBy = "taxi")
  private User user;

  @NonNull
  private String carNumber;

  private Date waitDate;

  private double latitude;
  private double longitude;
}
