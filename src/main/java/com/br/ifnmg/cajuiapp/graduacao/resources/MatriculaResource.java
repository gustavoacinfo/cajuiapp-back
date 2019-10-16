/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.ifnmg.cajuiapp.graduacao.resources;

import com.br.ifnmg.cajuiapp.graduacao.models.Matricula;
import com.br.ifnmg.cajuiapp.graduacao.repository.MatriculaRepository;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
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
@CrossOrigin
@RestController
@RequestMapping("/matricula")
public class MatriculaResource {
    
     @Autowired
    private MatriculaRepository er;
    
    @GetMapping(produces="application/json")
    public @ResponseBody Iterable listaMatriculas(){
        Iterable<Matricula> listaMatriculas = er.findAll();
        return listaMatriculas;
    }
    
    @PostMapping()
    public Matricula cadastrarMatricula(@RequestBody @Valid Matricula matricula){
        return er.save(matricula);
    }
    
    @DeleteMapping()
    public Matricula deletaMatricula(@RequestBody Matricula matricula){
        er.delete(matricula);
        return matricula;
    }
    
    
}
