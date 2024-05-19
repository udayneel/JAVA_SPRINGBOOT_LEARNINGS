package com.uday.learning.SpringMVC.controller;

import com.uday.learning.SpringMVC.model.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class StudentController {

    @Value("${countries}")
    private List<String> countries;

    @Value("${languages}")
    private List<String> languages;

    @GetMapping("/showStudentForm")
    public String showForm(Model model){

        //create a student object

        Student theStudent = new Student();

        // add created student object to model
        model.addAttribute("student",theStudent);
        model.addAttribute("countries",countries);
        model.addAttribute("languages",languages);
        return "student-form";
    }


    @PostMapping("/processStudentForm")
    public String processForm(@ModelAttribute("student") Student theStudent){

        //log
        System.out.println("what we recived from html page " + theStudent.getFirstName() +" " +theStudent.getLastName());

        return "student-confirmation";
    }
}
