/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aguirregermanportfolio.PortfolioGerman.controller;

import com.aguirregermanportfolio.PortfolioGerman.model.Persona;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author German
 */
@RestController
public class Controladora {
    
    List<Persona> listaPersonas = new ArrayList();
    
    // Metodo Get con la annotation @PathVariable "/hola/German/25/Programacion"
    
    @GetMapping ("/hola/{nombre}/{edad}/{profesion}")
    public String decirHola(@PathVariable String nombre,
                            @PathVariable int edad,
                            @PathVariable String profesion){
        return "Hola " + nombre + " tu edad es " + edad + " trabajas de " + profesion;
    }
    
    // Metodo Get con la annotation @RequestParam "/aeo?juego=AgeOfEmpires&dificultad=50&recomendado=true"
    @GetMapping ("/aeo")
    public String ageOfEmpires(@RequestParam String juego,
                               @RequestParam int dificultad,
                               @RequestParam boolean recomendado){
        return "Tu juego es: " + juego + " Nivel de dificultad: " + dificultad + " Lo recomendas? " + recomendado ;
    }
    
    // Metodo Post con la annotation @RequestBody 
    @PostMapping ("/new/persona")  
    public void agregarPersonas(@RequestBody Persona pers){
        listaPersonas.add(pers);
    }
    
    // Acá devuelve con un formato de @ResponseBody en el cuerpo de la respuesta
    @GetMapping ("/ver/personas")
    @ResponseBody
    public List<Persona> verPersonas(){
        return listaPersonas;
    }
    
}
