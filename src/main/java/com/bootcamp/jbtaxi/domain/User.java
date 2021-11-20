package com.bootcamp.jbtaxi.domain;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @NonNull
  private String phoneNumber;

  private String name;
  private LocalDate birth;

  private String certificationNumber;

  private int pass;
	private int maxDistance;

  @OneToOne(mappedBy = "user")
  private Taxi taxi;

  @OneToOne(mappedBy = "user")
  private Waiting waiting;
}
