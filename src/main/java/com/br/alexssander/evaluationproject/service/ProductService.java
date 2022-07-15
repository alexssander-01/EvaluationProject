package com.br.alexssander.evaluationproject.service;

import com.br.alexssander.evaluationproject.model.Product;

import java.util.List;

public interface ProductService {
    Product saveProdutc(Product product);
    List<Product> getAllProducts();
    Product getProductById(Integer id);
    Product updateProduct(Product product,Integer id);
    void deleteProduct(Integer id);
}
