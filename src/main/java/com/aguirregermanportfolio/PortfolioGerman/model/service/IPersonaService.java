/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aguirregermanportfolio.PortfolioGerman.model.service;

import com.aguirregermanportfolio.PortfolioGerman.model.Persona;
import java.util.List;

/**
 *
 * @author German
 */
public interface IPersonaService {
    
    //método para traer todas las personas
    public List<Persona> getPersona();    
    
    //método para dar el alta una persona
    public void savePersona (Persona perso);
    
    //método para borrar una persona
    public void deletePersona (Long id);
    
    //método para encontrar una persona
    public Persona findPersona (Long id);
}
