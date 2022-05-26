/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.miPortfolio.controller;

import java.util.Date;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.portfolio.miPortfolio.model.Usuarios;
import com.portfolio.miPortfolio.service.iUsuariosService;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author dsalcedo
 */
@RestController
@RequestMapping("/api")
@CrossOrigin(origins = {"http://localhost:4200", "https://miportfolio-dsalcedo.web.app"})
public class LoginController {

    @Autowired
    iUsuariosService userService;

    @GetMapping("/alive")
    @ResponseBody
    public String verProyectos() {
        return "API Alive";
    }

    @PostMapping("/login")
    public ResponseEntity<Usuarios> login(@RequestParam("user") String username, @RequestParam("password") String pwd) {
        if (userService.existeUsername(username)) {
            Usuarios user = userService.buscarPorUsername(username).orElse(null);
            if (user.getContrasena().equals(pwd)) {
                String token = getJWTToken(username);
                user.setToken(token);
                userService.crearUsuario(user);
                return new ResponseEntity(user, HttpStatus.OK);
            } else {
                return new ResponseEntity("Error en el login - Contraseña incorrecta", HttpStatus.UNAUTHORIZED);
            }
        } else {
            return new ResponseEntity("Error en el login - El usuario no existe", HttpStatus.UNAUTHORIZED);
        }

    }

    private String getJWTToken(String username) {
        String secretKey = "mySecretKey";
        List<GrantedAuthority> grantedAuthorities = AuthorityUtils
                .commaSeparatedStringToAuthorityList("ROLE_USER");

        String token = Jwts
                .builder()
                .setId("MiPortfolio")
                .setSubject(username)
                .claim("authorities",
                        grantedAuthorities.stream()
                                .map(GrantedAuthority::getAuthority)
                                .collect(Collectors.toList()))
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + 600000))
                .signWith(SignatureAlgorithm.HS512,
                        secretKey.getBytes()).compact();

        return "Bearer " + token;
    }
}
