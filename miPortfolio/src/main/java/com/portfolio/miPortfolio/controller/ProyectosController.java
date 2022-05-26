/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.miPortfolio.controller;

import com.portfolio.miPortfolio.model.Proyectos;
import com.portfolio.miPortfolio.service.iProyectosService;
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
public class ProyectosController {
    
    @Autowired
    private iProyectosService ProyectosServ;
    
    ///////////////////////Proyectos/////////////////////////////////
    @PostMapping("/proyecto")
    public void crearProyectos(@RequestBody Proyectos proy) {
        ProyectosServ.crearProyecto(proy);
    }

    @GetMapping("/proyectos")
    @ResponseBody
    public List<Proyectos> verProyectos() {
        return ProyectosServ.verProyecto();
    }
    
    @GetMapping("/proyecto/{id}")
    @ResponseBody
    public Proyectos verProyectosId(@PathVariable("id") long id){
        return ProyectosServ.buscarProyecto(id);
    }

    @DeleteMapping("/proyecto/{id}")
    public void borrarProyectos(@PathVariable Long id) {
        ProyectosServ.borrarProyecto(id);
    }

    @PutMapping("/proyecto")
    public void actualizarProyectos(@RequestBody Proyectos proy) {
        ProyectosServ.crearProyecto(proy);
    }
    
}
