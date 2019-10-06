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
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Gustavo
 */
@Entity
@Table(name="oferta", schema="graduacao")
public class Oferta {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @OneToOne
    @JoinColumn(name = "periodo_letivo_id")
    private PeriodoLetivo periodoLetivoId;
    
    @OneToOne
    @JoinColumn(name = "curriculo_id")
    private Curriculo curriculoId;
    
    private Integer vaga;
    
    @Column(name = "vaga_calouros")
    private Integer vagaCalouros;
    
    private boolean fechado;
    
    @OneToOne
    @JoinColumn(name = "turma_id")
    private Turma turmaId;
    
    @Column(name = "subturma_id")
    private Integer subturmaId;
    
    @Column(name = "usa_diario")
    private boolean usaDiario;
    
    @Column(name = "objetivo_geral")
    private String objetivoGeral;
    
    @Column(name = "objetivos_especifico")
    private String objetivosEspecifico;
    
    @Column(name = "conteudo_programatico")
    private String conteudoProgramatico;
    
    @Column(name = "recursos_didaticos")
    private String recursosDidaticos;
    
    @Column(name = "bibliografia_complementar")
    private String bibliografiaComplementar;
    
    private String descricao;
    
    private String nomeTurma;
    
    @Column(name="created_at")
    private Integer createdAt;
    @Column(name="updated_at")
    private Integer updatedAt;
    @Column(name="created_by")
    private Integer createdBy;
    @Column(name="updated_by")
    private Integer updatedBy;

// * @property Turma           $turma
// * @property Subturma        $subturma
// * @property Curriculo       $curriculo
// * @property Disciplina      $disciplina
// * @property PeriodoLetivo   $periodoLetivo
// * @property ProfessorOferta $professoresOferta
// *
// * @property PreMatricula[]    $preMatriculas
// * @property Matricula[]       $matriculas
// * @property Avaliacao[]       $avaliacoes
// * @property Registro[]        $registros
// * @property Horario[]         $horarios
// * @property ProfessorOferta[] $professoresOferta
// * @property Professor[]       $professores

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public PeriodoLetivo getPeriodoLetivoId() {
        return periodoLetivoId;
    }

    public void setPeriodoLetivoId(PeriodoLetivo periodoLetivoId) {
        this.periodoLetivoId = periodoLetivoId;
    }

    public Curriculo getCurriculoId() {
        return curriculoId;
    }

    public void setCurriculoId(Curriculo curriculoId) {
        this.curriculoId = curriculoId;
    }

    public Integer getVaga() {
        return vaga;
    }

    public void setVaga(Integer vaga) {
        this.vaga = vaga;
    }

    public Integer getVagaCalouros() {
        return vagaCalouros;
    }

    public void setVagaCalouros(Integer vagaCalouros) {
        this.vagaCalouros = vagaCalouros;
    }

    public boolean isFechado() {
        return fechado;
    }

    public void setFechado(boolean fechado) {
        this.fechado = fechado;
    }

    public Turma getTurmaId() {
        return turmaId;
    }

    public void setTurmaId(Turma turmaId) {
        this.turmaId = turmaId;
    }

    public Integer getSubturmaId() {
        return subturmaId;
    }

    public void setSubturmaId(Integer subturmaId) {
        this.subturmaId = subturmaId;
    }

    public boolean isUsaDiario() {
        return usaDiario;
    }

    public void setUsaDiario(boolean usaDiario) {
        this.usaDiario = usaDiario;
    }

    public String getObjetivoGeral() {
        return objetivoGeral;
    }

    public void setObjetivoGeral(String objetivoGeral) {
        this.objetivoGeral = objetivoGeral;
    }

    public String getObjetivosEspecifico() {
        return objetivosEspecifico;
    }

    public void setObjetivosEspecifico(String objetivosEspecifico) {
        this.objetivosEspecifico = objetivosEspecifico;
    }

    public String getConteudoProgramatico() {
        return conteudoProgramatico;
    }

    public void setConteudoProgramatico(String conteudoProgramatico) {
        this.conteudoProgramatico = conteudoProgramatico;
    }

    public String getRecursosDidaticos() {
        return recursosDidaticos;
    }

    public void setRecursosDidaticos(String recursosDidaticos) {
        this.recursosDidaticos = recursosDidaticos;
    }

    public String getBibliografiaComplementar() {
        return bibliografiaComplementar;
    }

    public void setBibliografiaComplementar(String bibliografiaComplementar) {
        this.bibliografiaComplementar = bibliografiaComplementar;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNomeTurma() {
        return nomeTurma;
    }

    public void setNomeTurma(String nomeTurma) {
        this.nomeTurma = nomeTurma;
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
