package com.api.restaurante.back_andRestaurante.repositorys;

import com.api.restaurante.back_andRestaurante.model.UserClient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Optional;
import java.util.UUID;

public interface UserClientRepository extends JpaRepository<UserClient, UUID> {
    UserDetails findByEmail(String email);
}
