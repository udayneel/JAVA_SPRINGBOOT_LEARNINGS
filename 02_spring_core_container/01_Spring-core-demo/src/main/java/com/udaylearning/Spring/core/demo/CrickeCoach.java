package com.udaylearning.Spring.core.demo;

import org.springframework.stereotype.Component;

@Component
public class CrickeCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Practise batting for 15 min !!!";
    }
}
