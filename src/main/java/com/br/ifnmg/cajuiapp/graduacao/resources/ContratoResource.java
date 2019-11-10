/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.ifnmg.cajuiapp.graduacao.resources;

import com.br.ifnmg.cajuiapp.graduacao.models.Contrato;
import com.br.ifnmg.cajuiapp.graduacao.repository.ContratoRepository;
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
@RequestMapping("/contrato")
public class ContratoResource {
    
    @Autowired
    private ContratoRepository er;
    
    @GetMapping(produces="application/json")
    public @ResponseBody Iterable listaContratos(){
        Iterable<Contrato> listaContratos = er.findAll();
        return listaContratos;
    }
   
    
}
