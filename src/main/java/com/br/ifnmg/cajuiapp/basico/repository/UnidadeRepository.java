/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.ifnmg.cajuiapp.basico.repository;

import com.br.ifnmg.cajuiapp.basico.models.Unidade;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Gustavo
 */
public interface UnidadeRepository extends JpaRepository<Unidade, String>{
    
}
