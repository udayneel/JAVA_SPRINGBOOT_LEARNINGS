package com.udaylearning.Spring.core.demo.util;

import org.springframework.stereotype.Component;

@Component
public class TrackballCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Practise TrackballCoach batting for 15 min !!!";
    }
}
