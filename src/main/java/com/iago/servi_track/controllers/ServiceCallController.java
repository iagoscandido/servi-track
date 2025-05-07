package com.iago.servi_track.controllers;

import com.iago.servi_track.entities.ServiceCall;
import com.iago.servi_track.services.CreateServiceCallService;
import com.iago.servi_track.services.GetAllServiceCalls;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/service-call")
@RequiredArgsConstructor
public class ServiceCallController {
    private final CreateServiceCallService createServiceCallService;
    private final GetAllServiceCalls getAllServiceCalls;

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public void createServiceCall(@RequestBody ServiceCall requestBody) {
        ServiceCall serviceCall = createServiceCallService.execute(requestBody);
    }

    @GetMapping("/all")
    @ResponseStatus(code = HttpStatus.ACCEPTED)
    public List<ServiceCall> serviceCalls() {
        return getAllServiceCalls.execute();
    }

}
