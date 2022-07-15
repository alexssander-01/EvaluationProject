package com.br.alexssander.evaluationproject.service.impl;

import com.br.alexssander.evaluationproject.exception.ResourceNotFoundException;
import com.br.alexssander.evaluationproject.model.Product;
import com.br.alexssander.evaluationproject.repository.ProductRepository;
import com.br.alexssander.evaluationproject.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{
    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        super();
        this.productRepository = productRepository;
    }

    @Override
    public Product saveProdutc(Product product) {
        return productRepository.save(product);
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProductById(Integer id) {
        return productRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Product","Id",id));
    }

    @Override
    public Product updateProduct(Product product, Integer id) {
        Product existingProduct = productRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Product","Id",id));

        existingProduct.setNameProduct(product.getNameProduct());
        existingProduct.setDescriptionProduct(product.getDescriptionProduct());
        existingProduct.setPriceProduct(product.getPriceProduct());
        productRepository.save(existingProduct);
        return existingProduct;
    }

    @Override
    public void deleteProduct(Integer id) {
        productRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Produtct","Id",id));
        productRepository.deleteById(id);
    }
}
