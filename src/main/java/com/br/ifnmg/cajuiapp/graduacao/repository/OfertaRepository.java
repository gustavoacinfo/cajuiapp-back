/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.ifnmg.cajuiapp.graduacao.repository;

import com.br.ifnmg.cajuiapp.graduacao.models.Oferta;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author Gustavo
 */
public interface OfertaRepository extends JpaRepository<Oferta, String> {
    
    @Query(value="select * from graduacao.oferta as o join graduacao.matricula as m on o.id = m.oferta_id join graduacao.contrato as c\n" +
"on m.contrato_id = c.id join basico.aluno as a on c.aluno_id = a.id where a.id = 24 and m.estado_matricula = 'MATRICULADO'\n" +
"and o.periodo_letivo_id = 9",nativeQuery=true)
    public List<Oferta> listarOfertasDoAluno();
    //Integer id, Integer periodo_id
}
