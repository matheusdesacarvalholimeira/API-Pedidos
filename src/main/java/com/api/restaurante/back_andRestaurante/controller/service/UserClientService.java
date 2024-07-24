package com.api.restaurante.back_andRestaurante.controller.service;

import com.api.restaurante.back_andRestaurante.model.Cardapio;
import com.api.restaurante.back_andRestaurante.model.UserClient;
import com.api.restaurante.back_andRestaurante.repositorys.UserClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserClientService {

    @Autowired
    private UserClientRepository userClientRepository;

    public void addClient(String name, String email, String password){
        if(userClientRepository.findByEmail(email) != null) ResponseEntity.badRequest().build();
        UserClient userClient = new UserClient();
        userClient.setName(name);
        userClient.setEmail(email);
        userClient.setPasswoed(new BCryptPasswordEncoder().encode(password));
        userClientRepository.save(userClient);
    }

    public void updateCardapio(UUID idCardapio, String name, String email, String password){
       UserClient userClient = userClientRepository.findById(idCardapio).orElseThrow(()->new RuntimeException("Itens not found"));
       userClient.setName(name);
       userClient.setEmail(email);
       userClient.setPasswoed(password);
       userClientRepository.save(userClient);
    }


}
