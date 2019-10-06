/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.ifnmg.cajuiapp.basico.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 *
 * @author Gustavo
 */
@Entity
@Table(name="aluno", schema="basico")
@PrimaryKeyJoinColumn(name="id")
public class Aluno extends Pessoa{
    
    
    @Column(name="nome_responsavel_lega")
    private String nomeResponsavelLegal;
    
    @Column(name="cor_raca")
    private String corRaca;
    
    @Column(name="possui_necessidade_especial")
    private boolean possuiNecessidadeEspecial;
    
    @Column(name="descricao_necessidade_especial")
    private String descricaoNecessidadeEspecial;
    
    private String obs;
    
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

}
