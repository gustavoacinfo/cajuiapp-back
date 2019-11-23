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
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
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
    
    @Autowired
    private BCryptPasswordEncoder pe;
    
    @GetMapping(produces="application/json")
    public @ResponseBody Iterable listaUsuarios(){
        Iterable<Usuario> listaUsuarios = er.findAll();
        return listaUsuarios;
    }
    
    @GetMapping(produces="application/json", value="/{username}")
    public ResponseEntity<Usuario> listaUsuarioPorUsername(@PathVariable("username") String username){
        Usuario usuario = er.findByUsername(username);
        return ResponseEntity.ok().body(usuario);
    }
    
    @PutMapping()
    public Usuario atualizarUsuario(@RequestBody @Valid Usuario usuario){
        
        Usuario atualizaUsuario = er.getOne(usuario.getId());
        String senha = usuario.getAuthKey();
        atualizaUsuario.setAuthKey(pe.encode(senha));
        
        return er.save(atualizaUsuario);
    }
    
    
}
