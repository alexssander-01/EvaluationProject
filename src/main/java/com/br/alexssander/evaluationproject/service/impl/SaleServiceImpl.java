package com.br.alexssander.evaluationproject.service.impl;

import com.br.alexssander.evaluationproject.model.Sale;
import com.br.alexssander.evaluationproject.repository.SaleRepository;
import com.br.alexssander.evaluationproject.service.SaleService;
import org.springframework.stereotype.Service;

@Service
public class SaleServiceImpl implements SaleService {
    private final SaleRepository saleRepository;

    public SaleServiceImpl(SaleRepository saleRepository) {
        this.saleRepository = saleRepository;
    }

    @Override
    public Sale saveSale(Sale sale) {
        return saleRepository.save(sale);
    }
}
