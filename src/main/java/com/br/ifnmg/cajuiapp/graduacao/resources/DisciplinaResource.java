/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.ifnmg.cajuiapp.graduacao.resources;

import com.br.ifnmg.cajuiapp.graduacao.models.Disciplina;
import com.br.ifnmg.cajuiapp.graduacao.repository.DisciplinaRepository;
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
@RequestMapping("/disciplina")
public class DisciplinaResource {
    
    @Autowired
    private DisciplinaRepository er;
    
    @GetMapping(produces="application/json")
    public @ResponseBody Iterable listaDisciplinas(){
        Iterable<Disciplina> listaDisciplinas = er.findAll();
        return listaDisciplinas;
    }
    
    
    @GetMapping(produces="application/json", value="/aluno/{id}")
    public @ResponseBody Iterable listaDisciplinasPorAluno(@PathVariable("id") Integer id){
        Iterable<Disciplina> listaDisciplinasPorAluno = er.listarDisciplinaPorAluno(id);
        return listaDisciplinasPorAluno;
    }
    
    @GetMapping(produces="application/json", value="/professor/{id}/periodo/{periodo_id}")
    public @ResponseBody Iterable listaDisciplinasPorProfessor(@PathVariable("id") Integer id, @PathVariable("periodo_id") Integer periodo_id){
        Iterable<Disciplina> listaDisciplinasPorProfessor = er.listarDisciplinaDoProfessor(id, periodo_id);
        return listaDisciplinasPorProfessor;
    }
    
    @PostMapping()
    public Disciplina cadastrarDisciplina(@RequestBody @Valid Disciplina disciplina){
        return er.save(disciplina);
    }
    
    @DeleteMapping()
    public Disciplina deletaDisciplina(@RequestBody Disciplina disciplina){
        er.delete(disciplina);
        return disciplina;
    }
    
}
