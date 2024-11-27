package org.example;

import jakarta.persistence.*;

@Entity
@Table(name = "produtos")
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_produto")
    Integer id;
    @Column(name = "nome_produto")
    String nome;
    @Column(name = "preco" )
    Double preco;
    @Column(name = "quantidade")
    Double quantidade;

    public Produto(String nome, double preco, Double quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public Produto(Integer id, String nome, double preco, Double quantidade) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    public Produto() {
    }
}
