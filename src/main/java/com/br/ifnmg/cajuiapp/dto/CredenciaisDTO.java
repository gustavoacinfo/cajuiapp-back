/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.ifnmg.cajuiapp.dto;

import java.io.Serializable;

/**
 *
 * @author Gustavo
 */
public class CredenciaisDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private String username;
    private String senha;

    public CredenciaisDTO() {

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
