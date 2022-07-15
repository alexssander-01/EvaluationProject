package com.br.alexssander.evaluationproject.controller;

import com.br.alexssander.evaluationproject.model.Client;
import com.br.alexssander.evaluationproject.model.Product;
import com.br.alexssander.evaluationproject.service.ClientService;
import com.br.alexssander.evaluationproject.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ApiController {
    private final ClientService clientService;
    private final ProductService productService;
    public ApiController(ClientService clientService,ProductService productService){
        super();
        this.clientService = clientService;
        this.productService = productService;
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
    @PostMapping("/product")
    public ResponseEntity<Product> saveProduct(@RequestBody Product product){
        return new ResponseEntity<>(productService.saveProdutc(product),HttpStatus.CREATED);
    }
    @GetMapping("/product")
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }
    @GetMapping("/product/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable("id") Integer id){
        return new ResponseEntity<>(productService.getProductById(id),HttpStatus.OK);
    }
    @PutMapping("/product/{id}")
    public ResponseEntity<Product> updateProduct(@PathVariable("id") Integer id,@RequestBody Product product){
        return new ResponseEntity<>(productService.updateProduct(product,id),HttpStatus.OK);
    }
    @DeleteMapping("/product/{id}")
    public ResponseEntity<String> deleteProduct(@PathVariable("id")Integer id){
        productService.deleteProduct(id);
        return new ResponseEntity<>("Produnt deleted successfully!",HttpStatus.OK);
    }
}
