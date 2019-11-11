/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.ifnmg.cajuiapp.graduacao.repository;

import com.br.ifnmg.cajuiapp.graduacao.models.NotaAvaliacao;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author Gustavo
 */
public interface NotaAvaliacaoRepository extends JpaRepository<NotaAvaliacao, String>  {
    
     @Query(value="select * from graduacao.nota_avaliacao as na join graduacao.avaliacao as av on na.avaliacao_id = av.id \n" +
"join graduacao.matricula as m on na.matricula_id = m.id join graduacao.contrato as c on m.contrato_id = c.id\n" +
"where av.oferta_id = ?1 and c.aluno_id = ?2",nativeQuery=true)
    public List<NotaAvaliacao> listaAvaliacoesDoAluno(Integer id, Integer alunoId);
    
    @Query(value="select sum(na.nota) from graduacao.nota_avaliacao as na join graduacao.avaliacao as av on na.avaliacao_id = av.id \n" +
"join graduacao.matricula as m on na.matricula_id = m.id join graduacao.contrato as c on m.contrato_id = c.id\n" +
"where av.oferta_id = ?1 and c.aluno_id = ?2",nativeQuery=true)
    public List<Integer> somaPontosObtidos(Integer id, Integer alunoId);//, 
    
    @Query(value="select * from graduacao.nota_avaliacao as na where na.avaliacao_id = ?",nativeQuery=true)
    public List<NotaAvaliacao> notasDaAvaliacao(Integer id);
    
    
    
    
}
