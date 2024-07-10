package com.api.restaurante.back_andRestaurante.repositorys;

import com.api.restaurante.back_andRestaurante.model.Cardapio;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CardapioRepository extends JpaRepository<Cardapio, UUID> {
}
