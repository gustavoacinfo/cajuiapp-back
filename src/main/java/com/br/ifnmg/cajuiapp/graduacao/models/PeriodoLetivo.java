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
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Gustavo
 */
@Entity
@Table(name="periodo_letivo", schema="graduacao")
public class PeriodoLetivo implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    private Integer ano;
    private Integer semestre;
    
    @OneToOne
    @JoinColumn(name = "ocorrencia_curso_id")
    private OcorrenciaCurso ocorrenciaCursoId;
    
    @Column(name = "data_inicio")
    private String dataInicio;
    
    @Column(name = "data_fim")
    private String dataFim;
    
    @Column(name = "frequencia_minima")
    private double frequenciaMinima;
    
    @Column(name = "nota_minima")
    private double notaMinima;
    
    @Column(name = "nota_libera_recuperacao")
    private double notaLiberaRecuperacao;
    
    private boolean fechado;
    private String modalidade;
    
// * @property LiberarMatricula[]       $disciplinaDesbloqueadas
// * @property Turma[]                  $turmas
// * @property Oferta[]                 $ofertas
// * @property PeriodoLetivo[]          $periodoLetivos
// * @property OcorrenciaCurso          $ocorrenciaCurso
// * @property MovimentacaoContratual[] $movimentacaoContratuals

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public Integer getSemestre() {
        return semestre;
    }

    public void setSemestre(Integer semestre) {
        this.semestre = semestre;
    }

    public OcorrenciaCurso getOcorrenciaCursoId() {
        return ocorrenciaCursoId;
    }

    public void setOcorrenciaCursoId(OcorrenciaCurso ocorrenciaCursoId) {
        this.ocorrenciaCursoId = ocorrenciaCursoId;
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

    public double getFrequenciaMinima() {
        return frequenciaMinima;
    }

    public void setFrequenciaMinima(double frequenciaMinima) {
        this.frequenciaMinima = frequenciaMinima;
    }

    public double getNotaMinima() {
        return notaMinima;
    }

    public void setNotaMinima(double notaMinima) {
        this.notaMinima = notaMinima;
    }

    public double getNotaLiberaRecuperacao() {
        return notaLiberaRecuperacao;
    }

    public void setNotaLiberaRecuperacao(double notaLiberaRecuperacao) {
        this.notaLiberaRecuperacao = notaLiberaRecuperacao;
    }

    public boolean isFechado() {
        return fechado;
    }

    public void setFechado(boolean fechado) {
        this.fechado = fechado;
    }

    public String getModalidade() {
        return modalidade;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }
    
    
    
}
