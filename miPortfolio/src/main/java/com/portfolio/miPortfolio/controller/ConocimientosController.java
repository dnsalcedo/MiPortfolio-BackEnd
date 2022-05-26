/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.miPortfolio.controller;

import com.portfolio.miPortfolio.model.Conocimientos;
import com.portfolio.miPortfolio.service.iConocimientosService;
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
public class ConocimientosController {

    @Autowired
    private iConocimientosService ConocimientosServ;

    ///////////////////////Conocimientos/////////////////////////////////
    @PostMapping("/conocimiento")
    public void crearConocimientos(@RequestBody Conocimientos con) {
        ConocimientosServ.crearConocimiento(con);
    }

    @GetMapping("/conocimientos")
    @ResponseBody
    public List<Conocimientos> verConocimientos() {
        return ConocimientosServ.verConocimiento();
    }

    @GetMapping("/conocimiento/{id}")
    @ResponseBody
    public Conocimientos verConocimientosId(@PathVariable("id") long id) {
        return ConocimientosServ.buscarConocimiento(id);
    }

    @DeleteMapping("/conocimiento/{id}")
    public void borrarConocimientos(@PathVariable Long id) {
        ConocimientosServ.borrarConocimiento(id);
    }

    @PutMapping("/conocimiento")
    public void actualizarConocimientos(@RequestBody Conocimientos con) {
        ConocimientosServ.crearConocimiento(con);
    }
}
