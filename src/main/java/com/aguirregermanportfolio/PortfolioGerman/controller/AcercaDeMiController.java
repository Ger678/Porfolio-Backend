/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aguirregermanportfolio.PortfolioGerman.controller;

import com.aguirregermanportfolio.PortfolioGerman.model.AcercaDeMi;
import com.aguirregermanportfolio.PortfolioGerman.service.IAcercaDeMiService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author German
 */
@RestController
@RequestMapping ("/acerca")

public class AcercaDeMiController {
    
    @Autowired
    private IAcercaDeMiService interAcerca;
    
    @GetMapping ("/traer")
    @ResponseBody
    public List<AcercaDeMi> getAcercaDeMi(){
        List<AcercaDeMi> listaAcerca= interAcerca.getAcercaDeMi();
        return listaAcerca;
    }
    
    @PostMapping ("/cear")
    public String crearAcercaDeMi(@RequestBody AcercaDeMi acerca){
        interAcerca.saveAcercaDeMi(acerca);
        return "";
    }
    
    @DeleteMapping ("/delete/{id}")
    public String deleteAcercaDeMi (@PathVariable Long id){
        
        interAcerca.deleteAcercaDeMi(id);
        return "";    
    }
    
    @PutMapping ("/edit/{id}")
    public AcercaDeMi editAcerca (@PathVariable Long id,
                                    @RequestParam ("titulo") String nuevoTitulo,
                                    @RequestParam ("contenido") String nuevaContenido,
                                    @RequestParam ("icono") String nuevaIcono ) 
        
        {
        
        AcercaDeMi acerca = interAcerca.findAcercaDeMi(id);
        
        acerca.setTitulo(nuevoTitulo);
        acerca.setContenido(nuevaContenido);
        acerca.setIcono(nuevaIcono);
        
        interAcerca.saveAcercaDeMi(acerca);
        return acerca;        
    }       
}