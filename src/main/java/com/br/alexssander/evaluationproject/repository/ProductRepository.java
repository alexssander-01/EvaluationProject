package com.br.alexssander.evaluationproject.repository;

import com.br.alexssander.evaluationproject.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
}