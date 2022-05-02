/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aguirregermanportfolio.PortfolioGerman.model.service;

import com.aguirregermanportfolio.PortfolioGerman.model.ExperienciaLaboral;
import java.util.List;

/**
 *
 * @author German
 */
public interface IExperienciaLaboralService {
    
    
    //método para traer todas las personas
    public List<ExperienciaLaboral> getExperiencia();    
    
    //método para dar el alta una persona
    public void saveExperiencia (ExperienciaLaboral expe);
    
    //método para borrar una persona
    public void deleteExperiencia (Long id);
    
    //método para encontrar una persona
    public ExperienciaLaboral findExperiencia (Long id);
    
}
    