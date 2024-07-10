package com.api.restaurante.back_andRestaurante.controller.dto;

import com.api.restaurante.back_andRestaurante.model.endereco.EnderecoClient;

import java.time.LocalDateTime;
import java.util.UUID;

public record addPedidoDTO(UUID idProduto, UUID idUser, EnderecoClient endereco, LocalDateTime dateTime) {
}
