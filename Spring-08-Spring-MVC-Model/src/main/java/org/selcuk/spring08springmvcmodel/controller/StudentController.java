package org.selcuk.spring08springmvcmodel.controller;

import org.selcuk.spring08springmvcmodel.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
public class StudentController {
    @RequestMapping("/welcome")
    public String homePage(Model model){
        model.addAttribute("name","Cydeo");
        model.addAttribute("course","MVC");
        String subject = "Collections";
        model.addAttribute("subject",subject);
        // create some random student id and show it in your ui
        int studentId =  new Random().nextInt();
        model.addAttribute("id",studentId);
        List<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        model.addAttribute("numbers",numbers);
        Student student = new Student(1,"Mike","Smith");
        model.addAttribute("student",student);
        return "/student/welcome";
    }
}
