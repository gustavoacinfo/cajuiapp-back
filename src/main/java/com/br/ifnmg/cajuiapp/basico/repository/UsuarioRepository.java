/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.ifnmg.cajuiapp.basico.repository;

import com.br.ifnmg.cajuiapp.basico.models.Usuario;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author Gustavo
 */
public interface UsuarioRepository extends JpaRepository<Usuario, String> {
    
    @Query(value="select u.id from basico.user as u where u.username = ?",nativeQuery=true)
    public List<Integer> findByEmail(String username);
    
}
