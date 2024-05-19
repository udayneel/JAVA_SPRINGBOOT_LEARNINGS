package com.udaylearning.Spring.core.demo.util;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class TennisBallCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Practise TennisBallCoach  for 15 min !!!";
    }
}
