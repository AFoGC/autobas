package com.example.autobas.service;

import com.example.autobas.entity.Users;
import com.example.autobas.repository.UsersRepository;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class UsersServiceTest {
    @Autowired
    private UsersService usersService;

    @MockBean
    private UsersRepository usersRepository;

    @MockBean
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Test
    void saveUser() {
        Users user = new Users();

        boolean isUserCreated = usersService.saveUser(user);

        Assert.assertTrue("User was saved", isUserCreated);
        if(isUserCreated){
            System.out.println("User was saved");
        }
    }
}