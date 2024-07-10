package com.api.restaurante.back_andRestaurante.model;

import jakarta.persistence.*;

import java.util.UUID;

@Table(name = "user-Client")
@Entity
public class UserClient {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID IdUserClient;

    private String name;

    private String email;

    private String passwoed;

    public UUID getIdUserClient() {
        return IdUserClient;
    }

    public void setIdUserClient(UUID idUserClient) {
        IdUserClient = idUserClient;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasswoed() {
        return passwoed;
    }

    public void setPasswoed(String passwoed) {
        this.passwoed = passwoed;
    }

    public UserClient() {
    }

    public UserClient(UUID idUserClient, String name, String email, String passwoed) {
        IdUserClient = idUserClient;
        this.name = name;
        this.email = email;
        this.passwoed = passwoed;
    }
}
