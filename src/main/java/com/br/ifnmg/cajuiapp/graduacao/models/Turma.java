/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.ifnmg.cajuiapp.graduacao.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Gustavo
 */
@Entity
@Table(name="turma", schema="graduacao")
public class Turma {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    private String nome;
    private String turno;
    
    @Column(name = "periodo_letivo_id_inicial")
    private Integer periodoLetivoIdInicial;
    @Column(name = "periodo_letivo_id_final")
    private Integer periodoLetivoIdFinal;
    
    private Integer vaga;
    
    @Column(name = "unidade_id")
    private Integer unidadeId;
    
    @Column(name = "podo_id")
    private Integer poloId;
    
    private String modalidade;
    
    @Column(name="created_at")
    private Integer createdAt;
    @Column(name="updated_at")
    private Integer updatedAt;
    @Column(name="created_by")
    private Integer createdBy;
    @Column(name="updated_by")
    private Integer updatedBy;
    
//    private PeriodoLetivo periodoLetivo;;
//    private Subturma[] subturmas;
//    private Contrato[] contratos;
//    private Oferta[] ofertas;
//    private Unidade unidade;
//    private Polo polo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public Integer getPeriodoLetivoIdInicial() {
        return periodoLetivoIdInicial;
    }

    public void setPeriodoLetivoIdInicial(Integer periodoLetivoIdInicial) {
        this.periodoLetivoIdInicial = periodoLetivoIdInicial;
    }

    public Integer getPeriodoLetivoIdFinal() {
        return periodoLetivoIdFinal;
    }

    public void setPeriodoLetivoIdFinal(Integer periodoLetivoIdFinal) {
        this.periodoLetivoIdFinal = periodoLetivoIdFinal;
    }

    public Integer getVaga() {
        return vaga;
    }

    public void setVaga(Integer vaga) {
        this.vaga = vaga;
    }

    public Integer getUnidadeId() {
        return unidadeId;
    }

    public void setUnidadeId(Integer unidadeId) {
        this.unidadeId = unidadeId;
    }

    public Integer getPoloId() {
        return poloId;
    }

    public void setPoloId(Integer poloId) {
        this.poloId = poloId;
    }

    public String getModalidade() {
        return modalidade;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }

    public Integer getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Integer createdAt) {
        this.createdAt = createdAt;
    }

    public Integer getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Integer updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Integer getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    public Integer getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(Integer updatedBy) {
        this.updatedBy = updatedBy;
    }
    
 
}
