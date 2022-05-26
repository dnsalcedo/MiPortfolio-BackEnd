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
public class Idiomas {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false)
    private String nombre;
    @Column(nullable = false)
    private String nivelLectura;
    @Column(nullable = false)
    private String nivelEscritura;
    @Column(nullable = false)
    private String nivelConversacion;
    @Column(nullable = false)
    private String usuarios_idusuario;
    
    public Idiomas(){
        
    }
    
    public Idiomas (Long id, String nombre, String nivelLectura, String nivelEscritura, String nivelConversacion, String usuarios_idusuario){
        this.id = id;
        this.nombre = nombre;
        this.nivelLectura = nivelLectura;   
        this.nivelEscritura = nivelEscritura;
        this.nivelConversacion = nivelConversacion;
        this.usuarios_idusuario = usuarios_idusuario; 
    }    
}
