/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.ifnmg.cajuiapp.graduacao.resources;

import com.br.ifnmg.cajuiapp.graduacao.models.PeriodoLetivo;
import com.br.ifnmg.cajuiapp.graduacao.repository.PeriodoLetivoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Gustavo
 */
@CrossOrigin
@RestController
@RequestMapping("/periodoletivo")
public class PeriodoLetivoResource {
    
    @Autowired
    private PeriodoLetivoRepository er;
    
    @GetMapping(produces="application/json")
    public @ResponseBody Iterable listaPeriodosLetivos(){
        Iterable<PeriodoLetivo> listaPeriodosLetivos = er.findAll();
        return listaPeriodosLetivos;
    }
    
}
