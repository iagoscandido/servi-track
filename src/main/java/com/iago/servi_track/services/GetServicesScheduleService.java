package com.iago.servi_track.services;

import com.iago.servi_track.entities.ServiceCallSchedule;
import com.iago.servi_track.repositories.ServiceScheduleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class GetServicesScheduleService {
	private final ServiceScheduleRepository repository;

	public List<ServiceCallSchedule> execute() {
		return repository.findAll();
	}
}
