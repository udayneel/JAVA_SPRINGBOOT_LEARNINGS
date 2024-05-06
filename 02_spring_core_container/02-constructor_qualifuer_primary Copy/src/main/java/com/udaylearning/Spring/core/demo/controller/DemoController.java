package com.udaylearning.Spring.core.demo.controller;

import com.udaylearning.Spring.core.demo.util.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Coach myCoach;

    @Autowired
    public DemoController(@Qualifier("crickeCoach") Coach myCoach) {
        this.myCoach = myCoach;
    }

    @GetMapping("/getdailyworkout")
    public String getWorkOut(){
        return myCoach.getDailyWorkout();
    }
}
