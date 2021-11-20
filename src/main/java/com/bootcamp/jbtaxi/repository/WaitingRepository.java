package com.bootcamp.jbtaxi.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import com.bootcamp.jbtaxi.domain.Waiting;

import org.springframework.stereotype.Repository;

@Repository
public class WaitingRepository {
	private HashMap<Integer, Waiting> store = new HashMap<>();

	public Optional<Waiting> findById(int id) {
		return Optional.ofNullable(store.get(id));
	}

	public Waiting save(Waiting waiting) {
		store.put(waiting.getUser().getId(), waiting);
		return waiting;
	}

	public List<Waiting> findByUserTaxiIsNotNull() {
		List<Waiting> result = new ArrayList<>();

		for (Integer key : store.keySet()) {
			Waiting waiting = store.get(key);
			if (waiting.getUser().getTaxi() != null) {
				result.add(waiting);
			}
		}

		return result;
	}
	public List<Waiting> findByUserTaxiIsNull() {
		List<Waiting> result = new ArrayList<>();

		for (Integer key : store.keySet()) {
			Waiting waiting = store.get(key);
			if (waiting.getUser().getTaxi() == null) {
				result.add(waiting);
			}
		}

		return result;
	}
}
