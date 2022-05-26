/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.miPortfolio.service;

import com.portfolio.miPortfolio.model.Idiomas;
import java.util.List;

/**
 *
 * @author dsalcedo
 */
public interface iIdiomasService {
    public List<Idiomas> verIdioma ();
    public void crearIdioma (Idiomas ido);
    public void borrarIdioma (Long id);
    public Idiomas buscarIdioma (Long id);    
}
