/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.ifnmg.cajuiapp.basico.resources;

import com.br.ifnmg.cajuiapp.basico.models.Aluno;
import com.br.ifnmg.cajuiapp.basico.repository.AlunoRepository;
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
@RequestMapping("/aluno")
public class AlunoResource {
    
    @Autowired
    private AlunoRepository er;
    
    @GetMapping(produces="application/json")
    public @ResponseBody Iterable listaAlunos(){
        Iterable<Aluno> listaAlunos = er.findAll();
        return listaAlunos;
    }
    
     @GetMapping(produces="application/json", value="/professor/{id}/disciplina/{disciplina_id}")
    public @ResponseBody Iterable listaAlunoDaDisciplina(@PathVariable("id") Integer id, @PathVariable("disciplina_id") Integer disciplina_id ){
        Iterable<String> listarAlunoDaDisciplina = er.listarAlunoDaDisciplina(id, disciplina_id);
        return listarAlunoDaDisciplina;
    }
    
    @PostMapping()
    public Aluno cadastrarAluno(@RequestBody @Valid Aluno aluno){
        return er.save(aluno);
    }
    
    @DeleteMapping()
    public Aluno deletaPessoa(@RequestBody Aluno aluno){
        er.delete(aluno);
        return aluno;
    }
    
}
