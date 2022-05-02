/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aguirregermanportfolio.PortfolioGerman.repository;

import com.aguirregermanportfolio.PortfolioGerman.model.Educacion;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author German
 */
public interface EducacionRepository extends JpaRepository<Educacion,Long> {
    
    void deleteEducacionById(Long id);
            
    Optional < Educacion> findEducacionById(Long id);
}
