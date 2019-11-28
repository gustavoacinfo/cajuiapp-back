/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.ifnmg.cajuiapp.graduacao.repository;

import com.br.ifnmg.cajuiapp.graduacao.models.Contrato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author Gustavo
 */
public interface ContratoRepository extends JpaRepository<Contrato, String>{
    
    @Query(value="select * from graduacao.contrato as co where co.aluno_id = ?",nativeQuery=true)
    public Contrato listarContratoDoAluno(Integer alunoId);
    
}
