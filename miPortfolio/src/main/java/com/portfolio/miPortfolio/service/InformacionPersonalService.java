/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.miPortfolio.service;

import com.portfolio.miPortfolio.model.InformacionPersonal;
import com.portfolio.miPortfolio.repository.InformacionPersonalRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author dsalcedo
 */
@Service
public class InformacionPersonalService implements iInformacionPersonalService{

    @Autowired
    public InformacionPersonalRepository InformacionPersonalRepo;
    
    @Override
    public List<InformacionPersonal> verInformacionPersonal() {
        return InformacionPersonalRepo.findAll();
    }

    @Override
    public void crearInformacionPersonal(InformacionPersonal per) {
        InformacionPersonalRepo.save(per);
    }

    @Override
    public void borrarInformacionPersonal(Long id) {
        InformacionPersonalRepo.deleteById(id);
    }

    @Override
    public InformacionPersonal buscarInformacionPersonal(Long id) {
        return InformacionPersonalRepo.findById(id).orElse(null);
    }
    
}
