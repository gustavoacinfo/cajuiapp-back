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
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
    public Recuperacao recuperacaoPorMatricula(@PathVariable("id") Integer id){ 
        Recuperacao notasDaRecuperacao = er.listarPorMatricula(id); 
        return notasDaRecuperacao;
    }
    
    @PreAuthorize("hasAnyRole('PROFESSOR')")
    @PostMapping()
    public Recuperacao cadastrarAvaliacao(@RequestBody @Valid Recuperacao recuperacao){
        return er.save(recuperacao);
    }
    
    @PreAuthorize("hasAnyRole('PROFESSOR')")
    @PutMapping()
    public Recuperacao atualizarRecuperacao(@RequestBody @Valid Recuperacao recuperacao){
        return er.save(recuperacao);
    }
    
    @PreAuthorize("hasAnyRole('PROFESSOR')")
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> deletar(@PathVariable("id") Integer id) {
      Recuperacao recuperacao = er.findById(id);
        if (recuperacao == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        er.delete(recuperacao);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    
}
