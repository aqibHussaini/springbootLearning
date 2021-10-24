package com.learning.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class HomeController {
    @GetMapping("/home/{name}")
    public String Home(Model model,@PathVariable String Name) {
        return "home.html";
    }
}
