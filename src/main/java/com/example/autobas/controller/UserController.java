package com.example.autobas.controller;

import com.example.autobas.entity.Clients;
import com.example.autobas.entity.Users;
import com.example.autobas.repository.ClientsRepository;
import com.example.autobas.repository.UsersRepository;
import com.example.autobas.service.UsersService;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class UserController {

    private final UsersService usersService;
    private final UsersRepository usersRepository;
    private final ClientsRepository clientsRepository;


    public UserController(UsersService usersService, UsersRepository usersRepository, ClientsRepository clientsRepository) {
        this.usersService = usersService;
        this.usersRepository = usersRepository;
        this.clientsRepository = clientsRepository;
    }

    @GetMapping("/registration")
    public String getMyNewFormLogin(Model model) {

        model.addAttribute("users", new Users());
        model.addAttribute("clients", new Clients());

        return "registration";
    }

    @PostMapping("registration")
    public String addNewUser(
            @Valid Users users,
            BindingResult bindingResult,
            @Valid Clients clients,
            BindingResult bindingResult1,
            Model model) {

        if (bindingResult.hasErrors()) {
            return "registration";
        }

        if (bindingResult1.hasErrors()) {
            return "registration";
        }

        if (!users.getPassword().equals(users.getPasswordConfirm())) {
            model.addAttribute("passwordError", "Паролі не співпадають");
            return "registration";
        }

        if (usersService.getUsersFromDB(users)) {
            model.addAttribute("userNameError", "Користувач з таким логіном вже існує в БД");
            return "registration";
        }

        usersService.saveUser(users);

        Users user = usersRepository.findByUsername(users.getUsername());


        clients.setUsers(user);
        Clients client = clientsRepository.save(clients);

        return "redirect:/login";
    }
}
