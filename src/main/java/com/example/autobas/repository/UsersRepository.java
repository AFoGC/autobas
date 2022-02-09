package com.example.autobas.repository;

import com.example.autobas.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long> {

    List<Users> findAllByUsername(String login);

    Users findByUsername(String username);
}
