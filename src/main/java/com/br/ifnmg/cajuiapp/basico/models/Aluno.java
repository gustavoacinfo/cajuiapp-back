/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.ifnmg.cajuiapp.basico.models;

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
@Table(name="aluno", schema="basico")
public class Aluno  implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name="nome_responsavel_lega")
    private String nomeResponsavelLegal;
    
    @Column(name="cor_raca")
    private String corRaca;
    
    @Column(name="possui_necessidade_especial")
    private boolean possuiNecessidadeEspecial;
    
    @Column(name="descricao_necessidade_especial")
    private String descricaoNecessidadeEspecial;
    
    private String obs;
    
    @Column(name="created_at")
    private Integer createdAt;
    @Column(name="updated_at")
    private Integer updatedAt;
    @Column(name="created_by")
    private Integer createdBy;
    @Column(name="updated_by")
    private Integer updatedBy;
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomeResponsavelLegal() {
        return nomeResponsavelLegal;
    }

    public void setNomeResponsavelLegal(String nomeResponsavelLegal) {
        this.nomeResponsavelLegal = nomeResponsavelLegal;
    }

    public String getCorRaca() {
        return corRaca;
    }

    public void setCorRaca(String corRaca) {
        this.corRaca = corRaca;
    }

    public boolean isPossuiNecessidadeEspecial() {
        return possuiNecessidadeEspecial;
    }

    public void setPossuiNecessidadeEspecial(boolean possuiNecessidadeEspecial) {
        this.possuiNecessidadeEspecial = possuiNecessidadeEspecial;
    }

    public String isDescricaoNecessidadeEspecial() {
        return descricaoNecessidadeEspecial;
    }

    public void setDescricaoNecessidadeEspecial(String descricaoNecessidadeEspecial) {
        this.descricaoNecessidadeEspecial = descricaoNecessidadeEspecial;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
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
