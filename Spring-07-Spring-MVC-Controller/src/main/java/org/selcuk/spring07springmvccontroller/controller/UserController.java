package org.selcuk.spring07springmvccontroller.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    @RequestMapping("/user")
    public String user(){
        return "/user/userinfo.html"; // we need to indicate the correct path of the html file to display the view
    }
}
