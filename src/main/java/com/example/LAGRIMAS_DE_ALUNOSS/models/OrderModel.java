package com.example.LAGRIMAS_DE_ALUNOSS.models;


import jakarta.persistence.*;

import java.util.List;

@Entity
@Table

public class OrderModel {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String nome;
private String endereco;

@OneToMany
private List<PedidoModel> pedidos;

    public OrderModel() {
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
