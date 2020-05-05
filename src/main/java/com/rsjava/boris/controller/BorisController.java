package com.rsjava.boris.controller;

import com.rsjava.boris.service.ExpoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BorisController {

    private ExpoService expoService;

    @Autowired
    public BorisController(ExpoService expoService) {
        this.expoService = expoService;
    }

    @GetMapping("/")
    public String getInde(ModelMap map) {
        map.put("todaysDate", expoService.getTodaysDate());
        map.put("timeLeft", expoService.getTimeLeftToBorisDate());
        return "index";
    }
}
