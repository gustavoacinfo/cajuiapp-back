/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.ifnmg.cajuiapp.basico.resources;

import com.br.ifnmg.cajuiapp.basico.models.Professor;
import com.br.ifnmg.cajuiapp.basico.repository.ProfessorRepository;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
@RequestMapping("/professor")
public class ProfessorResource {
    
    @Autowired
    private ProfessorRepository er;
    
    @GetMapping(produces="application/json")
    public @ResponseBody Iterable listaProfessores(){
        Iterable<Professor> listaProfessores = er.findAll();
        return listaProfessores;
    }
    
    @GetMapping(produces="application/json", value="/oferta/{id}")
    public @ResponseBody Iterable listaProfessoresDoAluno(@PathVariable("id") Integer id){
        Iterable<String> listaProfessoresDoAluno = er.listarProfessoresDoAluno(id);
        return listaProfessoresDoAluno;
    }
    
    @PostMapping()
    public Professor cadastrarProfessor(@RequestBody @Valid Professor professor){
        return er.save(professor);
    }
    
    @DeleteMapping()
    public Professor deletaProfessor(@RequestBody Professor professor){
        er.delete(professor);
        return professor;
    }
    
    
}
