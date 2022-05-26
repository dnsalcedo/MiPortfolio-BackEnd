/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.miPortfolio.service;

import com.portfolio.miPortfolio.model.Proyectos;
import com.portfolio.miPortfolio.repository.ProyectosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author dsalcedo
 */
@Service
public class ProyectosService implements iProyectosService {

    @Autowired
    public ProyectosRepository ProyectosRepo;
    
    @Override
    public List<Proyectos> verProyecto() {
        return ProyectosRepo.findAll();
    }

    @Override
    public void crearProyecto(Proyectos proy) {
        ProyectosRepo.save(proy);
    }

    @Override
    public void borrarProyecto(Long id) {
        ProyectosRepo.deleteById(id);
    }

    @Override
    public Proyectos buscarProyecto(Long id) {
        return ProyectosRepo.findById(id).orElse(null);
    }
    
}
