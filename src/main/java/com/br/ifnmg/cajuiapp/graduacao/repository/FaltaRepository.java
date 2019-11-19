/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.ifnmg.cajuiapp.graduacao.repository;

import com.br.ifnmg.cajuiapp.graduacao.models.Falta;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author Gustavo
 */
public interface FaltaRepository extends JpaRepository<Falta, String> {
    
     @Query(value="select * from graduacao.falta as f join graduacao.registro as r on f.registro_id = r.id \n" +
"join graduacao.professor_oferta as po on r.professor_oferta_id = po.id join graduacao.matricula as m \n" +
"on f.matricula_id = m.id join graduacao.contrato as c on c.id = m.contrato_id where po.oferta_id = ?1 and c.aluno_id = ?2 ",nativeQuery=true)
    public List<Falta> contaFaltasDoAluno(Integer id, Integer alunoId);
    //, Integer aluno_id
    
    @Query(value="select * from graduacao.falta as fa where fa.registro_id = ?",nativeQuery=true)
    public List<Falta> faltasDoRegistro(Integer id);//, Integer aluno_id

    public Falta findById(Integer id);
    
}
