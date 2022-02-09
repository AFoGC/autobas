package com.example.autobas.controller;

import com.example.autobas.entity.locations.Country;
import com.example.autobas.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.io.IOError;
import java.io.IOException;

@Controller
public class CountryManagerController {

    private final CountryService countryService;

    @Autowired
    public CountryManagerController(CountryService countryService) {
        this.countryService = countryService;
    }

    @GetMapping("/country-list")
    public String getCountryList(Model model){
        model.addAttribute("allCountries", countryService.getAllCountries());
        return "administration/country/country_list";
    }

    @RequestMapping(
            path = "/saveCountry",
            method = RequestMethod.POST
    )
    public String saveCountry(@RequestParam(value = "name") String name,
                              @RequestParam(defaultValue = "false")  boolean checkbox
                              ){

        countryService.saveCountry(name, checkbox);

        return "redirect:/country-list";
    }

    /*
    @PostMapping("saveCountry")
    public String saveCountry(@RequestParam(value = "name") String name){

        countryService.saveCountry(name, false);


        return "redirect:/country-list";
    }

    @PostMapping("saveEUCountry")
    public String saveEUCountry(@RequestParam(value = "name") String name){

        countryService.saveCountry(name, true);

        return "redirect:/country-list";
    }

     */

}
