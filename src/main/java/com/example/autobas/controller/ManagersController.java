package com.example.autobas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ManagersController {

    @GetMapping("/category-manager")
    public String getCountryAdmin(Model model){
        return "administration/category_manager";
    }
}
