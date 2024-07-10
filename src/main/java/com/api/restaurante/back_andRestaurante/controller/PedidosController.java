package com.api.restaurante.back_andRestaurante.controller;

import com.api.restaurante.back_andRestaurante.controller.dto.addPedidoDTO;
import com.api.restaurante.back_andRestaurante.controller.service.PedidosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pedidos")
public class PedidosController {

    @Autowired
    private PedidosService pedidosService;

    @PostMapping("/cad")
    public ResponseEntity<String> addPedidos(@RequestBody addPedidoDTO body){
        pedidosService.addPedidos(body.idProduto(), body.idUser(), body.endereco(), body.dateTime());
        return ResponseEntity.ok().body("pedido feito");
    }

}
