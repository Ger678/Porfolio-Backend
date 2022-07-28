/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aguirregermanportfolio.PortfolioGerman.controller;

import com.aguirregermanportfolio.PortfolioGerman.model.Experiencia;
import com.aguirregermanportfolio.PortfolioGerman.service.ExperienciaService;
import com.aguirregermanportfolio.PortfolioGerman.service.IExperienciaService;
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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author German
 */
@RestController
@RequestMapping ("/experiencia") 
public class ExperienciaController {
    
    @Autowired
    private ExperienciaService expeService;
    
    @Autowired
    private IExperienciaService interExperiencia;
    
    
    @GetMapping ("/traer")
    @ResponseBody
    public List<Experiencia> traerExperiencia(){
        return interExperiencia.getExperiencia();
    }
    
    @PostMapping ("/crear")
    public String crearExperiencia(@RequestBody Experiencia exp){
        interExperiencia.saveExperiencia(exp);
        return "  ";
    }
    
    @DeleteMapping ("/delete/{id}")
    public ResponseEntity<?> deleteAcercaDeMi (@PathVariable("id") Long id){        
        expeService.deleteExperiencia(id);
        return new ResponseEntity<>(HttpStatus.OK); 
    }
    
    
    @PutMapping("/update/{id}")
    public ResponseEntity<Experiencia> updateExperiencia(@PathVariable Long id, @RequestBody Experiencia expe) {
        Experiencia updateExpe = expeService.updateExpe(expe);
        return new ResponseEntity<>(updateExpe, HttpStatus.CREATED);
    }
    
    
}
