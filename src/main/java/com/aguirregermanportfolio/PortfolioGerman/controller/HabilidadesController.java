/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aguirregermanportfolio.PortfolioGerman.controller;

import com.aguirregermanportfolio.PortfolioGerman.model.Habilidades;
import com.aguirregermanportfolio.PortfolioGerman.service.IHabilidadesService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
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
@RequestMapping ("/habilidades")
public class HabilidadesController {
    
    @Autowired
    @Lazy
    private IHabilidadesService interHab;
    
    @GetMapping ("/traer")
    @ResponseBody
    public List<Habilidades> getHabilidades(){
        List<Habilidades> listaHab = interHab.getHabilidades();
        return listaHab;
    }
    
    @PostMapping ("/crear")
    public String crearHabilidades(@RequestBody Habilidades habi){
        interHab.saveHabilidades(habi);
        return " ";
    }
    
    @DeleteMapping ("/delete/{id}")
    public String deleteHabilidades (@PathVariable Long id){
        interHab.deleteHabilidades(id);
        return " ";
    }
    
    @PutMapping ("/edit/{id}")
    public Habilidades editHabilidades(@PathVariable Long id,
                                       @RequestParam String habilidad,
                                       @RequestParam String porcentaje){
        
        Habilidades habi = interHab.findHabilidades(id);
        
        habi.setHabilidad(habilidad);
        habi.setPorcentaje(porcentaje);
        
        interHab.saveHabilidades(habi);
        return habi;            
    }
    
}
