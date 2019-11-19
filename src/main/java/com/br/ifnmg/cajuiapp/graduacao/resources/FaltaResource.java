/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.ifnmg.cajuiapp.graduacao.resources;

import com.br.ifnmg.cajuiapp.graduacao.models.Falta;
import com.br.ifnmg.cajuiapp.graduacao.repository.FaltaRepository;
import java.util.List;
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
@RequestMapping("/falta")
public class FaltaResource {
    
    @Autowired
    private FaltaRepository er;
    
    @GetMapping(produces="application/json")
    public @ResponseBody Iterable listaFaltas(){
        Iterable<Falta> listaFaltas = er.findAll();
        return listaFaltas;
    }
    
    @GetMapping(produces="application/json", value="/oferta/{id}/aluno/{aid}") 
    public @ResponseBody Iterable listaFaltasDoAluno(@PathVariable("id") Integer id, @PathVariable("aid") Integer alunoid){ 
        Iterable<Falta> listarFaltasDoAluno = er.contaFaltasDoAluno(id, alunoid ); 
        return listarFaltasDoAluno;
    }
    
    @GetMapping(produces="application/json", value="/registro/{id}") 
    public @ResponseBody Iterable faltasDoRegistro(@PathVariable("id") Integer id){ 
        Iterable<Falta> faltasDoRegistro = er.faltasDoRegistro(id); 
        return faltasDoRegistro;
    }
    
    @PreAuthorize("hasAnyRole('PROFESSOR')")
    @PostMapping()
    public void cadastrarFalta(@RequestBody List<Falta> faltas){
        for(Falta falta : faltas){
            er.save(falta);
        }
    }
    
    @PreAuthorize("hasAnyRole('PROFESSOR')")
    @PutMapping()
    public void atualizarFalta(@RequestBody List<Falta> faltas){
        for(Falta falta : faltas){
            er.save(falta);
        }
    }
    
    @PreAuthorize("hasAnyRole('PROFESSOR')")
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> deletar(@PathVariable("id") Integer id) {
      Falta falta = er.findById(id);
        if (falta == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        er.delete(falta);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    
    
    
}
