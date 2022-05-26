/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.miPortfolio.service;

import com.portfolio.miPortfolio.model.Experiencia;
import com.portfolio.miPortfolio.repository.ExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author dsalcedo
 */
@Service
public class ExperienciaService implements iExperienciaService {

    @Autowired
    public ExperienciaRepository ExperienciaRepo;

    @Override
    public List<Experiencia> verExperiencia() {
        return ExperienciaRepo.findAll();
    }

    @Override
    public void crearExperiencia(Experiencia ido) {
        ExperienciaRepo.save(ido);
    }

    @Override
    public void borrarExperiencia(Long id) {
        ExperienciaRepo.deleteById(id);
    }

    @Override
    public Experiencia buscarExperiencia(Long id) {
        return ExperienciaRepo.findById(id).orElse(null);
    }
     
}
