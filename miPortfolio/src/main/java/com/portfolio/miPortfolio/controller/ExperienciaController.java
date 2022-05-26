/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.miPortfolio.controller;

import com.portfolio.miPortfolio.model.Experiencia;
import com.portfolio.miPortfolio.service.iExperienciaService;
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
public class ExperienciaController {

    @Autowired
    private iExperienciaService ExperienciaServ;

    ///////////////////////Experiencia/////////////////////////////////
    @PostMapping("/experiencia")
    public void crearExperiencia(@RequestBody Experiencia exp) {
        ExperienciaServ.crearExperiencia(exp);
    }

    @GetMapping("/experiencias")
    @ResponseBody
    public List<Experiencia> verExperiencia() {
        return ExperienciaServ.verExperiencia();
    }

    @GetMapping("/experiencia/{id}")
    @ResponseBody
    public Experiencia verExperienciasId(@PathVariable("id") long id) {
        return ExperienciaServ.buscarExperiencia(id);
    }

    @DeleteMapping("/experiencia/{id}")
    public void borrarExperiencia(@PathVariable Long id) {
        ExperienciaServ.borrarExperiencia(id);
    }

    @PutMapping("/experiencia")
    public void actualizarExperiencia(@RequestBody Experiencia exp) {
        ExperienciaServ.crearExperiencia(exp);
    }

}
