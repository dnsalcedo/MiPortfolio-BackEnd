/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.miPortfolio.service;

import com.portfolio.miPortfolio.model.Experiencia;
import java.util.List;

/**
 *
 * @author dsalcedo
 */
public interface iExperienciaService {
    public List<Experiencia> verExperiencia ();
    public void crearExperiencia (Experiencia exp);
    public void borrarExperiencia (Long id);
    public Experiencia buscarExperiencia (Long id);        
}
