/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.miPortfolio.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
/**
 *
 * @author dsalcedo
 */
public class InformacionPersonal {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id ;
    @Column(nullable = false)
    private String nombre;
    @Column(nullable = false, columnDefinition = "text")
    private String presentacion;
    private String fotoPerfil;
    private String fotoBanner;
    @Column(nullable = false)
    private String usuarios_idusuario ;
    
    public InformacionPersonal(){
    
    }
    
    public InformacionPersonal (Long id, String nombre, String presentacion, String fotoPerfil, String fotoBanner){
        this.id = id;
        this.nombre = nombre;
        this.presentacion = presentacion; 
        this.fotoPerfil = fotoPerfil;
        this.fotoBanner = fotoBanner;
    }
}
