/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.miPortfolio.service;

import com.portfolio.miPortfolio.model.Idiomas;
import com.portfolio.miPortfolio.repository.IdiomasRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author dsalcedo
 */
@Service
public class IdiomasService implements iIdiomasService {

    @Autowired
    public IdiomasRepository IdiomasRepo;
    
    @Override
    public List<Idiomas> verIdioma() {
        return IdiomasRepo.findAll();
    }

    @Override
    public void crearIdioma(Idiomas ido) {
        IdiomasRepo.save(ido);
    }

    @Override
    public void borrarIdioma(Long id) {
        IdiomasRepo.deleteById(id);
    }

    @Override
    public Idiomas buscarIdioma(Long id) {
        return IdiomasRepo.findById(id).orElse(null);
    }
    
}
