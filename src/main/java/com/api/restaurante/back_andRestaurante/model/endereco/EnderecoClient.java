package com.api.restaurante.back_andRestaurante.model.endereco;

import jakarta.persistence.Embeddable;

import javax.swing.*;

@Embeddable
public class EnderecoClient {
    private String UF;
    private String cidade;
    private String bairro;
    private String complemeto;
    private int numero;

    public String getUF() {
        return UF;
    }

    public void setUF(String UF) {
        this.UF = UF;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getComplemeto() {
        return complemeto;
    }

    public void setComplemeto(String complemeto) {
        this.complemeto = complemeto;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public EnderecoClient() {
    }

    public EnderecoClient(String UF, String cidade, String bairro, String complemeto, int numero) {
        this.UF = UF;
        this.cidade = cidade;
        this.bairro = bairro;
        this.complemeto = complemeto;
        this.numero = numero;
    }
}
