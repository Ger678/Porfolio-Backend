/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aguirregermanportfolio.PortfolioGerman.controller;

import com.aguirregermanportfolio.PortfolioGerman.model.Persona;
import com.aguirregermanportfolio.PortfolioGerman.service.IPersonaService;
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
@RequestMapping ("/persona")

public class PersonaController {
    
    @Autowired
    private IPersonaService interPersona;
    
    @GetMapping ("/traer")
    @ResponseBody
    public List<Persona> getPersonas(){
        return interPersona.getPersona();
    }
    
    @PostMapping ("crear")
    public String crearPersona(@RequestBody Persona perso){
        interPersona.savePersona(perso);
        return "La persona fue creada correctamente";
    }
    
    @DeleteMapping ("/borrar/{id}")
    public String deletePersona(@PathVariable Long id){
        interPersona.deletePersona(id);
        return "La persona fue correctamente eliminada";
    }
    
    @PutMapping ("/editar/{id}")
    public Persona editPersona(@PathVariable Long id,
                               @RequestParam ("nombre") String nuevoNombre,
                               @RequestParam ("apellido") String nuevoApellido,
                               @RequestParam ("edad") int nuevaEdad){
        
        Persona perso = interPersona.findPersona(id);
        
        perso.setApellido(nuevoApellido);
        perso.setNombre(nuevoNombre);
        perso.setEdad(nuevaEdad);
        
        interPersona.savePersona(perso);        
        return perso;
    }
    
    
}