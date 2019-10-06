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
    
}
