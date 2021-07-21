package com.pluralsight.conference.controller;

import com.pluralsight.conference.model.Registration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Map;

@Controller
public class RegistrationController {

    @GetMapping("registration")
    public String getRegistration(@ModelAttribute ("registration")Registration registration) {
        return "registration";
    }

    @PostMapping("registration")
    public String addRegistration(@ModelAttribute ("registration")Registration registration) {
        System.out.println("Registration: " + registration.getName());
        return "redirect:registration"; //see below to understand what's going on redirect:
    }

    /* the Post-Redirect-Get pattern is a technique used to help eliminate form resubmission
    the user's Post to the controller does whatever intended action was requested
    before returning the view back to the user it does an internal redirect and issues a GET request back to itself to
    display the page to the user - this makes sure that all variables and state have been cleared so a back button
    then resubmitted is disabled or stopped
     */
    /* it clears out everything */
}
