/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aguirregermanportfolio.PortfolioGerman.service;

import com.aguirregermanportfolio.PortfolioGerman.model.Skills;
import java.util.List;

/**
 *
 * @author German
 */
public interface ISkillsService {
    
    //método para traer todas las personas
    public List<Skills> getSkills();    
    
    //método para dar el alta una persona
    public void saveSkills (Skills skills);
    
    //método para borrar una persona
    public void deleteSkills (Long id);
    
    //método para encontrar una persona
    public Skills findSkills (Long id);
    
    public Skills findById (Long id);
    
}
