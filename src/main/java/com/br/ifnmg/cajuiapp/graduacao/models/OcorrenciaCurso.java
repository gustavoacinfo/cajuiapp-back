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
@Table(name="ocorrencia_curso", schema="graduacao")
public class OcorrenciaCurso implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name = "curso_id")
    private Integer cursoId;
    
    @Column(name = "varsao_curso")
    private Integer versaoCurso;
    
    @Column(name = "unidade_id")
    private Integer unidadeId;
    
    @Column(name = "periodo_total")
    private Integer periodoTotal;
    
    @Column(name = "carga_horaria")
    private double cargaHoraria;
    
    private boolean fechado;
    
    @Column(name = "min_tempo_conclusao")
    private double minTempoConclusao;
    
    @Column(name = "max_tempo_conclusao")
    private double maxTempoConclusao;
    
    @Column(name = "data_autorizacao")
    private String dataAutorizacao;
    
    @Column(name = "doc_autorizacao")
    private String docAutorizacao;
   
    private String modalidade;
    
    @Column(name="created_at")
    private Integer createdAt;
    @Column(name="updated_at")
    private Integer updatedAt;
    @Column(name="created_by")
    private Integer createdBy;
    @Column(name="updated_by")
    private Integer updatedBy;
    
    
 
// * @property ReconhecimentoCurso[] $reconhecimentoCursos
// * @property CoordenadorCurso[] $coordenadorCursos
// * @property Curso $curso
// * @property Unidade $unidade
// * @property Curriculo[] $curriculos
// * @property Contrato[] $contratos
// * @property PeriodoLetivo[] $periodoLetivos
// * @property User $updatedBy
// * @property User $createdBy

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCursoId() {
        return cursoId;
    }

    public void setCursoId(Integer cursoId) {
        this.cursoId = cursoId;
    }

    public Integer getVersaoCurso() {
        return versaoCurso;
    }

    public void setVersaoCurso(Integer versaoCurso) {
        this.versaoCurso = versaoCurso;
    }

    public Integer getUnidadeId() {
        return unidadeId;
    }

    public void setUnidadeId(Integer unidadeId) {
        this.unidadeId = unidadeId;
    }

    public Integer getPeriodoTotal() {
        return periodoTotal;
    }

    public void setPeriodoTotal(Integer periodoTotal) {
        this.periodoTotal = periodoTotal;
    }

    public double getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(double cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public boolean isFechado() {
        return fechado;
    }

    public void setFechado(boolean fechado) {
        this.fechado = fechado;
    }

    public double getMinTempoConclusao() {
        return minTempoConclusao;
    }

    public void setMinTempoConclusao(double minTempoConclusao) {
        this.minTempoConclusao = minTempoConclusao;
    }

    public double getMaxTempoConclusao() {
        return maxTempoConclusao;
    }

    public void setMaxTempoConclusao(double maxTempoConclusao) {
        this.maxTempoConclusao = maxTempoConclusao;
    }

    public String getDataAutorizacao() {
        return dataAutorizacao;
    }

    public void setDataAutorizacao(String dataAutorizacao) {
        this.dataAutorizacao = dataAutorizacao;
    }

    public String getDocAutorizacao() {
        return docAutorizacao;
    }

    public void setDocAutorizacao(String docAutorizacao) {
        this.docAutorizacao = docAutorizacao;
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
