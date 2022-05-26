/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.miPortfolio.service;

import com.portfolio.miPortfolio.model.InformacionPersonal;
import java.util.List;

/**
 *
 * @author dsalcedo
 */
public interface iInformacionPersonalService {
    public List<InformacionPersonal> verInformacionPersonal ();
    public void crearInformacionPersonal (InformacionPersonal info);
    public void borrarInformacionPersonal (Long id);
    public InformacionPersonal buscarInformacionPersonal (Long id); 
}
