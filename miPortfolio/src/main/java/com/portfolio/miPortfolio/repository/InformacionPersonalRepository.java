/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.miPortfolio.repository;

import com.portfolio.miPortfolio.model.InformacionPersonal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author dsalcedo
 */
@Repository
public interface InformacionPersonalRepository extends JpaRepository <InformacionPersonal,Long> {
    
}
