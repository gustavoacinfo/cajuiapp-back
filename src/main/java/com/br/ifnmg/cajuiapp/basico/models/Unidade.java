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
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Gustavo
 */
@Entity
@Table(name="unidade", schema="basico")
public class Unidade implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    private String nome;
    private String sigla;
    
    @OneToOne
    @JoinColumn(name = "unidade_id_pai")
    private Unidade unidadeIdPai;
    
    private String cep;
    
    @Column(name = "cidade_id")
    private Integer cidadeId;
    
    private String logradouro;
    private String bairro;
    private String telefone;
    private String email;
    
    @Column(name="created_at")
    private Integer createdAt;
    @Column(name="updated_at")
    private Integer updatedAt;
    @Column(name="created_by")
    private Integer createdBy;
    @Column(name="updated_by")
    private Integer updatedBy;
     
//    private Pessoa[] pessoas;
//    private Cidade   cidade;
//    private Unidade unidadePai;
    
//    private User createdBy;;
//    private User updateBy;

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

    public Unidade getUnidadeIdPai() {
        return unidadeIdPai;
    }

    public void setUnidadeIdPai(Unidade unidadeIdPai) {
        this.unidadeIdPai = unidadeIdPai;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public Integer getCidadeId() {
        return cidadeId;
    }

    public void setCidadeId(Integer cidadeId) {
        this.cidadeId = cidadeId;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

//    public Pessoa[] getPessoas() {
//        return pessoas;
//    }
//
//    public void setPessoas(Pessoa[] pessoas) {
//        this.pessoas = pessoas;
//    }
//
//    public Cidade getCidade() {
//        return cidade;
//    }
//
//    public void setCidade(Cidade cidade) {
//        this.cidade = cidade;
//    }
//
//    public Unidade getUnidadePai() {
//        return unidadePai;
//    }
//
//    public void setUnidadePai(Unidade unidadePai) {
//        this.unidadePai = unidadePai;
//    }
//    
    
}
