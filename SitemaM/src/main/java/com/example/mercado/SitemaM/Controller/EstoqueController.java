package com.example.mercado.SitemaM.Controller;
import com.example.mercado.SitemaM.Repository.EstoqueRepository;
import com.example.mercado.SitemaM.model.Estoque;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estoque")
public class EstoqueController {

    private final EstoqueRepository estoqueRepository;

    @Autowired
    public EstoqueController(EstoqueRepository estoqueRepository) {
        this.estoqueRepository = estoqueRepository;
    }

    // Métodos CRUD semelhantes aos do exemplo anterior
    @GetMapping
    public List<Estoque> getAllEstoques() {
        return estoqueRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<Estoque> createEstoque(@RequestBody Estoque estoque) {
        Estoque savedEstoque = estoqueRepository.save(estoque);
        return new ResponseEntity<>(savedEstoque, HttpStatus.CREATED);
    }

    // Outros métodos conforme necessário
}
