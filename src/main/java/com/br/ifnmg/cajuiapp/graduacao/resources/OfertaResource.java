/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.ifnmg.cajuiapp.graduacao.resources;

import com.br.ifnmg.cajuiapp.graduacao.models.Oferta;
import com.br.ifnmg.cajuiapp.graduacao.repository.OfertaRepository;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Gustavo
 */
@RestController
@RequestMapping("/oferta")
public class OfertaResource {
    
    @Autowired
    private OfertaRepository er;
    
    @GetMapping(produces="application/json")
    public @ResponseBody Iterable listaOfertas(){
        Iterable<Oferta> listaOfertas = er.findAll();
        return listaOfertas;
    }
    
    @PostMapping()
    public Oferta cadastrarOferta(@RequestBody @Valid Oferta oferta){
        return er.save(oferta);
    }
    
    @DeleteMapping()
    public Oferta deletaOferta(@RequestBody Oferta oferta){
        er.delete(oferta);
        return oferta;
    }
    
}