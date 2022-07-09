/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aguirregermanportfolio.PortfolioGerman.service;

import com.aguirregermanportfolio.PortfolioGerman.model.AcercaDeMi;
import java.util.List;

/**
 *
 * @author German
 */
public interface IAcercaDeMiService {
    
     //método para traer todas las personas
    public List<AcercaDeMi> getAcercaDeMi();    
    
    //método para dar el alta una persona
    public void saveAcercaDeMi (AcercaDeMi acerca);
    
    //método para borrar una persona
    public void deleteAcercaDeMi (Long id);
    
    //método para encontrar una persona
    public AcercaDeMi findAcercaDeMi (Long id);
    
}
