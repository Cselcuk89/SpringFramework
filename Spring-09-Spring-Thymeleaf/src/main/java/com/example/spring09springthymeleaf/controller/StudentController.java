package com.example.spring09springthymeleaf.controller;

import com.example.spring09springthymeleaf.bootstrap.DataGenerator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

    //    @RequestMapping(value = "/register",method = RequestMethod.GET)
    @GetMapping("/register")
    public String register(Model model){

        model.addAttribute("students", DataGenerator.createStudent());

        return "student/register";
    }

    @RequestMapping("/welcome")

    public String info(){
        return "templates/student/welcome";
    }
}
