package com.engim.lezione12.es_mvc.controller;

import com.engim.lezione12.es_mvc.model.ArrayListSpesaRepository;
import com.engim.lezione12.es_mvc.model.SpesaRepository;

public class ListaSpesaController {

    private SpesaRepository spesaRepository;
    public ListaSpesaController(){
        spesaRepository = ArrayListSpesaRepository.getInstance();
    }

}
