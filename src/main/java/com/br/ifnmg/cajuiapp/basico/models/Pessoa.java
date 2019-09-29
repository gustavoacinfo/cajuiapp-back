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
@Table(name="pessoa", schema="basico")
public class Pessoa  implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    private String email;
    
    @Column(name="email_alternativo")
    private String emailAlternativo;
    
    private String lattes;
    
    @Column(name="unidade_id")
    private Integer unidadeId;
    
    private String avatar;
    private String nome;
    
    @Column(name="nome_social")
    private String nomeSocial;
    
    private String sexo;
    
    @Column(name="estado_civil")
    private String estadoCivil;
    
    @Column(name="data_nascimento")
    private String dataNascimento;
    
    @Column(name="cidade_id_nascimento")
    private Integer cidadeIdNascimento;
    
    private String nacionalidade;
    
    @Column(name="nome_mae")
    private String nomeMae;
    
    @Column(name="nome_pai")
    private String nomePai;
    
    @Column(name="data_falecimento")
    private String dataFalecimento;
    
    private String cpf;
    private String rg;
    
    @Column(name="rg_emissor")
    private String rgEmissor;
    
    @Column(name="rg_data")
    private String rgData;
    
    private String cep;
    
    @Column(name="cidade_id_endereco")
    private Integer cidadeIdEndereco;
    
    private String logradouro;
    private String numero; 
    private String complemento;
    private String bairro;
    private String telefone;
    
    @Column(name="created_at")
    private Integer createdAt;
    @Column(name="updated_at")
    private Integer updatedAt;
    @Column(name="created_by")
    private Integer createdBy;
    @Column(name="updated_by")
    private Integer updatedBy;
    
    private String imagemUrl;
    private String avatarUrl;
//    private Cidade cidadeNascimento;
//    private Cidade cidadeEndereco;
//    private Unidade unidade; 
//    private User user;
//    private Aluno aluno;
//    private Professor professor;
//    private Tecnico tecnico;
//    private Colaborador colaborador;
//    private PessoaUnidade[] pessoaUnidades;
//    private Unidade[] unidades;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmailAlternativo() {
        return emailAlternativo;
    }

    public void setEmailAlternativo(String emailAlternativo) {
        this.emailAlternativo = emailAlternativo;
    }

    public String getLattes() {
        return lattes;
    }

    public void setLattes(String lattes) {
        this.lattes = lattes;
    }

    public Integer getUnidadeId() {
        return unidadeId;
    }

    public void setUnidadeId(Integer unidadeId) {
        this.unidadeId = unidadeId;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeSocial() {
        return nomeSocial;
    }

    public void setNomeSocial(String nomeSocial) {
        this.nomeSocial = nomeSocial;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Integer getCidadeIdNascimento() {
        return cidadeIdNascimento;
    }

    public void setCidadeIdNascimento(Integer cidadeIdNascimento) {
        this.cidadeIdNascimento = cidadeIdNascimento;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public String getDataFalecimento() {
        return dataFalecimento;
    }

    public void setDataFalecimento(String dataFalecimento) {
        this.dataFalecimento = dataFalecimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getRgEmissor() {
        return rgEmissor;
    }

    public void setRgEmissor(String rgEmissor) {
        this.rgEmissor = rgEmissor;
    }

    public String getRgData() {
        return rgData;
    }

    public void setRgData(String rgData) {
        this.rgData = rgData;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public Integer getCidadeIdEndereco() {
        return cidadeIdEndereco;
    }

    public void setCidadeIdEndereco(Integer cidadeIdEndereco) {
        this.cidadeIdEndereco = cidadeIdEndereco;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
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

    public String getImagemUrl() {
        return imagemUrl;
    }

    public void setImagemUrl(String imagemUrl) {
        this.imagemUrl = imagemUrl;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }
    
    //    public Cidade getCidadeNascimento() {
//        return cidadeNascimento;
//    }
//
//    public void setCidadeNascimento(Cidade cidadeNascimento) {
//        this.cidadeNascimento = cidadeNascimento;
//    }
//
//    public Cidade getCidadeEndereco() {
//        return cidadeEndereco;
//    }
//
//    public void setCidadeEndereco(Cidade cidadeEndereco) {
//        this.cidadeEndereco = cidadeEndereco;
//    }
//
//    public Unidade getUnidade() {
//        return unidade;
//    }
//
//    public void setUnidade(Unidade unidade) {
//        this.unidade = unidade;
//    }
//
//    public User getUser() {
//        return user;
//    }
//
//    public void setUser(User user) {
//        this.user = user;
//    }
//
//    public Aluno getAluno() {
//        return aluno;
//    }
//
//    public void setAluno(Aluno aluno) {
//        this.aluno = aluno;
//    }
//
//    public Professor getProfessor() {
//        return professor;
//    }
//
//    public void setProfessor(Professor professor) {
//        this.professor = professor;
//    }
//
//    public Tecnico getTecnico() {
//        return tecnico;
//    }
//
//    public void setTecnico(Tecnico tecnico) {
//        this.tecnico = tecnico;
//    }
//
//    public Colaborador getColaborador() {
//        return colaborador;
//    }
//
//    public void setColaborador(Colaborador colaborador) {
//        this.colaborador = colaborador;
//    }
//
//    public PessoaUnidade[] getPessoaUnidades() {
//        return pessoaUnidades;
//    }
//
//    public void setPessoaUnidades(PessoaUnidade[] pessoaUnidades) {
//        this.pessoaUnidades = pessoaUnidades;
//    }
//
//    public Unidade[] getUnidades() {
//        return unidades;
//    }
//
//    public void setUnidades(Unidade[] unidades) {
//        this.unidades = unidades;
//    }
    
}
