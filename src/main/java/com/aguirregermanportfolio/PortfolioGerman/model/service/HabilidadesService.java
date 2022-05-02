/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aguirregermanportfolio.PortfolioGerman.model.service;

import com.aguirregermanportfolio.PortfolioGerman.model.Habilidades;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author German
 */
public class HabilidadesService implements IHabilidadesService {

    @Autowired
    private IHabilidadesService interHab;
    
    @Override
    public List<Habilidades> getHabilidades() {
        List<Habilidades> listaHab = interHab.getHabilidades();
        return listaHab;
    }

    @Override
    public void saveHabilidades(Habilidades perso) {
        interHab.saveHabilidades(perso);
    }

    @Override
    public void deleteHabilidades(Long id) {
        interHab.deleteHabilidades(id);
    }

    @Override
    public Habilidades findHabilidades(Long id) {
        Habilidades hab = interHab.findHabilidades(id);
        return hab; 
    }
    
}
