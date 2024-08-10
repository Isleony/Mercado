package com.example.mercado.SitemaM.Controller;
import com.example.mercado.SitemaM.Repository.CalendarioRepository;
import com.example.mercado.SitemaM.model.Calendario;
import com.example.mercado.SitemaM.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
    @RequestMapping("/calendario")
    public class CalendarioController {

        private final CalendarioRepository calendarioRepository;

        @Autowired
        public CalendarioController(CalendarioRepository calendarioRepository) {
            this.calendarioRepository = calendarioRepository;
        }

        // Métodos CRUD semelhantes aos do exemplo anterior
        @GetMapping
        public List<Product> getAllCalendarios() {
            return calendarioRepository.findAll();
        }

        @PostMapping
        public ResponseEntity<Calendario> createCalendario(@RequestBody Calendario calendario) {
            Calendario savedCalendario = (Calendario) calendarioRepository.save(calendario);
            return new ResponseEntity<>(savedCalendario, HttpStatus.CREATED);
        }

        // Outros métodos conforme necessário
    }


