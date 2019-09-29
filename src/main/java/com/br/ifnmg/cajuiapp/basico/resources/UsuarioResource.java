/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.ifnmg.cajuiapp.basico.resources;

import com.br.ifnmg.cajuiapp.basico.models.Usuario;
import com.br.ifnmg.cajuiapp.basico.repository.UsuarioRepository;
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
@RequestMapping("/usuario")
public class UsuarioResource {
    
    @Autowired
    private UsuarioRepository er;
    
    @GetMapping(produces="application/json")
    public @ResponseBody Iterable listaUsuarios(){
        Iterable<Usuario> listaUsuarios = er.findAll();
        return listaUsuarios;
    }
    
    @PostMapping()
    public Usuario cadastrarUsuario(@RequestBody @Valid Usuario usuario){
        return er.save(usuario);
    }
    
    @DeleteMapping()
    public Usuario deletaUsuario(@RequestBody Usuario usuario){
        er.delete(usuario);
        return usuario;
    }
    
}
