/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.ifnmg.cajuiapp.graduacao.resources;

import com.br.ifnmg.cajuiapp.graduacao.models.Registro;
import com.br.ifnmg.cajuiapp.graduacao.repository.RegistroRepository;
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
@RequestMapping("/registro")
public class RegistroResource {
    
    
    @Autowired
    private RegistroRepository er;
    
    @GetMapping(produces="application/json")
    public @ResponseBody Iterable listaRegistros(){
        Iterable<Registro> listaRegistros = er.findAll();
        return listaRegistros;
    }
    
    @GetMapping(produces="application/json", value="/oferta/{id}")
    public @ResponseBody Iterable listaRegistroDaOferta(@PathVariable("id") Integer id){
        Iterable<Registro> listaRegistroDaOferta = er.listarRegistroDaOferta(id);
        return listaRegistroDaOferta;
    }
    
    @PostMapping()
    public Registro cadastrarRegistro(@RequestBody @Valid Registro registro){
        return er.save(registro);
    }
    
    @DeleteMapping()
    public Registro deletaRegistro(@RequestBody Registro registro){
        er.delete(registro);
        return registro;
    }
    
}
