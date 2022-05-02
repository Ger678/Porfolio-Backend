/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aguirregermanportfolio.PortfolioGerman.controller;

import com.aguirregermanportfolio.PortfolioGerman.model.ExperienciaLaboral;
import com.aguirregermanportfolio.PortfolioGerman.model.service.IExperienciaLaboralService;
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
public class ExperienciaLaboralController {
    
    @Autowired
    private IExperienciaLaboralService interExperiencia;
    
    
    @GetMapping ("/traer")
    @ResponseBody
    public List<ExperienciaLaboral> traerExperiencia(){
        return interExperiencia.getExperiencia();
    }
    
    @PostMapping ("/crear")
    public String crearExperiencia(@RequestBody ExperienciaLaboral exp){
        interExperiencia.saveExperiencia(exp);
        return "  ";
    }
    
    @DeleteMapping ("/delete/{id}")
    public String deleteExperiencia(@PathVariable Long id){
        interExperiencia.deleteExperiencia(id);
        return " ";
    }
    
    @PutMapping ("/editar/{id}")
    public ExperienciaLaboral editExperiencia (@PathVariable Long id,
                                               @RequestParam ("puesto") String nuevoPuesto,
                                               @RequestParam ("nombreEmpresa") String nuevoNombreEmpresa,
                                               @RequestParam ("fechaInicio") String nuevaFechaInicio,
                                               @RequestParam ("fechaFinal") String nuevaFechaFinal,
                                               @RequestParam ("descripcion") String nuevaDescripcion){
        
        ExperienciaLaboral expe = interExperiencia.findExperiencia(id);
        
        expe.setPuesto(nuevoPuesto);
        expe.setNombreEmpresa(nuevoNombreEmpresa);
        expe.setFechaInicio(nuevaFechaInicio);
        expe.setFechaFinal(nuevaFechaFinal);
        expe.setDescripcion(nuevaDescripcion);
        
        interExperiencia.saveExperiencia(expe);
        return expe;        
    }
    
}
