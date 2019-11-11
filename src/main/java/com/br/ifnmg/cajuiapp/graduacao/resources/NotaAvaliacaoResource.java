/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.ifnmg.cajuiapp.graduacao.resources;

import com.br.ifnmg.cajuiapp.graduacao.models.NotaAvaliacao;
import com.br.ifnmg.cajuiapp.graduacao.repository.NotaAvaliacaoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Gustavo
 */
@RestController
@RequestMapping("/notaavaliacao")
public class NotaAvaliacaoResource {
    
    @Autowired
    private NotaAvaliacaoRepository er;
    
    @GetMapping(produces="application/json")
    public @ResponseBody Iterable listaNotaAvaliacoes(){
        Iterable<NotaAvaliacao> listaNotaAvaliacoes = er.findAll();
        return listaNotaAvaliacoes;
    }
    
    @GetMapping(produces="application/json", value="/oferta/{id}/aluno/{aId}") 
    public @ResponseBody Iterable listaAvaliacoesDoAluno(@PathVariable("id") Integer id, @PathVariable("aId") Integer alunoid){ 
        Iterable<NotaAvaliacao> listarAvaliacoesDoAluno = er.listaAvaliacoesDoAluno(id, alunoid);
        return listarAvaliacoesDoAluno;
    }
    
    @GetMapping(produces="application/json", value="/obtidos/{id}/aluno/{aId}") 
    public @ResponseBody Iterable somaPontosObtidos(@PathVariable("id") Integer id, @PathVariable("aId") Integer alunoid){ 
        Iterable<Integer> somaPontosObtidos = er.somaPontosObtidos(id, alunoid); 
        return somaPontosObtidos;
    }
    
    @GetMapping(produces="application/json", value="/avaliacao/{id}") 
    public @ResponseBody Iterable notasDaAvaliacao(@PathVariable("id") Integer id){ 
        Iterable<NotaAvaliacao> notasDaAvaliacao = er.notasDaAvaliacao(id); 
        return notasDaAvaliacao;
    }
    
    @PreAuthorize("hasAnyRole('PROFESSOR')")
    @PostMapping()
    public void cadastrarNotaAvaliacao(@RequestBody List<NotaAvaliacao> notaavaliacao){
        for(NotaAvaliacao nota : notaavaliacao){
            er.save(nota);
        }
    }
    
    @PreAuthorize("hasAnyRole('PROFESSOR')")
    @PutMapping()
    public void atualizarNotaAvaliacao(@RequestBody List<NotaAvaliacao> notaavaliacao){
        for(NotaAvaliacao nota : notaavaliacao){
            er.save(nota);
        }
    }
    
    @PreAuthorize("hasAnyRole('PROFESSOR')")
    @DeleteMapping()
    public void deletaNotaAvaliacao(@RequestBody NotaAvaliacao notaavaliacao){
        er.delete(notaavaliacao);
    }
    
}
