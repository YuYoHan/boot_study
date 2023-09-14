package com.example.study01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ThymeleafController {
    @GetMapping("/thymeleaf/ex1")
    public String ex1(Model model) {
        model.addAttribute("data", "시작합니다.");
        return "thymeleaf/ex1";
    }
}
