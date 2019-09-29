/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.ifnmg.cajuiapp.graduacao.resources;

import com.br.ifnmg.cajuiapp.graduacao.models.Turma;
import com.br.ifnmg.cajuiapp.graduacao.repository.TurmaRepository;
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
@RequestMapping("/turma")
public class TurmaResource {
    
    @Autowired
    private TurmaRepository er;
    
    @GetMapping(produces="application/json")
    public @ResponseBody Iterable listaTurmas(){
        Iterable<Turma> listaTurmas = er.findAll();
        return listaTurmas;
    }
    
    @PostMapping()
    public Turma cadastrarTurma(@RequestBody @Valid Turma turma){
        return er.save(turma);
    }
    
    @DeleteMapping()
    public Turma deletaTurma(@RequestBody Turma turma){
        er.delete(turma);
        return turma;
    }
    
}
