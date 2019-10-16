/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.ifnmg.cajuiapp.graduacao.resources;

import com.br.ifnmg.cajuiapp.graduacao.models.OcorrenciaCurso;
import com.br.ifnmg.cajuiapp.graduacao.repository.OcorrenciaCursoRepository;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
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
@CrossOrigin
@RestController
@RequestMapping("/ocorrenciacurso")
public class OcorrenciaCursoResource {
    
     @Autowired
    private OcorrenciaCursoRepository er;
    
    @GetMapping(produces="application/json")
    public @ResponseBody Iterable listaOcorrenciasCursos(){
        Iterable<OcorrenciaCurso> listaOcorrenciasCursos = er.findAll();
        return listaOcorrenciasCursos;
    }
    
    @PostMapping()
    public OcorrenciaCurso cadastrarOcorrenciaCurso(@RequestBody @Valid OcorrenciaCurso ocorrenciacurso){
        return er.save(ocorrenciacurso);
    }
    
    @DeleteMapping()
    public OcorrenciaCurso deletaOcorrenciaCurso(@RequestBody OcorrenciaCurso ocorrenciacurso){
        er.delete(ocorrenciacurso);
        return ocorrenciacurso;
    }
    
}
