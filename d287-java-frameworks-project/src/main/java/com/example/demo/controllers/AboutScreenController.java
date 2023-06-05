package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AboutScreenController {
    @GetMapping("/about")
    public String showAboutPage() {
        return "about";
    }
}
