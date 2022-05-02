/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aguirregermanportfolio.PortfolioGerman.model.repository;

import com.aguirregermanportfolio.PortfolioGerman.model.Proyectos;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author German
 */
public interface ProyectosRepository extends JpaRepository <Proyectos, Long> {
    
    void deleteProyectosById(Long id);
    
    Optional<Proyectos> findProyectosById(Long id);
}