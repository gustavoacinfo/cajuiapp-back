/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.ifnmg.cajuiapp.basico.models;


import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 *
 * @author Gustavo
 */
@Entity
@Table(name="professor", schema="basico")
@PrimaryKeyJoinColumn(name="id")
public class Professor extends Pessoa{
    
 }
