/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.ifnmg.cajuiapp.graduacao.resources;

import com.br.ifnmg.cajuiapp.graduacao.models.Curriculo;
import com.br.ifnmg.cajuiapp.graduacao.repository.CurriculoRepository;
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
@RequestMapping("/curriculo")
public class CurriculoResource {
    
    @Autowired
    private CurriculoRepository er;
    
    @GetMapping(produces="application/json")
    public @ResponseBody Iterable listaCurriculos(){
        Iterable<Curriculo> listaCurriculos = er.findAll();
        return listaCurriculos;
    }
    
}
