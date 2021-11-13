package com.bootcamp.jbtaxi.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Data
@Builder
@Entity
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @NonNull
  private String phoneNumber;

  private String name;
  private Date birth;

  private String certificationNumber;

	private int maxDistance;

  @OneToOne(mappedBy = "user")
  private Taxi taxi;

  @OneToOne(mappedBy = "user")
  private Waiting waiting;
}
