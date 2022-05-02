/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aguirregermanportfolio.PortfolioGerman.service;

import com.aguirregermanportfolio.PortfolioGerman.model.Educacion;
import java.util.List;

/**
 *
 * @author German
 */
public interface IEducacionService {
    
    //método para traer todas las personas
    public List<Educacion> getEducacion();    
    
    //método para dar el alta una persona
    public void saveEducacion (Educacion educ);
    
    //método para borrar una persona
    public void deleteEducacion (Long id);
    
    //método para encontrar una persona
    public Educacion findEducacion (Long id);
    
}
