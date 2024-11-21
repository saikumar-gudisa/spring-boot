package com.example.datefinder;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@RestController
public class MyController {

    @GetMapping("/")
    public String getDateAfter100Days() {
        // Get today's date
        LocalDate today = LocalDate.now();

        // Calculate the date after 100 days
        LocalDate dateAfter100Days = today.plusDays(100);

        // Format the date to dd-MM-yyyy
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        // Return the formatted date as a string
        return dateAfter100Days.format(formatter);
    }
}
