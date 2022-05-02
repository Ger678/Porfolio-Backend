/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aguirregermanportfolio.PortfolioGerman.model.repository;

import com.aguirregermanportfolio.PortfolioGerman.model.Habilidades;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author German
 */
public interface HabilidadesRepository extends JpaRepository<Habilidades, Long> {
    
    void deleteHabilidadesById(Long id);
    
    Optional<Habilidades> findHabilidadesById(Long id);
    
}
