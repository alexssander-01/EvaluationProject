package com.br.alexssander.evaluationproject.controller;

import com.br.alexssander.evaluationproject.model.Client;
import com.br.alexssander.evaluationproject.service.ClientService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class ClientController {
    private final ClientService clientService;

    public ClientController(ClientService clientService){
        super();
        this.clientService = clientService;
    }
    @PostMapping("/client")
    public ResponseEntity<Client> saveClient(@RequestBody Client client){
        return new ResponseEntity<>(clientService.saveClient(client), HttpStatus.CREATED);
    }
    @GetMapping("/client")
    public List<Client> getAllClients(){
        return clientService.getAllClients();
    }
    @GetMapping("/client/{id}")
    public ResponseEntity<Client> getClientById(@PathVariable("id") Integer clientId){
        return new ResponseEntity<>(clientService.getClientById(clientId),HttpStatus.OK);
    }
    @PutMapping("/client/{id}")
    public ResponseEntity<Client> updateClient(@PathVariable("id") Integer clientId,@RequestBody Client client){
        return new ResponseEntity<>(clientService.updateClient(client,clientId),HttpStatus.OK);
    }
    @DeleteMapping("/client/{id}")
    public ResponseEntity<String> deleteClient(@PathVariable("id") Integer id){
        clientService.deleteClient(id);
        return new ResponseEntity<>("Client deleted successfully!",HttpStatus.OK);
    }
}