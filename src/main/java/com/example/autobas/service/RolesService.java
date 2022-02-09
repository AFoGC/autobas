package com.example.autobas.service;

import com.example.autobas.entity.Role;
import com.example.autobas.entity.locations.Country;
import com.example.autobas.repository.RolesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RolesService {

    private final RolesRepository rolesRepository;

    public Role getRole(Long id){
        return rolesRepository.getOne(id);
    }

    public List<Role> getAllRoles(){
        return rolesRepository.findAll();
    }

    @Autowired
    public RolesService(RolesRepository rolesRepository) {
        this.rolesRepository = rolesRepository;
    }
}
