/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.ifnmg.cajuiapp.graduacao.repository;

import com.br.ifnmg.cajuiapp.graduacao.models.Recuperacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author Gustavo
 */
public interface RecuperacaoRepository extends JpaRepository<Recuperacao, String> {
    
    @Query(value="select * from graduacao.recuperacao as rec where rec.matricula_id = ?",nativeQuery=true)
    public Recuperacao listarPorMatricula(Integer id);

    public Recuperacao findById(Integer id);
    
    
}
