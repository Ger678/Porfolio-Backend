/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aguirregermanportfolio.PortfolioGerman.repository;

import com.aguirregermanportfolio.PortfolioGerman.model.Experiencia;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author German
 */
@Repository
public interface ExperienciaRepository extends JpaRepository<Experiencia, Long>{
    
    void deleteExperienciaById(Long id);
    
    Optional<Experiencia> findExperienciaById(Long id);    
}
