/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aguirregermanportfolio.PortfolioGerman.service;

import com.aguirregermanportfolio.PortfolioGerman.model.Habilidades;
import java.util.List;

/**
 *
 * @author German
 */
public interface IHabilidadesService {
    
    //método para traer todas las personas
    public List<Habilidades> getHabilidades();    
    
    //método para dar el alta una persona
    public void saveHabilidades (Habilidades habi);
    
    //método para borrar una persona
    public void deleteHabilidades (Long id);
    
    //método para encontrar una persona
    public Habilidades findHabilidades (Long id);
    
}
