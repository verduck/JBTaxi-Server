package com.bootcamp.jbtaxi.service;

import java.util.List;
import java.util.PriorityQueue;

import com.bootcamp.jbtaxi.domain.Waiting;
import com.bootcamp.jbtaxi.dto.WaitingDTO;
import com.bootcamp.jbtaxi.repository.WaitingRepository;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CallService {
	@Autowired
	private WaitingRepository waitingRepository;

	@Autowired
	private ModelMapper modelMapper;

	public void callTaxi(WaitingDTO waitingDTO) {
		PriorityQueue<Waiting> q = new PriorityQueue<>();
		List<Waiting> taxis = waitingRepository.findByUserTaxiIsNotNull();
		q.addAll(taxis);

		if (q.isEmpty()) {
			Waiting waiting = modelMapper.map(waitingDTO, Waiting.class);
			waitingRepository.save(waiting);
		}
	}
}
