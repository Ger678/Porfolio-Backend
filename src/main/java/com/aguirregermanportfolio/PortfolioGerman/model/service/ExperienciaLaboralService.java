/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aguirregermanportfolio.PortfolioGerman.model.service;

import com.aguirregermanportfolio.PortfolioGerman.model.ExperienciaLaboral;
import com.aguirregermanportfolio.PortfolioGerman.model.repository.ExperienciaLaboralRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author German
 */
@Service
public class ExperienciaLaboralService implements IExperienciaLaboralService {

    @Autowired
    private ExperienciaLaboralRepository expRepo;
    
    @Override
    public List<ExperienciaLaboral> getExperiencia() {
        List<ExperienciaLaboral> listaExperiencia = expRepo.findAll();
        return listaExperiencia;
    }

    @Override
    public void saveExperiencia(ExperienciaLaboral expe) {
        expRepo.save(expe);
    }

    @Override
    public void deleteExperiencia(Long id) {
        expRepo.deleteById(id);
    }

    @Override
    public ExperienciaLaboral findExperiencia(Long id) {
        ExperienciaLaboral exp = expRepo.findById(id).orElse(null);
        return exp;
    }
    
}
