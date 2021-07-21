package com.pluralsight.conference.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class GreetingController {

    @GetMapping("greeting")
    public String greeting(Map<String, Object> model) {
        model.put("message", "Hello Christian");
        return "greeting";
    }
    //When we ask for the URL/greeting the greeting method is called | it will put the "message" in the model
    //then the return line will have the app go look for a .jsp page called greeting (those are the 2 variables we put
    //in our application.properties file
}
