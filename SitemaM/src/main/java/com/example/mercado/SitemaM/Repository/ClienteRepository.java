package com.example.mercado.SitemaM.Repository;

import com.example.mercado.SitemaM.model.Cliente;
import com.example.mercado.SitemaM.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}