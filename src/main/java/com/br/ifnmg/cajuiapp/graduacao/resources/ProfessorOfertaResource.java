/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.ifnmg.cajuiapp.graduacao.resources;

import com.br.ifnmg.cajuiapp.graduacao.models.ProfessorOferta;
import com.br.ifnmg.cajuiapp.graduacao.repository.ProfessorOfertaRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Gustavo
 */

@RestController
@RequestMapping("/professoroferta")
public class ProfessorOfertaResource {
    
    @Autowired
    private ProfessorOfertaRepository er;
    
    @GetMapping(produces="application/json")
    public @ResponseBody Iterable listaProfessorOfertas(){
        Iterable<ProfessorOferta> listaProfessorOfertas = er.findAll();
        return listaProfessorOfertas;
    }
    
    @GetMapping(produces="application/json", value="/{id}")
    public @ResponseBody Optional<ProfessorOferta> listaProfessorOfertasId(@PathVariable("id") Integer id){
        Optional<ProfessorOferta> listaProfessorOfertas = er.findById(id);
        return listaProfessorOfertas;
    }
    
    
    
    @GetMapping(produces="application/json", value="/aluno") //"/aluno/{id}/periodo/{periodo_id}"
    public @ResponseBody Iterable listaOfertasDoAluno(){ //@PathVariable("id") Integer id, @PathVariable("periodo_id") Integer periodo_id
        Iterable<ProfessorOferta> listarOfertasDoAluno = er.listarOfertasDoAluno(); //id, periodo_id
        return listarOfertasDoAluno;
    }
    
    @GetMapping(produces="application/json", value="/professor") //"/aluno/{id}/periodo/{periodo_id}"
    public @ResponseBody Iterable listaOfertasDoProfessor(){ //@PathVariable("id") Integer id, @PathVariable("periodo_id") Integer periodo_id
        Iterable<ProfessorOferta> listarOfertasDoProfessor = er.listarOfertasDoProfessor(); //id, periodo_id
        return listarOfertasDoProfessor;
    }
    
}
