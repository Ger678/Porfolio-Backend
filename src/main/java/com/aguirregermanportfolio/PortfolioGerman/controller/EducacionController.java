/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aguirregermanportfolio.PortfolioGerman.controller;

import com.aguirregermanportfolio.PortfolioGerman.model.Educacion;
import com.aguirregermanportfolio.PortfolioGerman.service.EducacionService;
import com.aguirregermanportfolio.PortfolioGerman.service.IEducacionService;
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
@RequestMapping ("/educacion")
public class EducacionController {
    
    @Autowired
    private EducacionService educService;
    
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
    public ResponseEntity<?> deleteEducacion(@PathVariable("id") Long id){
        educService.deleteEducacion(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
    @PutMapping("/update/{id}")
    public ResponseEntity<Educacion> updateEducacion(@PathVariable Long id, @RequestBody Educacion educ) {
        Educacion updateEduc = educService.updateEduc(educ);
        return new ResponseEntity<>(updateEduc, HttpStatus.CREATED);
    }    
}
