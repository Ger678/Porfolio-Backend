/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aguirregermanportfolio.PortfolioGerman.service;

import com.aguirregermanportfolio.PortfolioGerman.model.Educacion;
import com.aguirregermanportfolio.PortfolioGerman.repository.EducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author German
 */
public class EducacionService implements IEducacionService {

    @Autowired
    private EducacionRepository educRepo;
    
    @Override
    public List<Educacion> getEducacion() {
        List<Educacion> listaEducacion = educRepo.findAll();
        return listaEducacion;
    }

    @Override
    public void saveEducacion(Educacion educ) {
        educRepo.save(educ);
    }

    @Override
    public void deleteEducacion(Long id) {
        educRepo.deleteById(id);
    }

    @Override
    public Educacion findEducacion(Long id) {
        Educacion edu = educRepo.findById(id).orElse(null);
        return edu;
    }
    
}
