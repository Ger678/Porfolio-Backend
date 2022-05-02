/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aguirregermanportfolio.PortfolioGerman.controller;

import com.aguirregermanportfolio.PortfolioGerman.model.Proyectos;
import com.aguirregermanportfolio.PortfolioGerman.model.service.IProyectosService;
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
@RequestMapping ("/proyectos")

public class ProyectosController {
    
    @Autowired
    private IProyectosService interProy;
    
    @GetMapping ("/traer")
    @ResponseBody
    public List<Proyectos> getProyectos(){
        List<Proyectos> listaProy = interProy.getProyectos();
        return listaProy;
    }
    
    @PostMapping ("/cear")
    public String crearProyectos(@RequestBody Proyectos proy){
        interProy.saveProyectos(proy);
        return "";
    }
    
    @DeleteMapping ("/delete/{id}")
    public String deleteProyectos (@PathVariable Long id){
        
        interProy.deleteProyectos(id);
        return "";    
    }
    
    @PutMapping ("/edit/{id}")
    public Proyectos editProyectos (@PathVariable Long id,
                                    @RequestParam ("nombre") String nuevoNombre,
                                    @RequestParam ("descripcion") String nuevaDescripcion,
                                    @RequestParam ("urlImagen") String nuevaUrlImagen,
                                    @RequestParam ("urlProyecto") String nuevaUrlProyecto){
        
        Proyectos proy = interProy.findProyectos(id);
        
        proy.setNombre(nuevoNombre);
        proy.setDescripcion(nuevaDescripcion);
        proy.setUrlImagen(nuevaUrlImagen);
        proy.setUrlProyecto(nuevaUrlProyecto);
        
        interProy.saveProyectos(proy);
        return proy;        
    }       
}