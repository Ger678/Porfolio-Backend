/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aguirregermanportfolio.PortfolioGerman.service;

import com.aguirregermanportfolio.PortfolioGerman.model.Proyectos;
import com.aguirregermanportfolio.PortfolioGerman.repository.ProyectosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author German
 */
@Service
public class ProyectosService implements IProyectosService {

    @Autowired
    private ProyectosRepository proyRepository;    
    
    @Override
    public List<Proyectos> getProyectos() {
        List<Proyectos> listaProy = proyRepository.findAll();
        return listaProy;
    }

    @Override
    public void saveProyectos(Proyectos proy) {
        proyRepository.save(proy);
    }

    @Override
    public void deleteProyectos(Long id) {
        proyRepository.deleteById(id);
    }

    @Override
    public Proyectos findProyectos(Long id) {
        Proyectos proy = proyRepository.findById(id).orElse(null);
        return proy;
    }
     

}
