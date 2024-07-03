package com.luis.springboot.webapp.springboot_web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping({"","/","/home", "/index"})
    public String home () {
        return "redirect:/details";
        //return "forward:/details";
    }
}
