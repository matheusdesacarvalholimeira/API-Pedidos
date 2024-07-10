package com.api.restaurante.back_andRestaurante.model;

import com.api.restaurante.back_andRestaurante.model.endereco.EnderecoClient;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "pedidos")
public class Pedidos {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID idPedidos;

    @ManyToOne
    @JoinColumn(name = "idProduto")
    private Cardapio idProduto;

    @OneToOne
    @JoinColumn(name = "IdUserClient")
    private UserClient idUser;

    private EnderecoClient endereco;

    private LocalDateTime dateTime;

    public UUID getIdPedidos() {
        return idPedidos;
    }

    public void setIdPedidos(UUID idPedidos) {
        this.idPedidos = idPedidos;
    }

    public Cardapio getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Cardapio idProduto) {
        this.idProduto = idProduto;
    }

    public UserClient getIdUser() {
        return idUser;
    }

    public void setIdUser(UserClient idUser) {
        this.idUser = idUser;
    }

    public EnderecoClient getEndereco() {
        return endereco;
    }

    public void setEndereco(EnderecoClient endereco) {
        this.endereco = endereco;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public Pedidos() {
    }

    public Pedidos(UUID idPedidos, Cardapio idProduto, UserClient idUser, EnderecoClient endereco, LocalDateTime dateTime) {
        this.idPedidos = idPedidos;
        this.idProduto = idProduto;
        this.idUser = idUser;
        this.endereco = endereco;
        this.dateTime = dateTime;
    }
}
