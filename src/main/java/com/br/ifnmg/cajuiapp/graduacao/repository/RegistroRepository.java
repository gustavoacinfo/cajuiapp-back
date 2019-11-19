/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.ifnmg.cajuiapp.graduacao.repository;

import com.br.ifnmg.cajuiapp.graduacao.models.Registro;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author Gustavo
 */
public interface RegistroRepository extends JpaRepository<Registro, String>{
    
    @Query(value="select * from graduacao.registro as r join graduacao.professor_oferta as po on r.professor_oferta_id = po.id \n" +
"where po.oferta_id = ? order by r.id desc",nativeQuery=true)
    public List<Registro> listarRegistroDaOferta(Integer id);
    
    @Query(value="select * from graduacao.registro as re where re.data = ? and re.descricao = ? \n" +
"and re.professor_oferta_id = ?",nativeQuery=true)
    public List<Registro> listarRegistrosMesmaData(Date data, String desc, Integer oferta );

    public Registro findById(Integer id);
    
}
