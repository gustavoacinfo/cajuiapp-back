/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.ifnmg.cajuiapp.graduacao.repository;

import com.br.ifnmg.cajuiapp.graduacao.models.Registro;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author Gustavo
 */
public interface RegistroRepository extends JpaRepository<Registro, String>{
    
    @Query(value="select * from graduacao.registro as r join graduacao.professor_oferta as po on r.professor_oferta_id = po.id\n" +
"join graduacao.oferta as o on po.oferta_id = o.id join graduacao.curriculo as c on o.curriculo_id = c.id\n" +
"where po.professor_id = ?1 and c.disciplina_id = ?2",nativeQuery=true)
    public List<Registro> listarRegistroDoProfessorNaDisciplina(Integer id, Integer disciplina_id);
    
}
