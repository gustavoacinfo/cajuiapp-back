/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.ifnmg.cajuiapp.graduacao.resources;

import com.br.ifnmg.cajuiapp.graduacao.models.Falta;
import com.br.ifnmg.cajuiapp.graduacao.repository.FaltaRepository;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping("/falta")
public class FaltaResource {
    
    @Autowired
    private FaltaRepository er;
    
    @GetMapping(produces="application/json")
    public @ResponseBody Iterable listaFaltas(){
        Iterable<Falta> listaFaltas = er.findAll();
        return listaFaltas;
    }
    
    @GetMapping(produces="application/json", value="/oferta/{id}") ///aluno/{aluno_id}
    public @ResponseBody Iterable listaFaltasDoAluno(@PathVariable("id") Integer id){ // @PathVariable("aluno_id") Integer aluno_id
        Iterable<Falta> listarFaltasDoAluno = er.contaFaltasDoAluno(id ); //aluno_id
        return listarFaltasDoAluno;
    }
    
    @GetMapping(produces="application/json", value="/registro/{id}") ///aluno/{aluno_id}
    public @ResponseBody Iterable faltasDoRegistro(@PathVariable("id") Integer id){ //, @PathVariable("aluno_id") Integer aluno_id 
        Iterable<Falta> faltasDoRegistro = er.faltasDoRegistro(id); //aluno_id
        return faltasDoRegistro;
    }
    
    @PostMapping()
    public void cadastrarFalta(@RequestBody List<Falta> faltas){
        for(Falta falta : faltas){
            er.save(falta);
        }
    }
    
    @PutMapping()
    public void atualizarFalta(@RequestBody List<Falta> faltas){
        for(Falta falta : faltas){
            er.save(falta);
        }
    }
    
    @DeleteMapping()
    public void deletaFalta(@RequestBody Falta falta){
        er.delete(falta);
    }
    
    
    
}
