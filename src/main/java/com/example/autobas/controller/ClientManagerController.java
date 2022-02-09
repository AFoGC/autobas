package com.example.autobas.controller;

import com.example.autobas.service.ClientsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ClientManagerController {

    private final ClientsService clientsService;

    @Autowired
    public ClientManagerController(ClientsService clientsService) {
        this.clientsService = clientsService;
    }

    @GetMapping("/create-client")
    public String getAllProduct(Model model){

        model.addAttribute("allClients", clientsService.getClientsList());

        return "administration/clients/clients_manager";
    }

    @PostMapping("saveClient")
    public String saveClient(@RequestParam(value = "email") String name,
                             @RequestParam(value = "first_name") String firstName,
                             @RequestParam(value = "last_name") String lastName,
                             @RequestParam(value = "password") String password
                             ){
        clientsService.saveClient(name, firstName, lastName);

        return "redirect:/create-client";
    }

    @PostMapping("deleteClient")
    public String deleteClient(@RequestParam(value = "id") Long id){
        clientsService.deleteClient(id);
        return "redirect:/create-client";
    }

    @PostMapping("deleteAllClients")
    public String deleteClients(){
        clientsService.deleteAll();
        return "redirect:/create-client";
    }
}
