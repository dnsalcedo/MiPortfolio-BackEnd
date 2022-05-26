/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.miPortfolio.service;

import com.portfolio.miPortfolio.model.Educacion;
import java.util.List;

/**
 *
 * @author dsalcedo
 */
public interface iEducacionService {
    public List<Educacion> verEducacion ();
    public void crearEducacion (Educacion edu);
    public void borrarEducacion (Long id);
    public Educacion buscarEducacion (Long id);    
}
