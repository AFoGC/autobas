package com.example.autobas.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class ConfigMVC implements WebMvcConfigurer {


    @Override
    public void addViewControllers(ViewControllerRegistry registry){
        registry.addViewController("/").setViewName("index");
        registry.addViewController("/administration/country").setViewName("administration/country/country_list");
        registry.addViewController("/login").setViewName("login");
        registry.addViewController("/city-manager").setViewName("administration/cities_manager");
        //registry.addViewController("/registration").setViewName("registration");
    }
}
