/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aguirregermanportfolio.PortfolioGerman.controller;

import com.aguirregermanportfolio.PortfolioGerman.model.AcercaDeMi;
import com.aguirregermanportfolio.PortfolioGerman.service.AcercaDeMiService;
import com.aguirregermanportfolio.PortfolioGerman.service.IAcercaDeMiService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
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
    private AcercaDeMiService acercaService;
    
    @Autowired
    private IAcercaDeMiService interAcerca;
    
    @GetMapping ("/traer")
    @ResponseBody
    public List<AcercaDeMi> getAcercaDeMi(){
        List<AcercaDeMi> listaAcerca= interAcerca.getAcercaDeMi();
        return listaAcerca;
    }
    
    @PostMapping ("/crear")
    public String crearAcercaDeMi(@RequestBody AcercaDeMi acerca){
        interAcerca.saveAcercaDeMi(acerca);
        return "";
    }
    
    @DeleteMapping ("/delete/{id}")
    public ResponseEntity<?> deleteAcercaDeMi (@PathVariable("id") Long id){        
        acercaService.deleteAcercaDeMi(id);
        return new ResponseEntity<>(HttpStatus.OK);  
    }
        
    
    @PutMapping("/update/{id}")
    public ResponseEntity<AcercaDeMi> updatePortada(@PathVariable Long id, @RequestBody AcercaDeMi acerca) {
        AcercaDeMi updateAcerca = acercaService.updateAcercaDeMi(acerca);
        return new ResponseEntity<>(updateAcerca, HttpStatus.CREATED);
    }
}