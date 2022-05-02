/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aguirregermanportfolio.PortfolioGerman.model.repository;

import com.aguirregermanportfolio.PortfolioGerman.model.ExperienciaLaboral;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author German
 */
@Repository
public interface ExperienciaLaboralRepository extends JpaRepository<ExperienciaLaboral, Long>{
    
    void deleteExperienciaLaboralById(Long id);
    
    Optional<ExperienciaLaboral> findExperienciaLaboralById(Long id);    
}
