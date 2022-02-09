package com.example.autobas;

import com.example.autobas.entity.Car;
import com.example.autobas.service.RolesService;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AutobApplicationTests {



    @Test
    void contextLoads() {
        Car car = new Car();

        Assert.assertEquals(false, car.isInExploitation());
    }

    @Test
    void testRoles(){

        //final RolesService rolesService;
        //Assert.assertEquals("USER", rolesService.getRole(1L).getName());
        //Assert.assertEquals("ADMIN", rolesService.getRole(2L).getName());
    }

}
