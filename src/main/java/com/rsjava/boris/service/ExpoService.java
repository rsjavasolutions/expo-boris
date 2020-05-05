package com.rsjava.boris.service;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ExpoService {

    private LocalDateTime expoDateTime;

    public ExpoService() {
        expoDateTime = LocalDateTime.of(
                2021, 2, 13, 18, 00, 00
        );
    }

    public String getTodaysDate() {
        return getDate(LocalDateTime.now());
    }

    public String getExpoDate() {
        return getDate(expoDateTime);
    }

    public String getTimeLeftToBorisDate() {
        Duration duration = Duration.ofSeconds(
                Duration.between(LocalDateTime.now(),
                        expoDateTime).toSeconds());
        int days = (int) duration.toDaysPart();
        int hours = duration.toHoursPart();
        int minutes = duration.toMinutesPart();
        int seconds = duration.toSecondsPart();

        return "Do EXPO: Boris Brejcha pozostało: "
                + days + " dni "
                + hours + " godzin "
                + minutes + " minut "
                + seconds + " sekund.";
    }

    private String getDate(LocalDateTime localDateTime) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        return formatter.format(localDateTime);

    }
}
