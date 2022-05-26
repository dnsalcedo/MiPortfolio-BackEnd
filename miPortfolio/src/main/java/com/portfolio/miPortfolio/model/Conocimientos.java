/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.miPortfolio.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
/**
 *
 * @author dsalcedo
 */
public class Conocimientos {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false, columnDefinition = "text")
    private String texto;
    @Column(nullable = false)
    private String usuarios_idusuario ;
    
    public Conocimientos(){
        
    }
    
    public Conocimientos (Long id, String texto, String usuarios_idusuario){
        this.id = id;
        this.texto = texto;
        this.usuarios_idusuario = usuarios_idusuario;             
    }    
}
