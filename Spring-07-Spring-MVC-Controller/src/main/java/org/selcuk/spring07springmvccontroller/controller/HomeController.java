package org.selcuk.spring07springmvccontroller.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // annotate the class with the @controller stereotype annotation
public class HomeController {
    @RequestMapping("/home") // use @RequestMapping annotation to associate the action with a http request
    public String home(){
        return "home.html"; // return the html document name that contains the details we want the browser to display.
    }
    @RequestMapping("/welcome")
    public String home2(){
        return "welcome.html";
    }
}
