package com.example.autobas.service;


import com.example.autobas.entity.Role;
import com.example.autobas.entity.Users;
import com.example.autobas.repository.RolesRepository;
import com.example.autobas.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Collections;
import java.util.List;

@Service
public class UsersService implements UserDetailsService {

    @PersistenceContext
    private EntityManager em;

    @Autowired
    RolesRepository roleRepository;

    @Autowired
    UsersRepository userRepository;

    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;

    public boolean getUsersFromDB(Users users){
        boolean logic = false;

        List<Users> usersList = userRepository.findAllByUsername(users.getUsername());
        if(!usersList.isEmpty()) logic = true;

        return logic;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Users user = userRepository.findByUsername(username);

        if (user == null) {
            throw new UsernameNotFoundException("User not found");
        }
        return user;
    }

    public boolean saveUser(Users user) {
        Users userFromDB = userRepository.findByUsername(user.getUsername());

        if (userFromDB != null) {
            return false; }

        user.setRoles(Collections.singleton(new Role(1L, "ROLE_USER")));
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        userRepository.save(user);

        return true;
    }
}
