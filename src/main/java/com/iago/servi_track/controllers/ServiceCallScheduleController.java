package com.iago.servi_track.controllers;

import com.iago.servi_track.dto.ServiceCallScheduleDto;
import com.iago.servi_track.entities.ServiceCallSchedule;
import com.iago.servi_track.services.CreateServiceScheduleService;
import com.iago.servi_track.services.GetServicesScheduleService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/service-call-schedule")
@RequiredArgsConstructor
public class ServiceCallScheduleController {
	private final CreateServiceScheduleService createServiceScheduleService;
	private final GetServicesScheduleService getServicesScheduleService;

	@GetMapping
	@ResponseStatus(code = HttpStatus.ACCEPTED)
	public List<ServiceCallSchedule> getAllServicesSchedule() {
		return getServicesScheduleService.execute();
	}
	@RequestMapping(path = "/create")
	@ResponseStatus(code = HttpStatus.CREATED)
	public ServiceCallSchedule createServiceSchedule(@RequestBody @Valid ServiceCallScheduleDto requestBody) {
		return createServiceScheduleService.execute(requestBody);
	}
}
