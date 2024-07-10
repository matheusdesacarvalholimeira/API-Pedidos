package com.api.restaurante.back_andRestaurante.model;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "cardapio")
public class Cardapio {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID idProduto;

    private String namePoduct;

    private int quantidade;

    private boolean disponibilidade;

    private float preco;

    public UUID getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(UUID idProduto) {
        this.idProduto = idProduto;
    }

    public String getNamePoduct() {
        return namePoduct;
    }

    public void setNamePoduct(String namePoduct) {
        this.namePoduct = namePoduct;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public boolean isDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public Cardapio() {
    }

    public Cardapio(UUID idProduto, String namePoduct, int quantidade, boolean disponibilidade, float preco) {
        this.idProduto = idProduto;
        this.namePoduct = namePoduct;
        this.quantidade = quantidade;
        this.disponibilidade = disponibilidade;
        this.preco = preco;
    }
}
