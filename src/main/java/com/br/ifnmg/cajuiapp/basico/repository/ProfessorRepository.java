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
    
    @Query(value="select p.nome from basico.pessoa as p join basico.professor as pr on p.id = pr.id join graduacao.professor_oferta\n" +
"as po on po.professor_id = pr.id where po.oferta_id = ?",nativeQuery=true)
    public List<String> listarProfessoresDoAluno(Integer id);
    
    
  
    
}
