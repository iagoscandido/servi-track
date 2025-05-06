package com.iago.servi_track.services;

import com.iago.servi_track.entities.ServiceCall;
import com.iago.servi_track.repositories.ServiceCallRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
@RequiredArgsConstructor
public class CreateServiceCallService {
	private final ServiceCallRepository repository;

	public ServiceCall execute(ServiceCall serviceCall) {
		return repository.save(serviceCall);
	}
}
