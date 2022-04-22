package com.example.springsocial.controller;

import com.example.springsocial.model.Prodotto;
import com.example.springsocial.payload.ProdottoAddRequest;
import com.example.springsocial.repository.ProdottoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProdottoController {

    @Autowired
    private ProdottoRepository prodottoRepository;

    @GetMapping("/prodotti")
    public List<Prodotto> getProdotti() {
        return prodottoRepository.findAll();
    }

    @PostMapping("/prodotto/add")
    public String addProdotto(ProdottoAddRequest prodotto){
        Prodotto p = new Prodotto();
        p.setDescrizione(prodotto.getDescrizione());
        p.setNome(prodotto.getNome());
        prodottoRepository.save(p);
        return "OK";
    }
}
