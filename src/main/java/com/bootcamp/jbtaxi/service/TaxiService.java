package com.bootcamp.jbtaxi.service;

import java.util.Optional;

import com.bootcamp.jbtaxi.domain.Taxi;
import com.bootcamp.jbtaxi.dto.TaxiDTO;
import com.bootcamp.jbtaxi.dto.UserDTO;
import com.bootcamp.jbtaxi.repository.TaxiRepository;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaxiService {
	@Autowired
	private TaxiRepository taxiRepository;

	@Autowired
	private ModelMapper modelMapper;

	public TaxiDTO get(UserDTO userDTO) {
		Optional<Taxi> taxiOptional = taxiRepository.findByUserId(userDTO.getId());
		if (taxiOptional.isPresent()) {
			Taxi taxi = taxiOptional.get();
			TaxiDTO taxiDTO = modelMapper.map(taxi, TaxiDTO.class);
			return taxiDTO;
		} else {
			return null;
		}
	}

	public TaxiDTO register(TaxiDTO taxiDTO) {
		Taxi taxi = modelMapper.map(taxiDTO, Taxi.class);
		taxi = taxiRepository.save(taxi);

		taxiDTO = modelMapper.map(taxi, TaxiDTO.class);
		return taxiDTO;
	}
}