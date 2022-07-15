/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aguirregermanportfolio.PortfolioGerman.controller;

import com.aguirregermanportfolio.PortfolioGerman.model.Portada;
import com.aguirregermanportfolio.PortfolioGerman.service.IPortadaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
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
@RequestMapping ("/portada")
@CrossOrigin
public class PortadaController {
    
    @Autowired
    private IPortadaService interPortada;
    
    @GetMapping ("/traer")
    @ResponseBody
    public List<Portada> getPortada(){
        return interPortada.getPortada();
    }
    
    @PostMapping ("crear")
    public String crearPortada(@RequestBody Portada port){
        interPortada.savePortada(port);
        return "La Portada fue creada correctamente";
    }
    
    @DeleteMapping ("/borrar/{id}")
    public String deletePortada(@PathVariable Long id){
        interPortada.deletePortada(id);
        return "La Portada fue correctamente eliminada";
    }
    
    @PutMapping ("/editar/{id}")
    public Portada editPortada(@PathVariable Long id,
                               @RequestParam ("nombre") String nuevoNombre,
                               @RequestParam ("apellido") String nuevoApellido,
                               @RequestParam ("perfilUrl") String nuevoPerfil,
                               @RequestParam ("portadaUrl") String nuevaPortada,
                               @RequestParam ("contenido") String nuevoContenido){
        
        Portada port = interPortada.findPortada(id);
        
        port.setApellido(nuevoApellido);
        port.setNombre(nuevoNombre);
        port.setPerfilUrl(nuevoPerfil);
        port.setPortadaUrl(nuevaPortada);
        port.setContenido(nuevoContenido);
        
        
        interPortada.savePortada(port);        
        return port;
    }
    
    
}