package com.uday.learning.SpringMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MVCcontroller {

    // create a mapping for "/hello"

    @GetMapping("/hello")
    public String sayHello(Model theModel) {
        theModel.addAttribute("theDate", java.time.LocalDateTime.now());
        System.out.println("Model is" + theModel.getAttribute("theDate"));
        return "helloworld";
    }

    @GetMapping("/showform")
    public String showForm(){
        return "showform";
    }

    @GetMapping("/processForm")
    public String processForm(){
        return "processForm";
    }

}