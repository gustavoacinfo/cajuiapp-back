/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.ifnmg.cajuiapp.basico.resources;

import com.br.ifnmg.cajuiapp.basico.models.Pessoa;
import com.br.ifnmg.cajuiapp.basico.repository.PessoaRepository;
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
@RequestMapping("/pessoa")
public class PessoaResource {
    
    @Autowired
    private PessoaRepository er;
    
    @GetMapping(produces="application/json")
    public @ResponseBody Iterable listaPessoas(){
        Iterable<Pessoa> listaPessoas = er.findAll();
        return listaPessoas;
    }
    
    @PostMapping()
    public Pessoa cadastrarPessoa(@RequestBody @Valid Pessoa pessoa){
        return er.save(pessoa);
    }
    
    @DeleteMapping()
    public Pessoa deletaPessoa(@RequestBody Pessoa pessoa){
        er.delete(pessoa);
        return pessoa;
    }
}
