/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.ifnmg.cajuiapp.graduacao.repository;

import com.br.ifnmg.cajuiapp.graduacao.models.Turma;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author Gustavo
 */
public interface TurmaRepository extends JpaRepository<Turma, String>{
    
     @Query(value="select * from graduacao.turma as t join graduacao.contrato as c "
             + "on c.turma_id = t.id where c.aluno_id = ?",nativeQuery=true)
    public List<Turma> listarTurmaDoAluno(Integer id);
    
}
