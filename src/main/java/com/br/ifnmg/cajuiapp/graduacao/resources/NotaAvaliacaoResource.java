/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.ifnmg.cajuiapp.graduacao.resources;

import com.br.ifnmg.cajuiapp.graduacao.models.NotaAvaliacao;
import com.br.ifnmg.cajuiapp.graduacao.repository.NotaAvaliacaoRepository;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
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
@CrossOrigin
@RestController
@RequestMapping("/notaavaliacao")
public class NotaAvaliacaoResource {
    
    @Autowired
    private NotaAvaliacaoRepository er;
    
    @GetMapping(produces="application/json")
    public @ResponseBody Iterable listaNotaAvaliacoes(){
        Iterable<NotaAvaliacao> listaNotaAvaliacoes = er.findAll();
        return listaNotaAvaliacoes;
    }
    
    @GetMapping(produces="application/json", value="/oferta/{id}") ///aluno/{aluno_id}
    public @ResponseBody Iterable listaAvaliacoesDoAluno(@PathVariable("id") Integer id){ //, @PathVariable("aluno_id") Integer aluno_id 
        Iterable<NotaAvaliacao> listarAvaliacoesDoAluno = er.listaAvaliacoesDoAluno(id); //aluno_id
        return listarAvaliacoesDoAluno;
    }
    
    @GetMapping(produces="application/json", value="/distribuidos/{id}") ///aluno/{aluno_id}
    public @ResponseBody Iterable somaPontosDistribuidos(@PathVariable("id") Integer id){ //, @PathVariable("aluno_id") Integer aluno_id 
        Iterable<Integer> somaPontosDistribuidos = er.somaPontosDistribuidos(id); //aluno_id
        return somaPontosDistribuidos;
    }
    
    @GetMapping(produces="application/json", value="/obtidos/{id}") ///aluno/{aluno_id}
    public @ResponseBody Iterable somaPontosObtidos(@PathVariable("id") Integer id){ //, @PathVariable("aluno_id") Integer aluno_id 
        Iterable<Integer> somaPontosObtidos = er.somaPontosObtidos(id); //aluno_id
        return somaPontosObtidos;
    }
    
    @PostMapping()
    public NotaAvaliacao cadastrarNotaAvaliacao(@RequestBody @Valid NotaAvaliacao notaavaliacao){
        return er.save(notaavaliacao);
    }
    
    @DeleteMapping()
    public NotaAvaliacao deletaNotaAvaliacao(@RequestBody NotaAvaliacao notaavaliacao){
        er.delete(notaavaliacao);
        return notaavaliacao;
    }
    
}
