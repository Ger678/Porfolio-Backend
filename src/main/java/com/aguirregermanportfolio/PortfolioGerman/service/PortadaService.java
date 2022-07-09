/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aguirregermanportfolio.PortfolioGerman.service;

import com.aguirregermanportfolio.PortfolioGerman.model.Portada;
import com.aguirregermanportfolio.PortfolioGerman.repository.PortadaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author German
 */
@Service
public class PortadaService implements IPortadaService {
    
    @Autowired
    private PortadaRepository portRepository;
    
    
    // CRUD o ABML (Alta, Baja, Modificacion, Lectura)
    @Override
    public List<Portada> getPortada() {
        List<Portada> listaPortadas = portRepository.findAll();
        return listaPortadas;
    }

    @Override
    public void savePortada(Portada port) {
        portRepository.save(port);
    }

    @Override
    public void deletePortada(Long id) {
        portRepository.deleteById(id);
    }

    @Override
    public Portada findPortada(Long id) {
        Portada port = portRepository.findById(id).orElse(null);
        return port;
    }
}
