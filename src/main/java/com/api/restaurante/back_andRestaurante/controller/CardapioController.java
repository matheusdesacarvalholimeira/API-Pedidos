package com.api.restaurante.back_andRestaurante.controller;

import com.api.restaurante.back_andRestaurante.controller.dto.addIntensDTO;
import com.api.restaurante.back_andRestaurante.controller.dto.updateIntensDTO;
import com.api.restaurante.back_andRestaurante.controller.service.CardapioService;
import com.api.restaurante.back_andRestaurante.model.Cardapio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/cardapio")
public class CardapioController {

    @Autowired
    CardapioService cardapioService;

    //@PostMapping("/addIntens")
    //public ResponseEntity<String> addIntens(@RequestBody addIntensDTO body){
       // cardapioService.cadastrarintens(body.namePoduct(), body.quantidade(), body.disponibilidade(), body.preco());
       // return ResponseEntity.ok().body("Confia que criou");
    //}

    @GetMapping("/getIntens")
    public ResponseEntity<List<Cardapio>> listIntens(){
        return ResponseEntity.ok().body(cardapioService.getcardapio());
    }

    //@PutMapping("/updateIntens/{idCardapio}")
    //public ResponseEntity<String> updateintens(@PathVariable(value = "idCardapio") UUID idCardapio, @RequestBody updateIntensDTO body){
        //cardapioService.updateCardapio(idCardapio ,body.namePoduct(), body.quantidade(), body.disponibilidade(), body.preco());
        //return ResponseEntity.ok().body("mudo");
    //}

}
