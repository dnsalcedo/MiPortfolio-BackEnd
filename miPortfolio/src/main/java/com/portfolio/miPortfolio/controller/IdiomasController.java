/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.miPortfolio.controller;

import com.portfolio.miPortfolio.model.Idiomas;
import com.portfolio.miPortfolio.service.iIdiomasService;
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
public class IdiomasController {
    
    @Autowired
    private iIdiomasService IdiomasServ;
    
    ///////////////////////Idiomas/////////////////////////////////
    @PostMapping("/idioma")
    public void crearIdiomas(@RequestBody Idiomas idio) {
        IdiomasServ.crearIdioma(idio);
    }

    @GetMapping("/idiomas")
    @ResponseBody
    public List<Idiomas> verIdiomas() {
        return IdiomasServ.verIdioma();
    }
    
    @GetMapping("/idioma/{id}")
    @ResponseBody
    public Idiomas verIdiomasId(@PathVariable("id") long id){
        return IdiomasServ.buscarIdioma(id);
    }


    @DeleteMapping("/idioma/{id}")
    public void borrarIdiomas(@PathVariable Long id) {
        IdiomasServ.borrarIdioma(id);
    }

    @PutMapping("/idioma")
    public void actualizarIdiomas(@RequestBody Idiomas idio) {
        IdiomasServ.crearIdioma(idio);
    }
}
