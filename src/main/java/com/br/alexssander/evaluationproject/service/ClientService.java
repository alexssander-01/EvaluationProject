package com.br.alexssander.evaluationproject.service;

import com.br.alexssander.evaluationproject.model.Client;

import java.util.List;

public interface ClientService {
    Client saveClient(Client client);
    List<Client> getAllClients();
    Client getClientById(Integer id);
    Client updateClient(Client client,Integer id);
    void deleteClient(Integer id);
}