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
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Gustavo
 */
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
    
    @GetMapping(produces="application/json", value="/oferta/{id}/prof/{pId}")
    public @ResponseBody Iterable listaAvaliacaoDaOferta(@PathVariable("id") Integer id, @PathVariable("pId") Integer pId){
        Iterable<Avaliacao> listaAvaliacaoDaOferta = er.listarAvaliacaoDaOferta(pId, id);
        return listaAvaliacaoDaOferta;
    }
    
    @GetMapping(produces="application/json", value="/distribuidos/{id}/prof/{pId}") 
    public @ResponseBody Iterable somaPontosDistribuidos(@PathVariable("id") Integer id, @PathVariable("pId") Integer pId){ 
        Iterable<Integer> somaPontosDistribuidos = er.somaPontosDistribuidos(pId, id); 
        return somaPontosDistribuidos;
    }
    
    @PreAuthorize("hasAnyRole('PROFESSOR')")
    @PostMapping()
    public Avaliacao cadastrarAvaliacao(@RequestBody @Valid Avaliacao avaliacao){
        return er.save(avaliacao);
    }
    
    @PreAuthorize("hasAnyRole('PROFESSOR')")
    @PutMapping()
    public Avaliacao atualizarAvaliacao(@RequestBody @Valid Avaliacao avaliacao){
        return er.save(avaliacao);
    }
    
    
    @PreAuthorize("hasAnyRole('PROFESSOR')")
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> deletar(@PathVariable("id") Integer id) {
      Avaliacao avaliacao = er.findById(id);
        if (avaliacao == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        er.delete(avaliacao);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    
}
