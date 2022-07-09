/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aguirregermanportfolio.PortfolioGerman.service;

import com.aguirregermanportfolio.PortfolioGerman.model.Experiencia;
import java.util.List;

/**
 *
 * @author German
 */
public interface IExperienciaService {
    
    
    //método para traer todas las personas
    public List<Experiencia> getExperiencia();    
    
    //método para dar el alta una persona
    public void saveExperiencia (Experiencia expe);
    
    //método para borrar una persona
    public void deleteExperiencia (Long id);
    
    //método para encontrar una persona
    public Experiencia findExperiencia (Long id);
    
}
    