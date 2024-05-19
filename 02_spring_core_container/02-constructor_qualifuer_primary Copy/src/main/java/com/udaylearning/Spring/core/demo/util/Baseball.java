package com.udaylearning.Spring.core.demo.util;

import org.springframework.stereotype.Component;

@Component
public class Baseball implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Practise baseball batting for 15 min !!!";
    }
}
