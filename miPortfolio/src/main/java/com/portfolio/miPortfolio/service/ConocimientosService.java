/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.miPortfolio.service;

import com.portfolio.miPortfolio.model.Conocimientos;
import com.portfolio.miPortfolio.repository.ConocimientosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author dsalcedo
 */
@Service
public class ConocimientosService implements iConocimientosService {

    @Autowired
    public ConocimientosRepository ConocimientosRepo;
    
    @Override
    public List<Conocimientos> verConocimiento() {
        return ConocimientosRepo.findAll();
    }

    @Override
    public void crearConocimiento(Conocimientos con) {
        ConocimientosRepo.save(con);
    }

    @Override
    public void borrarConocimiento(Long id) {
        ConocimientosRepo.deleteById(id);
    }

    @Override
    public Conocimientos buscarConocimiento(Long id) {
        return ConocimientosRepo.findById(id).orElse(null);
    }
    
}
