/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aguirregermanportfolio.PortfolioGerman.repository;

import com.aguirregermanportfolio.PortfolioGerman.model.Skills;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author German
 */
public interface SkillsRepository extends JpaRepository<Skills, Long> {
    
    void deleteSkillsById(Long id);
    
    Optional<Skills> findSkillsById(Long id);
    
}
