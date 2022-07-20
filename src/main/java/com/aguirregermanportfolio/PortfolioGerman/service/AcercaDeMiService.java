/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aguirregermanportfolio.PortfolioGerman.service;

import com.aguirregermanportfolio.PortfolioGerman.model.AcercaDeMi;
import com.aguirregermanportfolio.PortfolioGerman.repository.AcercaDeMiRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author German
 */
@Service
public class AcercaDeMiService implements IAcercaDeMiService {

    @Autowired
    private AcercaDeMiRepository acercaRepository;    
    
    @Override
    public List<AcercaDeMi> getAcercaDeMi() {
        List<AcercaDeMi> listaAcerca = acercaRepository.findAll();
        return listaAcerca;
    }

    @Override
    public void saveAcercaDeMi(AcercaDeMi acerca) {
        acercaRepository.save(acerca);
    }

    @Override
    public void deleteAcercaDeMi(Long id) {
        acercaRepository.deleteById(id);
    }
    
    public AcercaDeMi updateAcercaDeMi(AcercaDeMi acerca) {
        return acercaRepository.save(acerca);
    }

    @Override
    public AcercaDeMi findAcercaDeMi(Long id) {
        AcercaDeMi acerca = acercaRepository.findById(id).orElse(null);
        return acerca;
    }
     

}
