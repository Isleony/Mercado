package com.example.mercado.SitemaM.service;

import com.example.mercado.SitemaM.Repository.EstoqueRepository;
import com.example.mercado.SitemaM.Repository.Repositorio;
import com.example.mercado.SitemaM.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private Repositorio.ProductRepository productRepository;

    @Autowired
    private EstoqueRepository estoqueRepository;

    public Product saveProduct(Product product) {
        return product;
    }

    private void getEstoque() {
    }
}
