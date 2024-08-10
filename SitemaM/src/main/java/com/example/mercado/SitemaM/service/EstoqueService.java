package com.example.mercado.SitemaM.service;

import com.example.mercado.SitemaM.Repository.Repositorio;
import com.example.mercado.SitemaM.model.Product;
import lombok.Getter;
import lombok.Setter;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
    @Getter
    @Setter
    @RequiredArgsConstructor
    @Service
    public class EstoqueService {


    private final Repositorio.ProductRepository productRepository;


    public Product createProduct(Product product) {
        log.info("Creating a new product");
        return productRepository.save(product);
    }

    public Product getProductById(Long id) {
        log.info("Getting a product by id");
        return productRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Product not found with id :" + id));
    }

    public Product updateProduct(Product product) {
        log.info("Updating a product");
        Product existingProduct = getProductById(product.getId());
        existingProduct.setName(product.getName());
        existingProduct.setPrice(product.getPrice());
        existingProduct.setCategory(product.getCategory());
        return productRepository.save(existingProduct);
    }

    public void deleteProduct(Long id) {
        log.info("Deleting a product");
        Product existingProduct = getProductById(id);
        productRepository.delete(existingProduct);
    }



    public List<Product> getAllProducts() {
        log.info("Getting all products");
        return productRepository.findAll();
    }

}
