package com.example.mercado.SitemaM.model;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Cliente {
    public class Pessoa {
        private String nome;
        private String endereco;
        private String contato;

        public Pessoa(String nome, String endereco, String contato) {
            this.nome = nome;
            this.endereco = endereco;
            this.contato = contato;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getEndereco() {
            return endereco;
        }

        public void setEndereco(String endereco) {
            this.endereco = endereco;
        }

        public String getContato() {
            return contato;
        }

        public void setContato(String contato) {
            this.contato = contato;
        }
    }
    @RestController
    public class Clientela extends Pessoa {
        private int fidelidadePontos;

        public Clientela(String nome, String endereco, String contato, int fidelidadePontos) {
            super(nome, endereco, contato);
            this.fidelidadePontos = fidelidadePontos;
        }
    }
    @RestController
    public class Fornecedor extends Pessoa {
        private List<Product> produtosFornecidos;

        public Fornecedor(String nome, String endereco, String contato, List<Product> produtosFornecidos) {
            super(nome, endereco, contato);
            this.produtosFornecidos = produtosFornecidos;
        }
    }

    public class Funcionario extends Pessoa {
        private String cargo;

        public Funcionario(String nome, String endereco, String contato, String cargo) {
            super(nome, endereco, contato);
            this.cargo = cargo;
        }
    }
}
