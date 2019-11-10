/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.ifnmg.cajuiapp.basico.resources;

import com.br.ifnmg.cajuiapp.basico.models.Cidade;
import com.br.ifnmg.cajuiapp.basico.repository.CidadeRepository;
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
@RequestMapping("/cidade")
public class CidadeResource {
    
    @Autowired
    private CidadeRepository er;
    
    @GetMapping(produces="application/json")
    public @ResponseBody Iterable listaCidades(){
        Iterable<Cidade> listaCidades = er.findAll();
        return listaCidades;
    }
    
    
}
