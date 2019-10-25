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
"on m.contrato_id = c.id where o.id = ? ",nativeQuery=true)
    public List<Matricula> listarMatriculasDaOferta(Integer id);
    
}
