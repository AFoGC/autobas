package com.example.autobas.controller;

import com.example.autobas.service.CityService;
import com.example.autobas.service.RoadService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RoadManagerController {

    private final RoadService roadService;

    public RoadManagerController( RoadService roadService) {
        this.roadService = roadService;
    }

    @GetMapping("/road-manager")
    public String getRoadList(Model model){
        model.addAttribute("allRoads", roadService.getAllRoads());
        return "administration/road_manager";
    }


    @PostMapping("saveRoad")
    public String saveRoad(@RequestParam(value = "range") String range,
                           @RequestParam(value = "city_from") String city_from,
                           @RequestParam(value = "city_to") String city_to){


        roadService.saveRoad(Integer.parseInt(range), Long.parseLong(city_to), Long.parseLong(city_from));


        return "redirect:/road-manager";
    }
}
