package com.br.alexssander.evaluationproject.service.impl;

import com.br.alexssander.evaluationproject.exception.ResourceNotFoundException;
import com.br.alexssander.evaluationproject.model.Client;
import com.br.alexssander.evaluationproject.repository.ClientRepository;
import com.br.alexssander.evaluationproject.service.ClientService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {
    private final ClientRepository clientRepository;

    public ClientServiceImpl(ClientRepository clientRepository){
        super();
        this.clientRepository = clientRepository;
    }

    @Override
    public Client saveClient(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }

    @Override
    public Client getClientById(Integer id) {
//        Optional<Client> client = clientRepository.findById(id);
//        if(client.isPresent()){
//            return client.get();
//        }else{
//            throw new ResourceNotFoundException("Client","Id",id);
//        }
        return clientRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Client","Id",id));
    }

    @Override
    public Client updateClient(Client client, Integer id) {
        Client existingClient = clientRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Client","Id",id));

        existingClient.setNameClient(client.getNameClient());
        existingClient.setEmailClient(client.getEmailClient());
        existingClient.setBirthDateClient(client.getBirthDateClient());

        clientRepository.save(existingClient);
        return existingClient;
    }

    @Override
    public void deleteClient(Integer id) {
        clientRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Client","Id",id));
        clientRepository.deleteById(id);
    }
}
