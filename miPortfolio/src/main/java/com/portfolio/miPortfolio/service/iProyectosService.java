/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.miPortfolio.service;

import com.portfolio.miPortfolio.model.Proyectos;
import java.util.List;

/**
 *
 * @author dsalcedo
 */
public interface iProyectosService {
    public List<Proyectos> verProyecto ();
    public void crearProyecto (Proyectos proy);
    public void borrarProyecto (Long id);
    public Proyectos buscarProyecto (Long id);    
}
