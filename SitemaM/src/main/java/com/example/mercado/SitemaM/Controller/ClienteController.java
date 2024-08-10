package com.example.mercado.SitemaM.Controller;

import com.example.mercado.SitemaM.Repository.ClienteRepository;
import com.example.mercado.SitemaM.model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    private final ClienteRepository clienteRepository;

    @Autowired
    public ClienteController(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    // Métodos CRUD semelhantes aos do exemplo anterior
    @GetMapping
    public List<Cliente> getAllClientes() {
        return clienteRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<Cliente> createCliente(@RequestBody Cliente cliente) {
        Cliente savedCliente = clienteRepository.save(cliente);
        return new ResponseEntity<>(savedCliente, HttpStatus.CREATED);
    }

    // Outros métodos conforme necessário
}
