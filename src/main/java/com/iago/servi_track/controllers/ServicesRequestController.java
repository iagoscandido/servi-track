package com.iago.servi_track.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/services-requests")
public class ServicesRequestController {

    @GetMapping("/all")
    public String listAllServices() {
        return "got a get request";
    }

    @PostMapping
    public String createService() {
        return "got a post request";
    }


}
