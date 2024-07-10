package com.api.restaurante.back_andRestaurante.controller;

import com.api.restaurante.back_andRestaurante.controller.dto.UpdateClient;
import com.api.restaurante.back_andRestaurante.controller.dto.addClientDTO;
import com.api.restaurante.back_andRestaurante.controller.service.UserClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/userclient")
public class UserClientController {

    @Autowired
    private UserClientService userClientService;

    @PostMapping("/addClient")
    public ResponseEntity<String> addClient(@RequestBody addClientDTO body){
        userClientService.addClient(body.name(), body.email(), body.password());
    return ResponseEntity.accepted().body("Creatad Client");
    }

    @PutMapping("/updateClient/{IdUserClient}")
    public ResponseEntity<String> updateClient(@PathVariable(value = "IdUserClient")UUID IdUserClient, @RequestBody UpdateClient body){
        userClientService.updateCardapio(IdUserClient, body.name(), body.email(), body.password());
        return ResponseEntity.ok().body("Update Corret");
    }

}
