package com.example.autobas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminManageController {

    @GetMapping("/")
    private String getHome(Model model) {
        //model.addAttribute("AllCategory", CategoryRepository.findAll());
        return "index";
    }

}
