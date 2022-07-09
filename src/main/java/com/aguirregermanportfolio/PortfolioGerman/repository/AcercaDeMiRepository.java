/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aguirregermanportfolio.PortfolioGerman.repository;

import com.aguirregermanportfolio.PortfolioGerman.model.AcercaDeMi;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author German
 */
@Repository
public interface AcercaDeMiRepository extends JpaRepository <AcercaDeMi, Long> {
    
    void deleteAcercaDeMiById(Long id);
    
    Optional<AcercaDeMi> findAcercaDeMiById(Long id);
}