package com.myraidlearning.springbootmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WelcomeRestController {

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String showWelcomeMessage(){
            return "welcome";
    }
}
