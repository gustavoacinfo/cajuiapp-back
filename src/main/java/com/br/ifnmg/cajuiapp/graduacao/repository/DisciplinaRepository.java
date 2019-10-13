/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.ifnmg.cajuiapp.graduacao.repository;

import com.br.ifnmg.cajuiapp.graduacao.models.Disciplina;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author Gustavo
 */
public interface DisciplinaRepository extends JpaRepository<Disciplina, String> {
    
    @Query(value="Select * from graduacao.disciplina as d join graduacao.curriculo as c on d.id = c.disciplina_id join \n" +
"graduacao.matricula as m on c.id = m.curriculo_id join graduacao.contrato as ct on m.contrato_id = ct.id \n" +
"where ct.aluno_id = ? and m.estado_matricula = 'MATRICULADO'",nativeQuery=true)
    public List<Disciplina> listarDisciplinaPorAluno(Integer id);
    
}
