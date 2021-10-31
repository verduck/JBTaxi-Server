package com.bootcamp.jbtaxi.repository;

import java.util.Optional;

import com.bootcamp.jbtaxi.domain.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
  Optional<User> findByPhoneNumber(String phoneNumber);
}
