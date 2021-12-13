package com.example.demo.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:19006/")
@RestController
@RequestMapping(path = "api/bank")
public class ClientController {
    private final ClientService clientService;
    @Autowired //for the problem of that we dont have an instance of clientService
    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping(path = "/Clients")
    public List<Client> getClients() {
        return clientService.getClients();
    }

    @PostMapping
    public void registerNewClient(@RequestBody Client client) {
        this.clientService.addNewClient(client);
    }
    @GetMapping(path = "/Clients/{ClientId}")
    public Optional<Client> getById(@PathVariable("ClientId") long ClientID) {
        return this.clientService.getById(ClientID);
    }
}
