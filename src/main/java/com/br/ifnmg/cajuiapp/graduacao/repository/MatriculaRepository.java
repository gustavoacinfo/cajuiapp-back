/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.ifnmg.cajuiapp.graduacao.repository;

import com.br.ifnmg.cajuiapp.graduacao.models.Matricula;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author Gustavo
 */
public interface MatriculaRepository extends JpaRepository<Matricula, String> {
    
    @Query(value="select * from graduacao.matricula as m join graduacao.oferta as o on m.oferta_id = o.id join graduacao.contrato as c\n" +
"on m.contrato_id = c.id join basico.aluno as al on c.aluno_id = al.id join basico.pessoa as p on al.id = p.id\n" +
"where o.id = ? and m.estado_matricula = 'MATRICULADO' order by p.nome ",nativeQuery=true)
    public List<Matricula> listarMatriculasDaOferta(Integer id);
    
    @Query(value="select * from graduacao.matricula as ma join graduacao.contrato as con on con.id = ma.contrato_id\n" +
"join graduacao.oferta as ofe on ofe.id = ma.oferta_id join graduacao.curriculo as cur \n" +
"on cur.id = ma.curriculo_id where ma.oferta_id = ?1 and con.aluno_id = ?2",nativeQuery=true)
    public Matricula listarMatriculaDoAluno(Integer ofertaId, Integer alunoId);
    
    
    
}
