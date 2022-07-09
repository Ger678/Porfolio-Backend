/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aguirregermanportfolio.PortfolioGerman.controller;

import com.aguirregermanportfolio.PortfolioGerman.model.Educacion;
import com.aguirregermanportfolio.PortfolioGerman.service.IEducacionService;
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
@RequestMapping ("/educacion")
public class EducacionController {
    
    @Autowired
    private IEducacionService interEduc;
    
    
    @GetMapping ("/traer")
    @ResponseBody
    public List<Educacion> getEducacion(){
        List<Educacion> listaEdu = interEduc.getEducacion();
        return listaEdu;
    }
    
    @PostMapping ("/crear")
    public String crearEducacion(@RequestBody Educacion educ){
        interEduc.saveEducacion(educ);
        return " ";
    }
    
    @DeleteMapping ("/delete/{id}")
    public String deleteEducacion(@PathVariable Long id){
        interEduc.findEducacion(id);
        return " ";        
    }
    
    @PutMapping ("/edit/{id}")
    public Educacion editEducacion(@PathVariable Long id,
                                   @RequestParam ("itemId") Long nuevoItemId,
                                   @RequestParam ("titulo") String nuevoTitulo,
                                   @RequestParam ("fecha") String nuevaFecha,
                                   @RequestParam ("icono") String nuevoIcono){
        
        Educacion educ = interEduc.findEducacion(id);
        
        educ.setItemId(id);
        educ.setTitulo(nuevoTitulo);
        educ.setFecha(nuevaFecha);
        educ.setIcono(nuevoIcono);
        
        interEduc.saveEducacion(educ);
        return educ;
    } 
}
