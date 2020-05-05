package com.rsjava.boris.data;

import com.rsjava.boris.service.ExpoService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ExpoData implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {

        ExpoService expoService = new ExpoService();

        System.out.println("today's date");
        System.out.println(expoService.getTodaysDate());

        System.out.println("date of expo");
        System.out.println(expoService.getExpoDate());

        System.out.println("time left to expo");
        System.out.println(expoService.getTimeLeftToBorisDate());
    }
}
