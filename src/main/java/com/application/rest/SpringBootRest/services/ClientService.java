package com.application.rest.SpringBootRest.services;

import com.application.rest.SpringBootRest.entities.Client;
import com.application.rest.SpringBootRest.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService implements BaseService<Client> {

    @Autowired
    private ClientRepository clientRepository;

    public ClientService (ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }


    @Override
    public List<Client> findAll() throws Exception {
        try {
            List<Client> clients = clientRepository.findAll();
            return clients;
        }
        catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Client findById(Long id) throws Exception {
        try {
            Optional<Client> clientOptional = clientRepository.findById(id);
            return clientOptional.get();
        }
        catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Client save(Client entity) throws Exception {
        try {
            Client client = clientRepository.save(entity);
            return client;
        }
        catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Client update(Long id, Client entity) throws Exception {
        try {
            Optional<Client> clientOptional = clientRepository.findById(id);
            Client client = clientOptional.get();
            client = clientRepository.save(client);
            return client;
        }
        catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public boolean delete(Long id) throws Exception {
        try {
            if (clientRepository.existsById(id)) {
                clientRepository.deleteById(id);
                return true;
            } else throw new Exception();

        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
