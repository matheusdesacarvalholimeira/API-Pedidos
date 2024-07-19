package com.api.restaurante.back_andRestaurante.controller.service;

import com.api.restaurante.back_andRestaurante.model.Cardapio;
import com.api.restaurante.back_andRestaurante.repositorys.CardapioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class CardapioService {


    @Autowired
    CardapioRepository cardapioRepository;

    public void cadastrarintens(String namePoduct, int quantidade, boolean disponibilidade, float preco){
        Cardapio cardapio = new Cardapio();
        cardapio.setNamePoduct(namePoduct);
        cardapio.setPreco(preco);
        cardapio.setQuantidade(quantidade);
        cardapio.setDisponibilidade(disponibilidade);
        cardapioRepository.save(cardapio);
    }

    public List<Cardapio> getcardapio(){

        List<Cardapio> cardapioList = cardapioRepository.findAll();
        return cardapioList;
    }

    public void updateCardapio(UUID idCardapio, String namePoduct, int quantidade, boolean disponibilidade, float preco){
        Cardapio cardapio = cardapioRepository.findById(idCardapio).orElseThrow(()-> new RuntimeException("Itens not found"));
        cardapio.setNamePoduct(namePoduct);
        cardapio.setPreco(preco);
        cardapio.setQuantidade(quantidade);
        cardapio.setDisponibilidade(disponibilidade);
        cardapioRepository.save(cardapio);
    }

    public Cardapio getOneIten(UUID idCardapio){
        Cardapio iten = cardapioRepository.findById(idCardapio).orElseThrow(() -> new  RuntimeException("Itens not found"));
        return iten;
    }

    //public void deletCardapio(UUID idCardapio){

        //Cardapio cardapio = cardapioRepository.findById(idCardapio).orElseThrow(()-> new RuntimeException("Itens not found"));
       // cardapioRepository.delete(cardapio);
    //}

}
