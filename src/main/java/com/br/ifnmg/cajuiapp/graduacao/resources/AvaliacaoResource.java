/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.ifnmg.cajuiapp.graduacao.resources;

import com.br.ifnmg.cajuiapp.graduacao.models.Avaliacao;
import com.br.ifnmg.cajuiapp.graduacao.repository.AvaliacaoRepository;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Gustavo
 */
@CrossOrigin
@RestController
@RequestMapping("/avaliacao")
public class AvaliacaoResource {
    
    @Autowired
    private AvaliacaoRepository er;
    
    @GetMapping(produces="application/json")
    public @ResponseBody Iterable listaAvaliacoes(){
        Iterable<Avaliacao> listaAvaliacoes = er.findAll();
        return listaAvaliacoes;
    }
    
    @GetMapping(produces="application/json", value="/oferta/{id}")
    public @ResponseBody Iterable listaAvaliacaoDaOferta(@PathVariable("id") Integer id){
        Iterable<Avaliacao> listaAvaliacaoDaOferta = er.listarAvaliacaoDaOferta(id);
        return listaAvaliacaoDaOferta;
    }
    
    @GetMapping(produces="application/json", value="/distribuidos/{id}") 
    public @ResponseBody Iterable somaPontosDistribuidos(@PathVariable("id") Integer id){ 
        Iterable<Integer> somaPontosDistribuidos = er.somaPontosDistribuidos(id); 
        return somaPontosDistribuidos;
    }
    
    @PostMapping()
    public Avaliacao cadastrarAvaliacao(@RequestBody @Valid Avaliacao avaliacao){
        return er.save(avaliacao);
    }
    
    @PutMapping()
    public Avaliacao atualizarAvaliacao(@RequestBody @Valid Avaliacao avaliacao){
        return er.save(avaliacao);
    }
    
    @DeleteMapping()
    public Avaliacao deletaAvaliacao(@RequestBody Avaliacao avaliacao){
        er.delete(avaliacao);
        return avaliacao;
    }
    
}
