/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aguirregermanportfolio.PortfolioGerman.controller;

import com.aguirregermanportfolio.PortfolioGerman.model.Experiencia;
import com.aguirregermanportfolio.PortfolioGerman.service.IExperienciaService;
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
@RequestMapping ("/experiencia") 
public class ExperienciaController {
    
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
    public String deleteExperiencia(@PathVariable Long id){
        interExperiencia.deleteExperiencia(id);
        return " ";
    }
    
    @PutMapping ("/editar/{id}")
    public Experiencia editExperiencia (@PathVariable Long id,
                                               @RequestParam ("titulo") String nuevoTitulo,
                                               @RequestParam ("contenido") String nuevoContenido,
                                               @RequestParam ("icono") String nuevoIcono){
        
        Experiencia expe = interExperiencia.findExperiencia(id);
        
        expe.setTitulo(nuevoTitulo);
        expe.setContenido(nuevoContenido);
        expe.setIcono(nuevoIcono);
        
        interExperiencia.saveExperiencia(expe);
        return expe;        
    }
    
}
