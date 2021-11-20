package com.bootcamp.jbtaxi;

import javax.annotation.PostConstruct;

import com.bootcamp.jbtaxi.domain.Pass;
import com.bootcamp.jbtaxi.repository.PassRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JbtaxiApplication {
	@Autowired
	private PassRepository passRepository;

	@PostConstruct
	public void createPass() {
		Pass pass = new Pass("30km 이용권", 30, 33000);
		passRepository.save(pass);
		pass = new Pass("50km 이용권", 50, 50000);
		passRepository.save(pass);
		pass = new Pass("100km 이용권", 100, 90000);
		passRepository.save(pass);
	}

	public static void main(String[] args) {
		SpringApplication.run(JbtaxiApplication.class, args);
	}

}
