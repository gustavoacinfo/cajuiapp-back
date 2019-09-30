/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.ifnmg.cajuiapp.graduacao.resources;

import com.br.ifnmg.cajuiapp.graduacao.models.Falta;
import com.br.ifnmg.cajuiapp.graduacao.repository.FaltaRepository;
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
@RequestMapping("/falta")
public class FaltaResource {
    
    @Autowired
    private FaltaRepository er;
    
    @GetMapping(produces="application/json")
    public @ResponseBody Iterable listaFaltas(){
        Iterable<Falta> listaFaltas = er.findAll();
        return listaFaltas;
    }
    
    @PostMapping()
    public Falta cadastrarFalta(@RequestBody @Valid Falta falta){
        return er.save(falta);
    }
    
    @DeleteMapping()
    public Falta deletaFalta(@RequestBody Falta falta){
        er.delete(falta);
        return falta;
    }
    
    
    
}
