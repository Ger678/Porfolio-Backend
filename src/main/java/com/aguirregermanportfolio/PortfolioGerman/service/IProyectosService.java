/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aguirregermanportfolio.PortfolioGerman.service;

import com.aguirregermanportfolio.PortfolioGerman.model.Proyectos;
import java.util.List;

/**
 *
 * @author German
 */
public interface IProyectosService {
    
     //método para traer todas las personas
    public List<Proyectos> getProyectos();    
    
    //método para dar el alta una persona
    public void saveProyectos (Proyectos perso);
    
    //método para borrar una persona
    public void deleteProyectos (Long id);
    
    //método para encontrar una persona
    public Proyectos findProyectos (Long id);
    
}
