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
public class Usuarios {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false)
    private String usuario;
    @Column(nullable = false)
    private String contrasena;
    private String token;
    
    public Usuarios(){
        
    }
    
    public Usuarios (Long id, String usuario, String contrasena, String token){
        this.id = id;
        this.usuario = usuario;
        this.contrasena = contrasena; 
        this.token = token;
    }
}
