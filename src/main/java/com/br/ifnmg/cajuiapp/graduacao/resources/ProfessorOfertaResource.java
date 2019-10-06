/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.ifnmg.cajuiapp.graduacao.resources;

import com.br.ifnmg.cajuiapp.graduacao.models.ProfessorOferta;
import com.br.ifnmg.cajuiapp.graduacao.repository.ProfessorOfertaRepository;
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
@RequestMapping("/professoroferta")
public class ProfessorOfertaResource {
    
    @Autowired
    private ProfessorOfertaRepository er;
    
    @GetMapping(produces="application/json")
    public @ResponseBody Iterable listaProfessorOfertas(){
        Iterable<ProfessorOferta> listaProfessorOfertas = er.findAll();
        return listaProfessorOfertas;
    }
    
    @PostMapping()
    public ProfessorOferta cadastrarProfessorOferta(@RequestBody @Valid ProfessorOferta professoroferta){
        return er.save(professoroferta);
    }
    
    @DeleteMapping()
    public ProfessorOferta deletaProfessorOferta(@RequestBody ProfessorOferta professoroferta){
        er.delete(professoroferta);
        return professoroferta;
    }
    
    
}