package com.iago.servi_track.services;

import com.iago.servi_track.entities.ServiceCall;
import com.iago.servi_track.repositories.ServiceCallRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GetAllServiceCalls {
	private final ServiceCallRepository repository;

	public List<ServiceCall> execute() {
		return repository.findAll();
	}
}
