package com.example.autobas.service;

import com.example.autobas.entity.locations.Country;
import com.example.autobas.repository.ClientsRepository;
import com.example.autobas.repository.CountryRepository;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class CountryServiceTest {

    @MockBean
    private CountryRepository countryRepository;

    @Autowired
    private CountryService countryService;

    @Test
    void getCountry() {

        Country country = new Country();
        country.setId(1L);
        country.setName("Germany");

        Country found = countryService.getCountry(1L);

        Assert.assertEquals("Germany", found.getName());
    }

    @Test
    void saveCountry() {

        Country country = new Country();
        country.setId(1L);
        country.setName("Germany");

        boolean isSaved = countryService.saveCountry("Ger", true);

        Assert.assertTrue("Country was saved", isSaved);
        if(isSaved){
            System.out.println("Country was saved");
        }
    }

}