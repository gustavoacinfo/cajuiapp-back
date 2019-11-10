/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.ifnmg.cajuiapp.basico.resources;

import com.br.ifnmg.cajuiapp.basico.models.Estado;
import com.br.ifnmg.cajuiapp.basico.repository.EstadoRepository;
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
@RequestMapping("/estado")
public class EstadoResource {
    
    @Autowired
    private EstadoRepository er;
    
    @GetMapping(produces="application/json")
    public @ResponseBody Iterable listaEstados(){
        Iterable<Estado> listaEstados = er.findAll();
        return listaEstados;
    }
    
    
    
}
