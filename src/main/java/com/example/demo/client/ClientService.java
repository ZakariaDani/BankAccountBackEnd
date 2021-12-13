package com.example.demo.client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service //class has been instantiated
public class ClientService {
    private final ClientRepository clientRepository;
    @Autowired
    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public List<Client> getClients() {
        return clientRepository.findAll();
    }
    public Optional<Client> getById(long id) {
        if(!clientRepository.existsById(id)) throw new IllegalStateException("Client with id "+id+" doesnt exists!");
        else
            return clientRepository.findById(id);
    }
    public void addNewClient(Client client) {
        Optional<Client> clientOptional = clientRepository.findClientByCin(client.getCin());
        if (clientOptional.isPresent()) {
            throw new IllegalStateException("ce client est déjà inscrit");
        }
        clientRepository.save(client);
    }

}
