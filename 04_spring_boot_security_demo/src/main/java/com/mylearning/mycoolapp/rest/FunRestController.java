package com.mylearning.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @Value("${coach.name}")
    private String coachName;

    @GetMapping("/coach")
    public String getCoachName(){
        return coachName;
    }

    @GetMapping("/")
    public  String sayHello(){
        return "HEllo World";
    }

    @GetMapping("/workout")
    public  String getGym(){
        return "I will go to Gym from tom";
    }

    @GetMapping("/fortune")
    public  String lucky(){
        return "I will get 50 LPA";
    }

}
