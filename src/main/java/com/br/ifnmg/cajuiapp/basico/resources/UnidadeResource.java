/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.ifnmg.cajuiapp.basico.resources;

import com.br.ifnmg.cajuiapp.basico.models.Unidade;
import com.br.ifnmg.cajuiapp.basico.repository.UnidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Gustavo
 */

@RestController
@RequestMapping("/unidade")
public class UnidadeResource {
    
    @Autowired
    private UnidadeRepository er;
    
    @GetMapping(produces="application/json")
    public @ResponseBody Iterable listaUnidades(){
        Iterable<Unidade> listaUnidades = er.findAll();
        return listaUnidades;
    }
    
}
