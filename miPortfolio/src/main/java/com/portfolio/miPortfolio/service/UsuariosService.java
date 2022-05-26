/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.miPortfolio.service;

import com.portfolio.miPortfolio.model.Usuarios;
import com.portfolio.miPortfolio.repository.UsuariosRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author dsalcedo
 */
@Service
public class UsuariosService implements iUsuariosService {

    @Autowired
    public UsuariosRepository UsuariosRepo;
    
    @Override
    public List<Usuarios> verUsuario() {
        return UsuariosRepo.findAll();
    }

    @Override
    public void crearUsuario(Usuarios user) {
        UsuariosRepo.save(user);
    }

    @Override
    public void borrarUsuario(Long id) {
        UsuariosRepo.deleteById(id);
    }

    @Override
    public Usuarios buscarUsuario(Long id) {
        return UsuariosRepo.findById(id).orElse(null);
    }

    @Override
    public Optional<Usuarios> buscarPorUsername(String username) {
       List<Usuarios> lista = UsuariosRepo.findAll();
       return lista.stream().filter(c -> c.getUsuario().equals(username)).findAny();
    }

    @Override
    public boolean existeUsername(String username) {
       Optional<Usuarios> carnetFound = buscarPorUsername(username);
       return (carnetFound.isPresent());
    }

   



    
}
