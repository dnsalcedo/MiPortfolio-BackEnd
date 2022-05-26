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
public class Proyectos {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false)
    private String titulo;
    @Column(nullable = false)
    private String inicio;
    private String fin;
    @Column(nullable = false, columnDefinition = "text")
    private String ubicacion;
    @Column(nullable = false, columnDefinition = "text")
    private String descripcion;
    private String imagen;
    @Column(nullable = false)
    private String usuarios_idusuario ;
    
    public Proyectos(){
        
    }
    
    public Proyectos (Long id, String titulo, String inicio, String fin, String ubicacion, String descripcion, String imagen, String usuarios_idusuario){
        this.id = id;
        this.titulo = titulo;
        this.inicio = inicio;
        this.fin = fin;
        this.ubicacion = ubicacion; 
        this.descripcion = descripcion;
        this.imagen = imagen; 
        this.usuarios_idusuario = usuarios_idusuario;
    }    
}
