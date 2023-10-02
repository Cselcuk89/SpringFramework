package org.selcuk.spring08springmvcmodel.controller;

import org.selcuk.spring08springmvcmodel.enums.Gender;
import org.selcuk.spring08springmvcmodel.model.Mentor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
@Controller
@RequestMapping("/another")
public class AnotherController {
    @RequestMapping("/list") // localhost:8080/another/list
    public String modelPage(Model model){
        List<Mentor> mentorList = new ArrayList<>();
        mentorList.add(new Mentor("Mike","Smith",45, Gender.MALE));
        mentorList.add(new Mentor("Tom","Hanks",65, Gender.MALE));
        mentorList.add(new Mentor("Amy","Bryan",25, Gender.FEMALE));
        model.addAttribute("mentors",mentorList);
        return "/templates/mentor/mentor-list";// create the indicated path of view
    }
}
