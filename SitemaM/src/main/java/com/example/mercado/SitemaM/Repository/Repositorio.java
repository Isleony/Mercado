package com.example.mercado.SitemaM.Repository;

import com.example.mercado.SitemaM.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class Repositorio {
    public interface ProductRepository extends JpaRepository<Product, Long> {
        List<Product> findByName(String name);

        // Exemplo: Buscar produtos por categoria
        List<Product> findByCategory(String category);
    }

}
