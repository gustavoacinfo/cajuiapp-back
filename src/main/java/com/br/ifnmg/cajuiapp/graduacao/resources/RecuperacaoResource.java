/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.ifnmg.cajuiapp.graduacao.resources;

import com.br.ifnmg.cajuiapp.graduacao.models.Recuperacao;
import com.br.ifnmg.cajuiapp.graduacao.repository.RecuperacaoRepository;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
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
@RequestMapping("/recuperacao")
public class RecuperacaoResource {
    
    @Autowired
    private RecuperacaoRepository er;
    
    @GetMapping(produces="application/json")
    public @ResponseBody Iterable listaRecuperacoes(){
        Iterable<Recuperacao> listaRecuperacoes = er.findAll();
        return listaRecuperacoes;
    }
    
    @GetMapping(produces="application/json", value="/matricula/{id}") 
    public @ResponseBody Iterable recuperacaoPorMatricula(@PathVariable("id") Integer id){ 
        Iterable<Recuperacao> notasDaRecuperacao = er.findByMatriculaId(id); 
        return notasDaRecuperacao;
    }
    
    @PreAuthorize("hasAnyRole('PROFESSOR')")
    @PostMapping()
    public Recuperacao cadastrarAvaliacao(@RequestBody @Valid Recuperacao recuperacao){
        return er.save(recuperacao);
    }
    
}
