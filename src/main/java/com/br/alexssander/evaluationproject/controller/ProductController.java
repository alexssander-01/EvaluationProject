package com.br.alexssander.evaluationproject.controller;

import com.br.alexssander.evaluationproject.model.Product;
import com.br.alexssander.evaluationproject.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        super();
        this.productService = productService;
    }
    @PostMapping("/product")
    public ResponseEntity<Product> saveProduct(@RequestBody Product product){
        return new ResponseEntity<>(productService.saveProdutc(product), HttpStatus.CREATED);
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