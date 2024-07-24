package com.api.restaurante.back_andRestaurante.controller;

import com.api.restaurante.back_andRestaurante.controller.dto.AuthenticationDTO;
import com.api.restaurante.back_andRestaurante.controller.dto.LoginResponseDTO;
import com.api.restaurante.back_andRestaurante.controller.service.TokenService;
import com.api.restaurante.back_andRestaurante.model.UserClient;
import com.api.restaurante.back_andRestaurante.repositorys.LoginRepository;
import com.api.restaurante.back_andRestaurante.repositorys.UserClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import jakarta.validation.Valid;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("auth")
public class AuthenticationController {
    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private LoginRepository repository;
    @Autowired
    private TokenService tokenService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostMapping("/login")
    public ResponseEntity<LoginResponseDTO> login(@RequestBody @Valid AuthenticationDTO data) {
        UserClient user = repository.findByEmail(data.email());
        if (user == null) {
            // User not found, return an appropriate response
            return ResponseEntity.badRequest().build();
        }

        if (!passwordEncoder.matches(data.password(), user.getPasswoed())) {
            // Invalid password, return an appropriate response
            return ResponseEntity.badRequest().build();
        }

        String token = tokenService.generateToken(user);
        return ResponseEntity.ok(new LoginResponseDTO(token));
    }

}
