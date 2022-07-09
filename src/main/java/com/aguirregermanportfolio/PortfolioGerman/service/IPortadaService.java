/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aguirregermanportfolio.PortfolioGerman.service;

import com.aguirregermanportfolio.PortfolioGerman.model.Portada;
import java.util.List;

/**
 *
 * @author German
 */
public interface IPortadaService {
    
    //método para traer todas las personas
    public List<Portada> getPortada();    
    
    //método para dar el alta una persona
    public void savePortada (Portada port);
    
    //método para borrar una persona
    public void deletePortada (Long id);
    
    //método para encontrar una persona
    public Portada findPortada (Long id);
}
