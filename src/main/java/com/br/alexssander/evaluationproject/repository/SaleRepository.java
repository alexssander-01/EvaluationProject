package com.br.alexssander.evaluationproject.repository;

import com.br.alexssander.evaluationproject.model.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleRepository extends JpaRepository<Sale,Integer> {
}