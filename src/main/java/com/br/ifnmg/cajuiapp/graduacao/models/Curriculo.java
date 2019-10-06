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
@Table(name="curriculo", schema="graduacao")
public class Curriculo implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name = "ocorencia_curso_id")
    private Integer ocorrenciaCursoId;
    
    @Column(name = "disciplina_id")
    private Integer disciplinaId;
    
    @Column(name = "tipo_disciplina")
    private String tipoDisciplina;
    
    @Column(name = "periodo_curriculo")
    private Integer periodoCurriculo;
    
    @Column(name="created_at")
    private Integer createdAt;
    @Column(name="updated_at")
    private Integer updatedAt;
    @Column(name="created_by")
    private Integer createdBy;
    @Column(name="updated_by")
    private Integer updatedBy;
  
 
// * @property Requisito[] $requisitos
// * @property Equivalencia[] $equivalencias
// * @property LiberarMatricula[] $disciplinasDesbloqueadas
// * @property Tcc[] $tccs
// * @property OcorrenciaCurso $ocorrenciaCurso
// * @property Disciplina $disciplina
// * @property Curriculo[] $eletivas
// * @property Aproveitamento[] $aproveitamentos
// * @property Oferta[] $ofertas
// * @property Matricula[] $matriculas
// * @property User $updatedBy
// * @property User $createdBy

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOcorrenciaCursoId() {
        return ocorrenciaCursoId;
    }

    public void setOcorrenciaCursoId(Integer ocorrenciaCursoId) {
        this.ocorrenciaCursoId = ocorrenciaCursoId;
    }

    public Integer getDisciplinaId() {
        return disciplinaId;
    }

    public void setDisciplinaId(Integer disciplinaId) {
        this.disciplinaId = disciplinaId;
    }

    public String getTipoDisciplina() {
        return tipoDisciplina;
    }

    public void setTipoDisciplina(String tipoDisciplina) {
        this.tipoDisciplina = tipoDisciplina;
    }

    public Integer getPeriodoCurriculo() {
        return periodoCurriculo;
    }

    public void setPeriodoCurriculo(Integer periodoCurriculo) {
        this.periodoCurriculo = periodoCurriculo;
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

