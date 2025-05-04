package com.iago.servi_track.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/report")
public class ReportsController {

    @GetMapping("/summary")
    public String getSummary() {
        return "got a get summary request";
    }
}
