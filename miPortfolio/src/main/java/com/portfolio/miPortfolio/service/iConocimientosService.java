/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.miPortfolio.service;

import com.portfolio.miPortfolio.model.Conocimientos;
import java.util.List;

/**
 *
 * @author dsalcedo
 */
public interface iConocimientosService {
    public List<Conocimientos> verConocimiento ();
    public void crearConocimiento (Conocimientos con);
    public void borrarConocimiento (Long id);
    public Conocimientos buscarConocimiento (Long id);    
}
