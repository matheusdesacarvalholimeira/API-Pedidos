package com.api.restaurante.back_andRestaurante.model;

import jakarta.persistence.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.UUID;

@Table(name = "user-Client")
@Entity
public class UserClient implements UserDetails {

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

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public String getUsername() {
        return null;
    }

    @Override
    public boolean isAccountNonExpired() {
        return UserDetails.super.isAccountNonExpired();
    }

    @Override
    public boolean isAccountNonLocked() {
        return UserDetails.super.isAccountNonLocked();
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return UserDetails.super.isCredentialsNonExpired();
    }

    @Override
    public boolean isEnabled() {
        return UserDetails.super.isEnabled();
    }
}
