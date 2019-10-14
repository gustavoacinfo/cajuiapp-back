/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.ifnmg.cajuiapp.basico.repository;

import com.br.ifnmg.cajuiapp.basico.models.Professor;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author Gustavo
 */
public interface ProfessorRepository extends JpaRepository<Professor, String> {
    
    @Query(value="Select pe.nome from basico.professor as pr join basico.pessoa as pe on pe.id = pr.id join graduacao.professor_oferta as po on pr.id = po.professor_id \n" +
"join graduacao.oferta as o on po.oferta_id = o.id join graduacao.curriculo as cu on o.curriculo_id = cu.id\n" +
"join graduacao.disciplina as d on cu.disciplina_id = d.id join graduacao.matricula as m on m.curriculo_id = cu.id\n" +
"join graduacao.contrato as c on m.contrato_id = c.id where c.aluno_id = ?1 and d.id = ?2 and m.estado_matricula = 'MATRICULADO'",nativeQuery=true)
    public List<String> listarProfessorDaDisciplinaPorAluno(Integer id, Integer disciplina_id);
  
    
}
