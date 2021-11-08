package com.bootcamp.jbtaxi.service;

import java.util.PriorityQueue;

import com.bootcamp.jbtaxi.domain.Waiting;
import com.bootcamp.jbtaxi.dto.WaitingDTO;
import com.bootcamp.jbtaxi.repository.WaitingRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CallService {
    @Autowired
    private WaitingRepository waitingRepository;    
}
