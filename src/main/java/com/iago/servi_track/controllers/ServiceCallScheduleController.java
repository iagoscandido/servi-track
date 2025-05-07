package com.iago.servi_track.controllers;

import com.iago.servi_track.dto.ServiceCallScheduleDto;
import com.iago.servi_track.entities.ServiceCallSchedule;
import com.iago.servi_track.services.CreateServiceScheduleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/service-call-schedule")
@RequiredArgsConstructor
public class ServiceCallScheduleController {
    private final CreateServiceScheduleService service;
    @GetMapping
    @ResponseStatus(code = HttpStatus.ACCEPTED)
    public void test() {
    }

    @RequestMapping(path = "/create")
    @ResponseStatus(code = HttpStatus.CREATED)
    public ServiceCallSchedule createServiceSchedule(@RequestBody ServiceCallScheduleDto requestBody) {
        return service.execute(requestBody);
    }
}
