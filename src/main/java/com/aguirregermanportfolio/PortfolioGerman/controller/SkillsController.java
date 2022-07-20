/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aguirregermanportfolio.PortfolioGerman.controller;

import com.aguirregermanportfolio.PortfolioGerman.model.Skills;
import com.aguirregermanportfolio.PortfolioGerman.service.ISkillsService;
import com.aguirregermanportfolio.PortfolioGerman.service.SkillsService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
@RequestMapping ("/skills")
@CrossOrigin
public class SkillsController {
    
    @Autowired
    private SkillsService skiService;
    
    @Autowired
    private ISkillsService interSki;
    
    @GetMapping ("/traer")
    @ResponseBody
    public List<Skills> getSkills(){
        List<Skills> listaSki = interSki.getSkills();
        return listaSki;
    }
    
    @PostMapping ("/crear")
    public String crearSkills(@RequestBody Skills ski){
        interSki.saveSkills(ski);
        return "Skill agregada";
    }
    
    @DeleteMapping ("/delete/{id}")
    public String deleteSkills (@PathVariable Long id){
        interSki.deleteSkills(id);
        return " ";
    }
    
    @GetMapping ("/traer/{id}")
    @ResponseBody
    public Skills traerPorId (@PathVariable Long id) {
        Skills skiXId =  interSki.findSkills(id);
        return skiXId;
    }
    
    @PutMapping ("/edit/{id}")
    public Skills editSkills(@PathVariable Long id,
                                       @RequestParam ("icono") String nuevoIcono,
                                       @RequestParam ("nombre") String nuevoNombre,
                                       @RequestParam ("descripcion") String nuevaDescripcion,
                                       @RequestParam ("fotos") String nuevasFotos,
                                       @RequestParam ("porcentaje") Long nuevoPorcentaje){
        
        Skills ski = interSki.findSkills(id);
        
        ski.setIcono(nuevoIcono);
        ski.setNombre(nuevoNombre);
        ski.setDescripcion(nuevaDescripcion);
        ski.setFotos(nuevasFotos);
        ski.setPorcentaje(nuevoPorcentaje);
                
        interSki.saveSkills(ski);
        return ski;            
    }
    
    @PutMapping ("/update/{id}")
    public ResponseEntity<Skills> updateSkills(@PathVariable Long id, @RequestBody Skills ski){
        Skills updateSki = skiService.updateSkill(ski);
        return new ResponseEntity<>(updateSki, HttpStatus.CREATED);
    }
    
}
