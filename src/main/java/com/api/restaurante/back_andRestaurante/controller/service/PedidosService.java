package com.api.restaurante.back_andRestaurante.controller.service;

import com.api.restaurante.back_andRestaurante.model.Cardapio;
import com.api.restaurante.back_andRestaurante.model.Pedidos;
import com.api.restaurante.back_andRestaurante.model.UserClient;
import com.api.restaurante.back_andRestaurante.model.endereco.EnderecoClient;
import com.api.restaurante.back_andRestaurante.repositorys.CardapioRepository;
import com.api.restaurante.back_andRestaurante.repositorys.PedidosRepository;
import com.api.restaurante.back_andRestaurante.repositorys.UserClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.UUID;

@Service
public class PedidosService {

    @Autowired
    private PedidosRepository pedidosRepository;

    @Autowired
    private CardapioRepository cardapioRepository;

    @Autowired
    private UserClientRepository userClientRepository;

    public void addPedidos(UUID idProduto, UUID idUser, EnderecoClient endereco, LocalDateTime dateTime){

        Cardapio cardapio = cardapioRepository.findById(idProduto)
                .orElseThrow(() -> new RuntimeException("Itens not found"));
        UserClient userClient = userClientRepository.findById(idUser)
                .orElseThrow(() -> new RuntimeException("Client not found"));
        Pedidos pedidos = new Pedidos();
        pedidos.setIdProduto(cardapio);
        pedidos.setIdUser(userClient);
        pedidos.setEndereco(endereco);
        pedidos.setDateTime(dateTime);
        pedidosRepository.save(pedidos);
    }

}
