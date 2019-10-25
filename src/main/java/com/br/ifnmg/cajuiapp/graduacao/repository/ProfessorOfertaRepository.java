/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.ifnmg.cajuiapp.graduacao.repository;

import com.br.ifnmg.cajuiapp.graduacao.models.ProfessorOferta;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author Gustavo
 */
public interface ProfessorOfertaRepository extends JpaRepository<ProfessorOferta, String>{
    
     @Query(value="select * from graduacao.professor_oferta as po join graduacao.oferta as o on po.oferta_id = o.id join graduacao.matricula as m on o.id = m.oferta_id join graduacao.contrato as c\n" +
"on m.contrato_id = c.id join basico.aluno as a on c.aluno_id = a.id where a.id = 24 and m.estado_matricula = 'MATRICULADO'\n" +
"and po.tipo_professor = 'PROFESSOR' and o.fechado = 'false'",nativeQuery=true)
    public List<ProfessorOferta> listarOfertasDoAluno();
    //Integer id
    
    @Query(value="select * from graduacao.professor_oferta as po join graduacao.oferta as o on po.oferta_id = o.id \n" +
"where po.professor_id = 17 and o.fechado = 'false'",nativeQuery=true)
    public List<ProfessorOferta> listarOfertasDoProfessor();
    //Integer id

    public Optional<ProfessorOferta> findById(Integer id);

    
}
