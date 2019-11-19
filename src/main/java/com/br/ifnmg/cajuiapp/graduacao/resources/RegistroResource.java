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
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
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
    public @ResponseBody Registro listaRegistroId(@PathVariable("id") Integer id){
        Registro listaRegistroId = er.findById(id);
        return listaRegistroId;
    }
    
    @PreAuthorize("hasAnyRole('PROFESSOR')")
    @PostMapping()
    public Registro cadastrarRegistro(@RequestBody @Valid Registro registro){
        return er.save(registro);
    }
    
    @PreAuthorize("hasAnyRole('PROFESSOR')")
    @PutMapping()
    public Registro atualizarRegistro(@RequestBody @Valid Registro registro){
        return er.save(registro);
    }
    
     @PreAuthorize("hasAnyRole('PROFESSOR')")
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> deletar(@PathVariable("id") Integer id) {
      Registro registro = er.findById(id);
        if (registro == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        er.delete(registro);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    
}
