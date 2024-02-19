package com.application.rest.SpringBootRest.services;

import com.application.rest.SpringBootRest.entities.Client;
import com.application.rest.SpringBootRest.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService implements BaseService<Client> {

    @Autowired
    private ClientRepository clientRepository;

    public ClientService (ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }


    @Override
    public List<Client> findAll() throws Exception {
        return null;
    }

    @Override
    public Client findById(Long id) throws Exception {
        return null;
    }

    @Override
    public Client save(Client entity) throws Exception {
        return null;
    }

    @Override
    public Client update(Long id, Client entity) throws Exception {
        return null;
    }

    @Override
    public boolean delete(Long id) throws Exception {
        return false;
    }
}
