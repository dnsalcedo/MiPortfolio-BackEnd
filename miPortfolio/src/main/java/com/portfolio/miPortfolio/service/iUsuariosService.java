/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.miPortfolio.service;

import com.portfolio.miPortfolio.model.Usuarios;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author dsalcedo
 */
public interface iUsuariosService {
    public List<Usuarios> verUsuario ();
    public void crearUsuario (Usuarios user);
    public void borrarUsuario (Long id);
    public Usuarios buscarUsuario (Long id);
    Optional<Usuarios> buscarPorUsername(String username);
    boolean existeUsername(String username);  
}
