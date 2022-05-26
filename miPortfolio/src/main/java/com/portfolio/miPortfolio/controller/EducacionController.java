/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.miPortfolio.controller;

import com.portfolio.miPortfolio.model.Educacion;
import com.portfolio.miPortfolio.service.iEducacionService;
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
public class EducacionController {
    
    @Autowired
    private iEducacionService EducacionServ;
    
    ///////////////////////Educacion/////////////////////////////////
    @PostMapping("/educacion")
    public void crearEducacion(@RequestBody Educacion edu) {
        EducacionServ.crearEducacion(edu);
    }

    @GetMapping("/educacion")
    @ResponseBody
    public List<Educacion> verEducacion() {
        return EducacionServ.verEducacion();
    }
    
    @GetMapping("/educacion/{id}")
    @ResponseBody
    public Educacion verEducacionId(@PathVariable("id") long id){
        return EducacionServ.buscarEducacion(id);
    }

    @DeleteMapping("/educacion/{id}")
    public void borrarEducacion(@PathVariable Long id) {
        EducacionServ.borrarEducacion(id);
    }

    @PutMapping("/educacion")
    public void actualizarEducacion(@RequestBody Educacion edu) {
        EducacionServ.crearEducacion(edu);
    }
}
