/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.miPortfolio.service;

import com.portfolio.miPortfolio.model.Educacion;
import com.portfolio.miPortfolio.repository.EducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author dsalcedo
 */
@Service
public class EducacionService implements iEducacionService {

    @Autowired
    public EducacionRepository UsuariosRepo;
    
    @Override
    public List<Educacion> verEducacion() {
        return UsuariosRepo.findAll();
    }

    @Override
    public void crearEducacion(Educacion edu) {
        UsuariosRepo.save(edu);
    }

    @Override
    public void borrarEducacion(Long id) {
        UsuariosRepo.deleteById(id);
    }

    @Override
    public Educacion buscarEducacion(Long id) {
        return UsuariosRepo.findById(id).orElse(null);
    }
    
}
