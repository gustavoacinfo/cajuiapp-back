/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.ifnmg.cajuiapp.graduacao.resources;

import com.br.ifnmg.cajuiapp.graduacao.models.Horario;
import com.br.ifnmg.cajuiapp.graduacao.repository.HorarioRepository;
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
@RequestMapping("/horario")
public class HorarioResource {
    
    @Autowired
    private HorarioRepository er;
    
    @GetMapping(produces="application/json")
    public @ResponseBody Iterable listaHorarios(){
        Iterable<Horario> listaHorarios = er.findAll();
        return listaHorarios;
    }
    
    @PostMapping()
    public Horario cadastrarHorario(@RequestBody @Valid Horario horario){
        return er.save(horario);
    }
    
    @DeleteMapping()
    public Horario deletaHorario(@RequestBody Horario horario){
        er.delete(horario);
        return horario;
    }
    
}
