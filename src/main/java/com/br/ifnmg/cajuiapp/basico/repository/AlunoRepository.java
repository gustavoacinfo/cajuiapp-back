/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.ifnmg.cajuiapp.basico.repository;

import com.br.ifnmg.cajuiapp.basico.models.Aluno;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author Gustavo
 */
public interface AlunoRepository extends JpaRepository<Aluno, String>  {
    
    @Query(value="select p.nome from basico.pessoa as p join basico.aluno as al on p.id = al.id join graduacao.contrato as c\n" +
"on c.aluno_id = al.id join graduacao.matricula as m on c.id = m.contrato_id join graduacao.curriculo as cu\n" +
"on cu.id = m.curriculo_id join graduacao.disciplina as d on cu.disciplina_id = d.id join graduacao.oferta as o\n" +
"on m.oferta_id = o.id join graduacao.professor_oferta as po on o.id = po.oferta_id where po.professor_id = ?1 \n" +
"and d.id = ?2 order by p.nome",nativeQuery=true)
    public List<String> listarAlunoDaDisciplina(Integer id, Integer disciplina_id);
    
}
