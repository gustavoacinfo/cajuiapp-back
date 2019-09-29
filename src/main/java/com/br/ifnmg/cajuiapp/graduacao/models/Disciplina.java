/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.ifnmg.cajuiapp.graduacao.models;

import java.io.Serializable;
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
@Table(name="disciplina", schema="graduacao")
public class Disciplina implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    private String nome;
    private String sigla;
    
    @Column(name = "hora_aula")
    private Integer horaAula;
    
    @Column(name = "ch_teorica")
    private Integer chTeorica;
    
    @Column(name = "ch_pratica")
    private Integer chPratica;
    
    @Column(name = "equivalencia_minutos")
    private double equivalenciaMinutos;
    
    @Column(name = "unidade_id")
    private double unidadeId;
    
    @Column(name = "data_inicio")
    private String dataInicio;
    
    @Column(name = "data_fim")
    private String dataFim;
    
    private String ementa;
    
    @Column(name = "bibliografia_basica")
    private String bibliografiaBasica;
    
    @Column(name = "bibliografia_complementar")
    private String bibliografiaComplementar;
    
    private String modalidade;
    
    @Column(name = "ch_presencial")
    private String chPresencial;
    
    @Column(name = "ch_distancia")
    private String chDistancia;
    
    @Column(name="created_at")
    private Integer createdAt;
    @Column(name="updated_at")
    private Integer updatedAt;
    @Column(name="created_by")
    private Integer createdBy;
    @Column(name="updated_by")
    private Integer updatedBy;
    
//    private Curriculo[] curriculos;
//    private Unidade unidade;
//    private Usuario updatedBy;
//    private Usuario createdBy;

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

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public Integer getHoraAula() {
        return horaAula;
    }

    public void setHoraAula(Integer horaAula) {
        this.horaAula = horaAula;
    }

    public Integer getChTeorica() {
        return chTeorica;
    }

    public void setChTeorica(Integer chTeorica) {
        this.chTeorica = chTeorica;
    }

    public Integer getChPratica() {
        return chPratica;
    }

    public void setChPratica(Integer chPratica) {
        this.chPratica = chPratica;
    }

    public double getEquivalenciaMinutos() {
        return equivalenciaMinutos;
    }

    public void setEquivalenciaMinutos(double equivalenciaMinutos) {
        this.equivalenciaMinutos = equivalenciaMinutos;
    }

    public double getUnidadeId() {
        return unidadeId;
    }

    public void setUnidadeId(double unidadeId) {
        this.unidadeId = unidadeId;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataFim() {
        return dataFim;
    }

    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }

    public String getEmenta() {
        return ementa;
    }

    public void setEmenta(String ementa) {
        this.ementa = ementa;
    }

    public String getBibliografiaBasica() {
        return bibliografiaBasica;
    }

    public void setBibliografiaBasica(String bibliografiaBasica) {
        this.bibliografiaBasica = bibliografiaBasica;
    }

    public String getBibliografiaComplementar() {
        return bibliografiaComplementar;
    }

    public void setBibliografiaComplementar(String bibliografiaComplementar) {
        this.bibliografiaComplementar = bibliografiaComplementar;
    }

    public String getModalidade() {
        return modalidade;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }

    public String getChPresencial() {
        return chPresencial;
    }

    public void setChPresencial(String chPresencial) {
        this.chPresencial = chPresencial;
    }

    public String getChDistancia() {
        return chDistancia;
    }

    public void setChDistancia(String chDistancia) {
        this.chDistancia = chDistancia;
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
