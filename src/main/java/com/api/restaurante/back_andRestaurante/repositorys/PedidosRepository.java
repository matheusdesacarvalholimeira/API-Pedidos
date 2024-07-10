package com.api.restaurante.back_andRestaurante.repositorys;

import com.api.restaurante.back_andRestaurante.model.Pedidos;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PedidosRepository extends JpaRepository<Pedidos, UUID> {
}
