package com.example.mercado.SitemaM.Repository;

import com.example.mercado.SitemaM.model.Estoque;
import com.example.mercado.SitemaM.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstoqueRepository extends JpaRepository<Estoque, Long> {
}