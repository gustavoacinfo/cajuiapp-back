/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.ifnmg.cajuiapp.graduacao.models;

import com.br.ifnmg.cajuiapp.basico.models.Aluno;
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
@Table(name="contrato", schema="graduacao")
public class Contrato implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @OneToOne
    @JoinColumn(name = "aluno_id")
    private Aluno alunoId;
    
    @OneToOne
    @JoinColumn(name = "ocorrencia_curso_id")
    private OcorrenciaCurso ocorrenciaCursoId;
    
    @OneToOne
    @JoinColumn(name = "turma_id")
    private Turma turmaId;
    
    @Column(name = "coeficiente_rendimento")
    private Number coeficienteRendimento;
    
    @Column(name = "data_conclusao")
    private String dataConclusao;
    
    @Column(name = "data_colacao")
    private String dataColacao;
    
    @Column(name = "numero_processo")
    private String numeroProcesso;
    
    @Column(name = "forma_ingresso")
    private String formaIngresso;
    
    private boolean fechado;
    
    @Column(name="created_at")
    private Integer createdAt;
    @Column(name="updated_at")
    private Integer updatedAt;
    @Column(name="created_by")
    private Integer createdBy;
    @Column(name="updated_by")
    private Integer updatedBy;
    
    
// * @property Aluno $aluno
// * @property Pessoa $pessoa
// * @property Aproveitamento[] $aproveitamentos
// * @property OcorrenciaCurso $ocorrenciaCurso
// * @property Turma $turma
// * @property LiberarMatricula[] $liberarMatriculas
// * @property Matricula[] $matriculas
// * @property Tcc[] $matriculasTcc
// * @property MovimentacaoContratual[] $movimentacoesContratuais
// * @property MovimentacaoIngresso $movimentacaoIngresso

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Aluno getAlunoId() {
        return alunoId;
    }

    public void setAlunoId(Aluno alunoId) {
        this.alunoId = alunoId;
    }

    public OcorrenciaCurso getOcorrenciaCursoId() {
        return ocorrenciaCursoId;
    }

    public void setOcorrenciaCursoId(OcorrenciaCurso ocorrenciaCursoId) {
        this.ocorrenciaCursoId = ocorrenciaCursoId;
    }

    public Turma getTurmaId() {
        return turmaId;
    }

    public void setTurmaId(Turma turmaId) {
        this.turmaId = turmaId;
    }

    public Number getCoeficienteRendimento() {
        return coeficienteRendimento;
    }

    public void setCoeficienteRendimento(Number coeficienteRendimento) {
        this.coeficienteRendimento = coeficienteRendimento;
    }

    public String getDataConclusao() {
        return dataConclusao;
    }

    public void setDataConclusao(String dataConclusao) {
        this.dataConclusao = dataConclusao;
    }

    public String getDataColacao() {
        return dataColacao;
    }

    public void setDataColacao(String dataColacao) {
        this.dataColacao = dataColacao;
    }

    public String getNumeroProcesso() {
        return numeroProcesso;
    }

    public void setNumeroProcesso(String numeroProcesso) {
        this.numeroProcesso = numeroProcesso;
    }

    public String getFormaIngresso() {
        return formaIngresso;
    }

    public void setFormaIngresso(String formaIngresso) {
        this.formaIngresso = formaIngresso;
    }

    public boolean isFechado() {
        return fechado;
    }

    public void setFechado(boolean fechado) {
        this.fechado = fechado;
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
