package com.example.autobas.controller;


import com.example.autobas.service.CityService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.persistence.Convert;

@Controller
public class CityManagerController {

    private final CityService cityService;

    public CityManagerController(CityService cityService) {
        this.cityService = cityService;
    }

    @GetMapping("/city-manager")
    public String getCityList(Model model){
        model.addAttribute("allCities", cityService.getAllCities());
        return "administration/cities_manager";
    }


    @PostMapping("saveCity")
    public String saveCity(@RequestParam(value = "name") String name,
                           @RequestParam(value = "country") String country){


        cityService.saveCity(name, Long.parseLong(country));


        return "redirect:/city-manager";
    }
}
