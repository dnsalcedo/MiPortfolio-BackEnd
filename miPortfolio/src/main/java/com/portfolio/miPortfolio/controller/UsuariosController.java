/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.miPortfolio.controller;

import com.portfolio.miPortfolio.model.Usuarios;
import com.portfolio.miPortfolio.service.iUsuariosService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author dsalcedo
 */
@RestController
@CrossOrigin(origins = {"http://localhost:4200", "https://miportfolio-dsalcedo.web.app"})
public class UsuariosController {

    @Autowired   
    private iUsuariosService UsuariosServ;
    
    ///////////////////////Usuarios/////////////////////////////////
    @PostMapping("api/usuario")
    public void crearUsuarios(@RequestBody Usuarios user) {
        UsuariosServ.crearUsuario(user);
    }

    @GetMapping("api/usuarios")
    @ResponseBody
    public List<Usuarios> verUsuarios() {
        return UsuariosServ.verUsuario();
    }
    
    @GetMapping("api/usuarios/{username}")
    @ResponseBody
    public Usuarios BuscarUsuario(@PathVariable String username) {
        return UsuariosServ.buscarPorUsername(username).orElse(null);
    }

    @DeleteMapping("api/usuario/{id}")
    public void borrarUsuarios(@PathVariable Long id) {
        UsuariosServ.borrarUsuario(id);
    }

    @PutMapping("api/usuario")
    public void actualizarUsuarios(@RequestBody Usuarios user) {
        UsuariosServ.crearUsuario(user);
    }

}
