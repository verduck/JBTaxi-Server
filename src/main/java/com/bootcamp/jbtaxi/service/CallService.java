package com.bootcamp.jbtaxi.service;

import java.time.LocalTime;
import java.util.List;
import java.util.PriorityQueue;

import com.bootcamp.jbtaxi.domain.Waiting;
import com.bootcamp.jbtaxi.dto.WaitingDTO;
import com.bootcamp.jbtaxi.repository.WaitingRepository;
import com.bootcamp.jbtaxi.utils.Util;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.bytebuddy.asm.Advice.Local;

@Service
public class CallService {
	@Autowired
	private WaitingRepository waitingRepository;

	@Autowired
	private ModelMapper modelMapper;

	public WaitingDTO callTaxi(WaitingDTO waitingDTO) {
		WaitingDTO response = null;
		PriorityQueue<Waiting> q = new PriorityQueue<>();
		List<Waiting> taxis = (List<Waiting>) waitingRepository.findAll();
		q.addAll(taxis);

		while (!q.isEmpty()) {
			Waiting waitingTaxi = q.poll();
			response = modelMapper.map(waitingTaxi, WaitingDTO.class);
			double distance = Util.distance(waitingDTO.getLatitude(), waitingDTO.getLongitude(), waitingTaxi.getLatitude(), waitingDTO.getLongitude(), "meter");
			if (distance <= response.getUser().getMaxDistance()) {
				waitingRepository.delete(waitingTaxi);
				return response;
			}
		}

		return null;
	}

	public void enqueue(WaitingDTO waitingDTO) {
		Waiting waiting = modelMapper.map(waitingDTO, Waiting.class);
		waiting.setTime(LocalTime.now());
		waitingRepository.save(waiting);
	}

	public void dequeue(WaitingDTO waitingDTO) {
		Waiting waiting = modelMapper.map(waitingDTO, Waiting.class);
		waitingRepository.delete(waiting);
	}
}
