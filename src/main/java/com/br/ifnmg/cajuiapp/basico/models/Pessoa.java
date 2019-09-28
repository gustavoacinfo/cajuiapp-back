/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.ifnmg.cajuiapp.basico.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Gustavo
 */
@Entity
public class Pessoa {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    private String email;
    private String email_alternativo;
    private String lattes; 
    private Integer unidade_id;
    private String avatar;
    private String nome;
    private String nome_social;
    private String sexo;
    private String estado_civil;
    private String data_nascimento;
    private Integer cidade_id_nascimento;
    private String nacionalidade;
    private String nome_mae;
    private String nome_pai;
    private String data_falecimento;
    private String cpf;
    private String rg;
    private String rg_emissor;
    private String rg_data;
    private String cep;
    private Integer cidade_id_endereco;
    private String logradouro;
    private String numero; 
    private String complemento;
    private String bairro;
    private String telefone;
    private Integer created_at;
    private Integer updated_at;
    private Integer created_by;
    private Integer updated_by;
    
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

    public String getEmail_alternativo() {
        return email_alternativo;
    }

    public void setEmail_alternativo(String email_alternativo) {
        this.email_alternativo = email_alternativo;
    }

    public String getLattes() {
        return lattes;
    }

    public void setLattes(String lattes) {
        this.lattes = lattes;
    }

    public Integer getUnidade_id() {
        return unidade_id;
    }

    public void setUnidade_id(Integer unidade_id) {
        this.unidade_id = unidade_id;
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

    public String getNome_social() {
        return nome_social;
    }

    public void setNome_social(String nome_social) {
        this.nome_social = nome_social;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEstado_civil() {
        return estado_civil;
    }

    public void setEstado_civil(String estado_civil) {
        this.estado_civil = estado_civil;
    }

    public String getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(String data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public Integer getCidade_id_nascimento() {
        return cidade_id_nascimento;
    }

    public void setCidade_id_nascimento(Integer cidade_id_nascimento) {
        this.cidade_id_nascimento = cidade_id_nascimento;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getNome_mae() {
        return nome_mae;
    }

    public void setNome_mae(String nome_mae) {
        this.nome_mae = nome_mae;
    }

    public String getNome_pai() {
        return nome_pai;
    }

    public void setNome_pai(String nome_pai) {
        this.nome_pai = nome_pai;
    }

    public String getData_falecimento() {
        return data_falecimento;
    }

    public void setData_falecimento(String data_falecimento) {
        this.data_falecimento = data_falecimento;
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

    public String getRg_emissor() {
        return rg_emissor;
    }

    public void setRg_emissor(String rg_emissor) {
        this.rg_emissor = rg_emissor;
    }

    public String getRg_data() {
        return rg_data;
    }

    public void setRg_data(String rg_data) {
        this.rg_data = rg_data;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public Integer getCidade_id_endereco() {
        return cidade_id_endereco;
    }

    public void setCidade_id_endereco(Integer cidade_id_endereco) {
        this.cidade_id_endereco = cidade_id_endereco;
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

    public Integer getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Integer created_at) {
        this.created_at = created_at;
    }

    public Integer getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Integer updated_at) {
        this.updated_at = updated_at;
    }

    public Integer getCreated_by() {
        return created_by;
    }

    public void setCreated_by(Integer created_by) {
        this.created_by = created_by;
    }

    public Integer getUpdated_by() {
        return updated_by;
    }

    public void setUpdated_by(Integer updated_by) {
        this.updated_by = updated_by;
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
