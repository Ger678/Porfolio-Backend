/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aguirregermanportfolio.PortfolioGerman.repository;


import com.aguirregermanportfolio.PortfolioGerman.model.EducacionItems;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author German
 */
public interface EducacionItemsRepository extends JpaRepository <EducacionItems, Long>{
    void deleteEducacionItemsById(Long id);
    Optional < EducacionItems> findEducacionById(Long id);
}
