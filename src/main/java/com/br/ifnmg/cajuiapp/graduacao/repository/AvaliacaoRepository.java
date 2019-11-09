/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.ifnmg.cajuiapp.graduacao.repository;

import com.br.ifnmg.cajuiapp.graduacao.models.Avaliacao;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author Gustavo
 */
public interface AvaliacaoRepository extends JpaRepository<Avaliacao, String>{
    
    @Query(value="select * from graduacao.avaliacao as av join graduacao.professor_oferta as po on av.oferta_id = po.oferta_id\n" +
"where po.professor_id = 17 and po.oferta_id = ? order by av.id desc",nativeQuery=true)
    public List<Avaliacao> listarAvaliacaoDaOferta(Integer id);
    
    @Query(value="select sum(av.max_pontos) from graduacao.avaliacao as av join graduacao.professor_oferta as po on av.oferta_id = po.oferta_id\n" +
"where po.professor_id = 17 and po.oferta_id = ?",nativeQuery=true)
    public List<Integer> somaPontosDistribuidos(Integer id);//, Integer aluno_id

    public void deleteById(Integer id);
    
}
