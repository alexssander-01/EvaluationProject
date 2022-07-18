package com.br.alexssander.evaluationproject.controller;

import com.br.alexssander.evaluationproject.model.Sale;
import com.br.alexssander.evaluationproject.service.ClientService;
import com.br.alexssander.evaluationproject.service.ProductService;
import com.br.alexssander.evaluationproject.service.SaleService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class SaleController {
    private final SaleService saleService;
    private final ClientService clientService;
    private final ProductService productService;

    public SaleController(SaleService saleService, ClientService clientService, ProductService productService) {
        super();
        this.saleService = saleService;
        this.clientService = clientService;
        this.productService = productService;
    }
    @PostMapping("/sale/{client}")
    public ResponseEntity<Sale> saveSale(@PathVariable("client") Integer client, @RequestBody List<Integer> sale){
        System.out.println(sale);
        Sale venda = new Sale();
        venda.setClientSale(clientService.getClientById(client));
        sale.forEach(prod -> venda.addProduct(productService.getProductById(prod)));
        return new ResponseEntity<>(saleService.saveSale(venda), HttpStatus.CREATED);
    }
}
