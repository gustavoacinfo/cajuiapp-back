/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.ifnmg.cajuiapp.graduacao.resources;

import com.br.ifnmg.cajuiapp.graduacao.models.Nota;
import com.br.ifnmg.cajuiapp.graduacao.repository.NotaRepository;
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
@RequestMapping("/nota")
public class NotaResource {
    
    @Autowired
    private NotaRepository er;
    
    @GetMapping(produces="application/json")
    public @ResponseBody Iterable listaNotas(){
        Iterable<Nota> listaNotas = er.findAll();
        return listaNotas;
    }
    
    @PostMapping()
    public Nota cadastrarNota(@RequestBody @Valid Nota nota){
        return er.save(nota);
    }
    
    @DeleteMapping()
    public Nota deletaNota(@RequestBody Nota nota){
        er.delete(nota);
        return nota;
    }
    
}
