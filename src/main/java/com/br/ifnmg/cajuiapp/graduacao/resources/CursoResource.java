/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.ifnmg.cajuiapp.graduacao.resources;

import com.br.ifnmg.cajuiapp.graduacao.models.Curso;
import com.br.ifnmg.cajuiapp.graduacao.repository.CursoRepository;
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
@RequestMapping("/curso")
public class CursoResource {
    
    @Autowired
    private CursoRepository er;
    
    @GetMapping(produces="application/json")
    public @ResponseBody Iterable listaCursos(){
        Iterable<Curso> listaCursos = er.findAll();
        return listaCursos;
    }
    
    @PostMapping()
    public Curso cadastrarCurso(@RequestBody @Valid Curso curso){
        return er.save(curso);
    }
    
    @DeleteMapping()
    public Curso deletaCurso(@RequestBody Curso curso){
        er.delete(curso);
        return curso;
    }
    
}
