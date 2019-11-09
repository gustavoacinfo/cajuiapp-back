/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.ifnmg.cajuiapp.graduacao.resources;

import com.br.ifnmg.cajuiapp.graduacao.models.Registro;
import com.br.ifnmg.cajuiapp.graduacao.repository.RegistroRepository;
import java.util.Date;
import java.util.Optional;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
    
    @GetMapping(produces="application/json", value="/oferta/{id}/data/{data}/desc/{desc}")
    public @ResponseBody Iterable listaRegistroMesmaData(@PathVariable("id") Integer id, @PathVariable("data") @DateTimeFormat(pattern="yyyy-MM-dd") Date data, @PathVariable("desc") String desc){
        Iterable<Registro> listaRegistroMesmaData = er.listarRegistrosMesmaData(data, desc, id);
        return listaRegistroMesmaData;
    }
    
    @GetMapping(produces="application/json", value="/{id}")
    public @ResponseBody Optional<Registro> listaRegistroId(@PathVariable("id") Integer id){
        Optional<Registro> listaRegistroId = er.findById(id);
        return listaRegistroId;
    }
    
    @PostMapping()
    public Registro cadastrarRegistro(@RequestBody @Valid Registro registro){
        return er.save(registro);
    }
    
    @PutMapping()
    public Registro atualizarRegistro(@RequestBody @Valid Registro registro){
        return er.save(registro);
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable(value="id") String id){
        er.deleteById(id);
        return ResponseEntity.noContent().build();
    }
    
}
