/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.miPortfolio.controller;

import com.portfolio.miPortfolio.model.InformacionPersonal;
import com.portfolio.miPortfolio.service.iInformacionPersonalService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
/**
 *
 * @author dsalcedo
 */
@RestController
@RequestMapping("/api")
@CrossOrigin(origins = {"http://localhost:4200", "https://miportfolio-dsalcedo.web.app"})
public class InformacionPersonalController {
    
    @Autowired
    private iInformacionPersonalService InformacionPersonalServ;
    
    ///////////////////////InformacionPersonal/////////////////////////////////  
    @PostMapping("/informacionpersonal")
    public void crearInformacionPersonal(@RequestBody InformacionPersonal info) {
        InformacionPersonalServ.crearInformacionPersonal(info);
    }

    @GetMapping("/informacionpersonal")
    @ResponseBody
    public List<InformacionPersonal> verInformacionPersonal() {
        return InformacionPersonalServ.verInformacionPersonal();
    }

    @DeleteMapping("/informacionpersonal/{id}")
    public void borrarInformacionPersonal(@PathVariable Long id) {
        InformacionPersonalServ.borrarInformacionPersonal(id);
    }

    @PutMapping("/informacionpersonal")
    public void actualizarInformacionPersonal(@RequestBody InformacionPersonal info) {
        InformacionPersonalServ.crearInformacionPersonal(info);
    }
    
}
