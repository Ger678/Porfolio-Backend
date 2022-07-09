/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aguirregermanportfolio.PortfolioGerman.service;

import com.aguirregermanportfolio.PortfolioGerman.model.EducacionItems;
import java.util.List;

/**
 *
 * @author German
 */
public interface IEducacionItems {
    
        //método para traer todas las personas
    public List<EducacionItems> getEducacionItems();    
    
    //método para dar el alta una persona
    public void saveEducacionItems (EducacionItems educ);
        
    public void deleteEducacionItems (Long itemID);
    
    //método para encontrar una persona
    public EducacionItems findEducacionItems (Long id);
}
